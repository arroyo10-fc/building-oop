package org.ies.building.model;

import java.util.Objects;
import java.util.Scanner;

public class Edificio {
    private String direccion;
    private String municipio;
    private Apartamento apartamentos;

    public Edificio(String direccion, String municipio, Apartamento apartamentos) {
        this.direccion = direccion;
        this.municipio = municipio;
        this.apartamentos = apartamentos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Apartamento getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(Apartamento apartamentos) {
        this.apartamentos = apartamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edificio edificio = (Edificio) o;
        return Objects.equals(direccion, edificio.direccion) && Objects.equals(municipio, edificio.municipio) && Objects.equals(apartamentos, edificio.apartamentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion, municipio, apartamentos);
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "direccion='" + direccion + '\'' +
                ", municipio='" + municipio + '\'' +
                ", apartamentos=" + apartamentos +
                '}';
    }
}