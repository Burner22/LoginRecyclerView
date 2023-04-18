package com.lospibescompany.loginrecyclerview;

import java.time.LocalDateTime;

public class Actividad {
    private String nombre;
    private String descripcion;
    private LocalDateTime fecha;
    private String lugar;
    private String fechita;
    private String hora;

    public Actividad(String nombre, String descripcion, String fechita, String hora, String lugar) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechita = fechita;
        this.hora = hora;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }



    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFechita() {
        return fechita;
    }
}

