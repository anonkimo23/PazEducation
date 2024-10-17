package com.example.mvcsamalexiapro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_curso;

     @Column(name = "curso", nullable = true, columnDefinition = "varchar(4)")
    private String curso;

    @Column(name = "descripcion", nullable = true, columnDefinition = "varchar(50)")
    private String descripcion;

    public long getId_curso() {
        return id_curso;
    }

    public void setId_curso(long id_curso) {
        this.id_curso = id_curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Curso(long id_curso, String curso, String descripcion) {
        this.id_curso = id_curso;
        this.curso = curso;
        this.descripcion = descripcion;
    }

    public Curso() {
    }

}
