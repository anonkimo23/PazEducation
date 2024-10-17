package com.example.mvcsamalexiapro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvcsamalexiapro.Entity.DatosAdicionales;

public interface DatosAdicionalesRepository  extends JpaRepository<DatosAdicionales,Long>{
    
}