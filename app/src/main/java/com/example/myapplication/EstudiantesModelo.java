package com.example.myapplication;

public class EstudiantesModelo {

    private String nombres, apellidos, carne, carrera;

    public EstudiantesModelo() {
    }

    public EstudiantesModelo(String nombres, String apellidos, String carne, String carrera) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carne = carne;
        this.carrera = carrera;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}



