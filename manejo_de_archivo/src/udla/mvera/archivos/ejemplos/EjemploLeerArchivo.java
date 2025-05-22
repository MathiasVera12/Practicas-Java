package udla.mvera.archivos.ejemplos;

import udla.mvera.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\Datos\\java.txt";
        ArchivoServicio servicio = new ArchivoServicio();
        System.out.println(servicio.leerArchivo(nombreArchivo));
    }
}
