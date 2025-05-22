public class Automoviles {
    //Declaración de las propiedades de la clase, se le pueden dar valores aquí o en la clase main principal sobre la que trabajamos
    private String marca = "Lamborgini";
    private String modelo = "aventador";
    private String color = "blanco hueso";
    private Double cilindraje;
    /*public Automoviles(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }*/

    //CONSTRUCTOR: EL METODO TIENE EL MISMO NOMBRE DE LA CLASE, AL PONER VARIOS CONSTRUCTORES DEL MISMO NOMHBRE SE LLAMA SOBRECARGA DE CONSTRUCTORES.
    //FUNCION DEL CONSTRUCTOR: ASIGNAR EL ESPACIO DE MEMORIA A UTILIZAR, LUEGO SE LES PUEDE BORRAR ESOS ESPACIOS USANDO DESTRUCTORES.
    public Automoviles(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    //AL REALIZAR LA SOBRECARGA DE CONSTRUCTORES, AL SEGUNDO CONSTRUCTOR SE LE AÑADEN COSAS NUEVAS PARA DIFERENCIARLES.
    public Automoviles(String marca, String modelo, String color, Double cilindraje) {
        /*this.marca = marca;
        this.modelo = modelo;
        this.color = color;*/
        this(marca,modelo,color);
        this.cilindraje = cilindraje;
    }

    //ocultacion: metodos publicos, propìedades privadas, al hacer las propiedades privadas necesitamos metodos publicos para usar esas propiedades:
    //Metodo para leer cada valor y metodo para asignar valor.
    /*public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public Double getCilindraje(){
        return this.cilindraje;
    }
    public void setCilindraje(Double cilindraje){
        this.cilindraje = cilindraje;
    }*/

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Double cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Declaración de los metodos del programa
    public String detallesAuto(){
        //Esta forma sirve para imprimir en pantalla los valores declarados en el principal
        /*System.out.println("Auto fabricante: " + this.marca);
        System.out.println("Auto modelo: " + this.modelo);
        System.out.println("Auto color: " + this.color);
        System.out.println("Auto cilindraje: " + this.cilindraje + "\n");*/

        //Esta es otra forma de imprimir en pantalla los valores, enviandolos a un string (cadena) todos los datos, usando el StringBuilder:
        /*String da = "Auto fabricante: " + this.marca + "\n" +
                "Auto modelo: " + this.modelo +  "\n" +
                "Auto color: " + this.color + "\n" +
                "Auto cilindraje: " + this.cilindraje + "\n";
        return da;*/

        //Aqui tambien imprimimos en pantalla los valores, pero no usamos ninguna clase ni nada, el metodo solo devuelve esos valore:
        return "\nAuto fabricante: " + this.getMarca() + "\n" +
                "Auto modelo: " + this.getModelo() +  "\n" +
                "Auto color: " + this.getColor() + "\n" +
                "Auto cilindraje: " + this.getCilindraje();
    }

    public String velocidad(int rpm){
        return "El auto de la marca " + this.getMarca() + " está acelerando a " + rpm + " rpm";
    }

    public String matricula(int dia, int mes, int anio){
        return "El auto de marca " + this.getMarca() + " está matriculado el " + dia + "/" + mes + "/" + anio + "\n";
    }

    //Sobrecarga de metodos; Polimorfismo, metodos con mismo nombre pero que hagan dos cosas diferentes.
    public float combustiblekm(float x, float y){
        float z;
        z = x/y;
        return z;
    }

    public float combustiblekm(int x, int y){
        float z;
        z = x/y;
        return z;
    }

    //Encapsulamiento: no saber de donde viene la informacion solo usarla



}


/*El StringBuilder tiene la siguiente estructura:
    StringBuilder da = new StringBuilder();
    da.append("Auto fabricante: " + this.marca);
    return da.toString();
*/
