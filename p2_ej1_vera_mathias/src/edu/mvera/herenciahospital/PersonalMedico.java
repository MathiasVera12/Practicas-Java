package edu.mvera.herenciahospital;

public class PersonalMedico {
    private String nombre;
    private int edad;
    private int cedula;
    private String id;
    private String casado;
    private int resistencia;

    public PersonalMedico() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String Casado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int salud(){
        return this.resistencia/this.edad;
    }
}
