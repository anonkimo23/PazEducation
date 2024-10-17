package com.example.mvcsamalexiapro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvcsamalexiapro.Entity.Curso;
import com.example.mvcsamalexiapro.Repository.CursoRepository;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    @Autowired
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public void saveOrUpdate(Curso curso) {
        if (curso == null) {
            throw new IllegalArgumentException("El objeto Curso no puede ser nulo");
        }
        cursoRepository.save(curso);
    }

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Curso getCursoById(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Curso con id " + id + " no encontrado"));
    }

    public void deleteCurso(Long id) {
        if (!cursoRepository.existsById(id)) {
            throw new IllegalArgumentException("Curso con id " + id + " no existe");
        }
        cursoRepository.deleteById(id);
    }
}
