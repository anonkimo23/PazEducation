package com.example.mvcsamalexiapro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvcsamalexiapro.Entity.Materia;

public interface MateriaRepository extends JpaRepository<Materia,Long>{
    
}