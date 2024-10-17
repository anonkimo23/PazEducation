package com.example.mvcsamalexiapro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="usuarios")
public class Usuario {
         @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_usuario;

    @Column(name = "nombre", nullable = true, columnDefinition = "varchar(50)")
    private String nombre;

    @Column(name = "documento", nullable = true, columnDefinition = "varchar(50)")
    private String documento;

    @Column(name = "correo", nullable = true, columnDefinition = "varchar(50)")
    private String correo;

    @Column(name = "telefono", nullable = true, columnDefinition = "varchar(50)")
    private String telefono;

    public Usuario() {
    }

    public Usuario(long id_usuario, String nombre, String documento, String correo, String telefono) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.telefono = telefono;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
