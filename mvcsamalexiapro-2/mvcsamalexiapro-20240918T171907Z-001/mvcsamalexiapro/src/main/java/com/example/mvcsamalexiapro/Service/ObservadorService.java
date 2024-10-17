package com.example.mvcsamalexiapro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvcsamalexiapro.Entity.Observador;
import com.example.mvcsamalexiapro.Repository.ObservadorRepository;

@Service
public class ObservadorService {

    private final ObservadorRepository observadorRepository;

    @Autowired
    public ObservadorService(ObservadorRepository observadorRepository) {
        this.observadorRepository = observadorRepository;
    }

    public void saveOrUpdate(Observador observador) {
        if (observador == null) {
            throw new IllegalArgumentException("El objeto Observador no puede ser nulo");
        }
        observadorRepository.save(observador);
    }

    public List<Observador> getAllObservadores() {
        return observadorRepository.findAll();
    }

    public Observador getObservadorById(Long id) {
        return observadorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Observador con id " + id + " no encontrado"));
    }

    public void deleteObservador(Long id) {
        if (!observadorRepository.existsById(id)) {
            throw new IllegalArgumentException("Observador con id " + id + " no existe");
        }
        observadorRepository.deleteById(id);
    }
}
