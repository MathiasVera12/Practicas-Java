public class PersonaCevallosVera implements Comparable <PersonaCevallosVera>{
    private String nombre;
    private int edad;
    private String cedula;
    private String genero;
    private String region;

    public PersonaCevallosVera() { // Constructor sin parametros inicializado con los datos personales de uno de los miembros del grupo.
        this.cedula = "1004055305";
        this.nombre = "Mathias Vera";
        this.edad = 19;
        this.genero = "HOMBRE";
        this.region = "Sierra";
    }
    public PersonaCevallosVera(String cedula, String nombre, int edad, String genero, String region) { // Constructor con los 4 parametros.
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.region = region;
    }
    // Creacion de los Getters y Setters de la clase.
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public int compareTo(PersonaCevallosVera o) {
        return 0;
    }
}
