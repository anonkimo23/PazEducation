package com.example.mvcsamalexiapro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvcsamalexiapro.Entity.Curso;

public interface CursoRepository  extends JpaRepository<Curso, Long>{
    
}