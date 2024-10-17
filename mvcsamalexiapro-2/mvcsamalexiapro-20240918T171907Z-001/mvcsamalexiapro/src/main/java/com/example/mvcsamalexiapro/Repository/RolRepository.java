package com.example.mvcsamalexiapro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvcsamalexiapro.Entity.Rol;

public interface RolRepository extends JpaRepository<Rol,Long> {
    
}