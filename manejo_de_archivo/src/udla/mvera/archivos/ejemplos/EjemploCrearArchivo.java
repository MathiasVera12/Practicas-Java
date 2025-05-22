package udla.mvera.archivos.ejemplos;

import udla.mvera.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        //Nota general: para crear y leer los archivos, crear una carpeta en donde deseemos y ponerle la direccion de la carpeta en lo siguiente:
        String nombreArchivo = "D:\\Datos\\java.txt";
        String nombreArchivoExcel = "D:\\Datos\\java.csv"; // --> Se cambia el tipo de dato

        ArchivoServicio service = new ArchivoServicio();
        //service.crearArchivo(nombreArchivo); --> Crea un archivo con Buffered
        service.crearArchivo2(nombreArchivo); //--> Crea un archivo con Print
        service.crearArchivoExcel(nombreArchivoExcel); //--> Crea un archivo csv con Buffered

    }
}
