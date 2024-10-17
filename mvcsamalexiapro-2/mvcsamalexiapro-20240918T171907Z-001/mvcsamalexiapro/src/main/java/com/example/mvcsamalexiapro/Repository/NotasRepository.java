package com.example.mvcsamalexiapro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvcsamalexiapro.Entity.Notas;

public interface NotasRepository extends JpaRepository<Notas,Long> {
    
}