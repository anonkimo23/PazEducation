package com.example.mvcsamalexiapro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="materias")
public class Materia {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_materia;

    @Column(name = "area", nullable = true, columnDefinition = "varchar(50)")
    private String area;

    @Column(name = "materia", nullable = true, columnDefinition =  "varchar(50)")
    private String materia;

    @Column(name = "intensidad_Horaria", nullable = true, columnDefinition =  "int(2)")
    private Integer intensidadHoraria;

    public Materia(long id_materia, String area, String materia, Integer intensidadHoraria) {
        this.id_materia = id_materia;
        this.area = area;
        this.materia = materia;
        this.intensidadHoraria = intensidadHoraria;
    }

    public Materia() {
    }

    public long getId_materia() {
        return id_materia;
    }

    public void setId_materia(long id_materia) {
        this.id_materia = id_materia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getIntensidadHoraria() {
        return intensidadHoraria;
    }

    public void setIntensidadHoraria(Integer intensidadHoraria) {
        this.intensidadHoraria = intensidadHoraria;
    }

}
