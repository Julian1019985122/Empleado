package com.example.Empleado.Empleado;

public class Empleado {

    private int cedula;
    private String nombre;
    private String apellido;
    private String cargo;
    private float salario;
    private int[] extras_nocturnas = new int[5];
    private int[] extras_festivas = new int[5];
    private int[] ventas = new int[5];
    private float comision;
    private float total;

    public Empleado(int cedula, String nombre, String apellido, String cargo, float salario, int[] extras_nocturnas, int[] extras_festivas, int[] ventas) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.extras_nocturnas = extras_nocturnas;
        this.extras_festivas = extras_festivas;
        this.ventas = ventas;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int[] getExtras_nocturnas() {
        return extras_nocturnas;
    }

    public void setExtras_nocturnas(int[] extras_nocturnas) {
        this.extras_nocturnas = extras_nocturnas;
    }

    public int[] getExtras_festivas() {
        return extras_festivas;
    }

    public void setExtras_festivas(int[] extras_festivas) {
        this.extras_festivas = extras_festivas;
    }

    public int[] getVentas() {
        return ventas;
    }

    public void setVentas(int[] ventas) {
        this.ventas = ventas;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
