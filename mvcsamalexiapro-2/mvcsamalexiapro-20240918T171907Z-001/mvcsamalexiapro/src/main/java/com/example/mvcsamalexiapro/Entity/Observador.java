package com.example.mvcsamalexiapro.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="observaciones")
public class Observador {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_observacion;

    @Column(name = "docente", nullable = true, columnDefinition = "varchar(50)")
    private String docente;

    @Column(name = "tipo", nullable = true, columnDefinition = "varchar(15)")
    private String tipo;

    @Column(name = "fecha", nullable = true, columnDefinition = "date")
    private Date fecha;

    @Column(name = "descripcion", nullable = true, columnDefinition = "varchar(200)")
    private String descripcion;

    public long getId_observacion() {
        return id_observacion;
    }

    public void setId_observacion(long id_observacion) {
        this.id_observacion = id_observacion;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Observador() {
    }

    public Observador(long id_observacion, String docente, String tipo, Date fecha, String descripcion) {
        this.id_observacion = id_observacion;
        this.docente = docente;
        this.tipo = tipo;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
}
