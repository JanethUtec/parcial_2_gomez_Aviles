package com.example.aviles_gomez_parcial_2.entity;

public class Empleado {

    private String empleado;

    private String cargo;

    private String compania;

    private int fotografia;

    public Empleado(String empleado, String cargo, String compania, int fotografia) {
        this.empleado = empleado;
        this.cargo = cargo;
        this.compania = compania;
        this.fotografia = fotografia;
    }

    public Empleado(){

    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getFotografia() {
        return fotografia;
    }

    public void setFotografia(int fotografia) {
        this.fotografia = fotografia;
    }
}
