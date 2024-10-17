package com.example.mvcsamalexiapro.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="notas")
public class Notas {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_nota;

     @Column(name = "calificacion", nullable = true, columnDefinition = "double")
    private Double calificacion;

    @Column(name = "fecha", nullable = true, columnDefinition = "date")
    private Date fecha;

    @Column(name = "estado", nullable = true, columnDefinition = "varchar(15)")
    private String estado;

    @Column(name = "periodo", nullable = true, columnDefinition = "int(1)")
    private Integer periodo;

    @Column(name = "descripcion", nullable = true, columnDefinition = "varchar(15)")
    private String descripcion;

      public long getId_nota() {
        return id_nota;
    }

    public void setId_nota(long id_nota) {
        this.id_nota = id_nota;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Notas() {
    }

    public Notas(long id_nota, Double calificacion, Date fecha, String estado, Integer periodo, String descripcion) {
        this.id_nota = id_nota;
        this.calificacion = calificacion;
        this.fecha = fecha;
        this.estado = estado;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Materia materia;
}
