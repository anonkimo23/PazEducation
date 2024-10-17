package com.example.mvcsamalexiapro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvcsamalexiapro.Entity.Rol;
import com.example.mvcsamalexiapro.Repository.RolRepository;

@Service
public class RolService {

    private final RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public void saveOrUpdate(Rol rol) {
        if (rol == null) {
            throw new IllegalArgumentException("El objeto Rol no puede ser nulo");
        }
        rolRepository.save(rol);
    }

    public List<Rol> getAllRoles() {
        return rolRepository.findAll();
    }

    public Rol getRolById(Long id) {
        return rolRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Rol con id " + id + " no encontrado"));
    }

    public void deleteRol(Long id) {
        if (!rolRepository.existsById(id)) {
            throw new IllegalArgumentException("Rol con id " + id + " no existe");
        }
        rolRepository.deleteById(id);
    }
}
