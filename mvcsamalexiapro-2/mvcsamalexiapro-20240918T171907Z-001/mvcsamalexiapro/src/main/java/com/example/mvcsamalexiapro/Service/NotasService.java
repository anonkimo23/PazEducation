package com.example.mvcsamalexiapro.Service;

import java.util.List; // Corregido: Importar desde java.util

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvcsamalexiapro.Entity.Notas;
import com.example.mvcsamalexiapro.Repository.NotasRepository;

@Service
public class NotasService {

    private final NotasRepository notasRepository;

    @Autowired
    public NotasService(NotasRepository notasRepository) {
        this.notasRepository = notasRepository;
    }

    public void saveOrUpdate(Notas notas) {
        if (notas == null) {
            throw new IllegalArgumentException("El objeto Notas no puede ser nulo"); // Mensaje actualizado
        }
        notasRepository.save(notas);
    }

    public List<Notas> getNotas() {
        return notasRepository.findAll();
    }
}
