package com.example.mvcsamalexiapro.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="datos_adicionales")
public class DatosAdicionales {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_datos;

     @Column(name = "fecha_nacimiento", nullable = true, columnDefinition = "date")
    private Date fechaNacimiento;

    @Column(name = "eps", nullable = true, columnDefinition = "varchar(15)")
    private String eps;

    @Column(name = "grupo_sanguineo", nullable = true, columnDefinition = "varchar(3)")
    private String grupoSanguineo;

    @Column(name =  "acudiente", nullable = true, columnDefinition = "varchar(50)")
    private String acudiente;

    public long getId_datos() {
        return id_datos;
    }

    public void setId_datos(long id_datos) {
        this.id_datos = id_datos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(String acudiente) {
        this.acudiente = acudiente;
    }

    public DatosAdicionales() {
    }

    public DatosAdicionales(long id_datos, Date fechaNacimiento, String eps, String grupoSanguineo, String acudiente) {
        this.id_datos = id_datos;
        this.fechaNacimiento = fechaNacimiento;
        this.eps = eps;
        this.grupoSanguineo = grupoSanguineo;
        this.acudiente = acudiente;
    }

    @OneToOne
    private Usuario usuario;
}
