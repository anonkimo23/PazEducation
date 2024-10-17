package com.example.mvcsamalexiapro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class Rol {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_rol;

     @Column(name = "nombre_rol", nullable = true, columnDefinition = "varchar(15)")
    private String nombre_rol;

    @Column(name = "descripcion_rol", nullable = true, columnDefinition = "varchar(50)")
    private String descripcion_rol;

    public Rol(long id_rol, String nombre_rol, String descripcion_rol) {
        this.id_rol = id_rol;
        this.nombre_rol = nombre_rol;
        this.descripcion_rol = descripcion_rol;
    }

    public Rol() {
    }

    public long getId_rol() {
        return id_rol;
    }

    public void setId_rol(long id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public String getDescripcion_rol() {
        return descripcion_rol;
    }

    public void setDescripcion_rol(String descripcion_rol) {
        this.descripcion_rol = descripcion_rol;
    }

}
