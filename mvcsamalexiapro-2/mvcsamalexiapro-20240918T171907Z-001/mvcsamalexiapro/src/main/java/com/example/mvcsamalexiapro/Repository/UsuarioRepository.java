package com.example.mvcsamalexiapro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvcsamalexiapro.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    
}