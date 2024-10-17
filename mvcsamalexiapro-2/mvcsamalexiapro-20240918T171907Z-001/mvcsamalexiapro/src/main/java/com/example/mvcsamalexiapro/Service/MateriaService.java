package com.example.mvcsamalexiapro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvcsamalexiapro.Entity.Materia;
import com.example.mvcsamalexiapro.Repository.MateriaRepository;

@Service
public class MateriaService {

    private final MateriaRepository materiaRepository;

    @Autowired
    public MateriaService(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    public void saveOrUpdate(Materia materia) {
        if (materia == null) {
            throw new IllegalArgumentException("El objeto Materia no puede ser nulo");
        }
        materiaRepository.save(materia);
    }

    public List<Materia> getAllMaterias() {
        return materiaRepository.findAll();
    }

    public Materia getMateriaById(Long id) {
        return materiaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Materia con id " + id + " no encontrada"));
    }

    public void deleteMateria(Long id) {
        if (!materiaRepository.existsById(id)) {
            throw new IllegalArgumentException("Materia con id " + id + " no existe");
        }
        materiaRepository.deleteById(id);
    }
}
