package com.example.mvcsamalexiapro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvcsamalexiapro.Entity.Observador;

public interface ObservadorRepository extends JpaRepository<Observador, Long> {
    
}