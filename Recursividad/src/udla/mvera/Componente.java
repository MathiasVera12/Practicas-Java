package udla.mvera;

import java.util.List;

public class Componente {
    private String nombre; // Atributo de tipo String
    private List<Componente> hijos; // Atributo de tipo Lista
    // Constructor de la clase con los atributos
    public Componente(String nombre, List<Componente> hijos) {
        this.nombre = nombre;
        this.hijos = hijos;
    }
    // Metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Componente> getHijos() {
        return hijos;
    }

    public void setHijos(List<Componente> hijos) {
        this.hijos = hijos;
    }

    public List<>(List<Componente> lista){
        return;
    }

    public boolean vacio(List<Componente> lista){
        return lista.isEmpty();
    }
}
