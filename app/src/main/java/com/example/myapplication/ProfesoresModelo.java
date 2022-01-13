package com.example.myapplication;

public class ProfesoresModelo {

    private String nombresProf, apellidosProf, ID, facultad;

    public ProfesoresModelo() {
    }

    public ProfesoresModelo(String nombresProf, String apellidosProf, String ID, String facultad) {
        this.nombresProf = nombresProf;
        this.apellidosProf = apellidosProf;
        this.ID = ID;
        this.facultad = facultad;
    }

    public String getNombresProf() {
        return nombresProf;
    }

    public void setNombresProf(String nombresProf) {
        this.nombresProf = nombresProf;
    }

    public String getApellidosProd() {
        return apellidosProf;
    }

    public void setApellidosProf(String apellidosProf) {
        this.apellidosProf = apellidosProf;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}

