package com.example.mvcsamalexiapro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvcsamalexiapro.Entity.DatosAdicionales;
import com.example.mvcsamalexiapro.Repository.DatosAdicionalesRepository;

@Service
public class DatosAdicionalesService {

    private final DatosAdicionalesRepository datosAdicionalesRepository;

    @Autowired
    public DatosAdicionalesService(DatosAdicionalesRepository datosAdicionalesRepository) {
        this.datosAdicionalesRepository = datosAdicionalesRepository;
    }

    public void saveOrUpdate(DatosAdicionales datosAdicionales) {
        if (datosAdicionales == null) {
            throw new IllegalArgumentException("El objeto DatosAdicionales no puede ser nulo");
        }
        datosAdicionalesRepository.save(datosAdicionales);
    }

    public List<DatosAdicionales> getAllDatosAdicionales() {
        return datosAdicionalesRepository.findAll();
    }

    public DatosAdicionales getDatosAdicionalesById(Long id) {
        return datosAdicionalesRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("DatosAdicionales con id " + id + " no encontrado"));
    }

    public void deleteDatosAdicionales(Long id) {
        if (!datosAdicionalesRepository.existsById(id)) {
            throw new IllegalArgumentException("DatosAdicionales con id " + id + " no existe");
        }
        datosAdicionalesRepository.deleteById(id);
    }
}

