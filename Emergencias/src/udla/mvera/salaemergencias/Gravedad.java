package udla.mvera.salaemergencias;

public enum Gravedad {
    Menor("Menor", 1),
    Moderado("Moderado",2),
    Severo("Severo", 3),
    Muy_Severo("Muy Severo", 4);
    private String descripcion;
    private Integer nivel;

    Gravedad(String descripcion, Integer nivel) {
        this.descripcion = descripcion;
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
