package udla.mvera.salaemergencias;

public class Paciente implements Comparable<Paciente> {
    String name;
    Gravedad gravedad;

    public Paciente(String name, Gravedad gavedad) {
        this.name = name;
        this.gravedad = gavedad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gravedad getGravedad() {
        return gravedad;
    }

    public void setGravedad(Gravedad gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public int compareTo(Paciente paciente) {
        int nivelActual = this.gravedad.getNivel();
        int comparaNivel = paciente.gravedad.getNivel();
        return nivelActual - comparaNivel; // cambiar el orden de la resta para ejecutar de una manera u otra
        // comparaNivel - nivelActual = más severo primero
        // nivelActual - comparaNivel = menos severo primero
    }
}
