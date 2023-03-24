package com.basedatos.basededatos.models;

import jakarta.persistence.*;
@Entity
@Table(schema = "profile_two")
public class GasolineraModel {
    @Id
    @Column(name = "id",updatable = false, nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nombre_gasolinera")
    private String nombreGasolinera;
    @Column(name = "ubicacion")
    private String ubicacion;
    @Column(name = "activa")
    private boolean activa;
    @Column(name = "total_gasolineras")
    private String totalGasolineras;
    @Column(name = "telefono")
    private String telefono;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreGasolinera() {
        return nombreGasolinera;
    }

    public void setNombreGasolinera(String nombreGasolinera) {
        this.nombreGasolinera = nombreGasolinera;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean getActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String getTotalGasolineras() {
        return totalGasolineras;
    }

    public void setTotalGasolineras(String totalGasolineras) {
        this.totalGasolineras = totalGasolineras;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
