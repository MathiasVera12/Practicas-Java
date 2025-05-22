package edu.mvera.herenciahospital;

public class Enfermera extends PersonalMedico{
    private int hentrada;
    private int hsalida;0
    private String cursos;

    public Enfermera() {

    }

    public int getHentrada() {
        return hentrada;
    }

    public void setHentrada(int hentrada) {
        this.hentrada = hentrada;
    }

    public int getHsalida() {
        return hsalida;
    }

    public void setHsalida(int hsalida) {
        this.hsalida = hsalida;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }
}
