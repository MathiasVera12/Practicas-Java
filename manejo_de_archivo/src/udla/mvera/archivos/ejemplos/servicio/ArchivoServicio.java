package udla.mvera.archivos.ejemplos.servicio;

import java.io.*;


public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);

        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo,true))) {
            //FileWriter escritor = new FileWriter(archivo,true); --> así se abre un archivo para escribir, al ponerle el true los datos ingresados no se sobreescriben
            //BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo,true)); --> BufferedWritter es màs optimo que el FileWriter
            buffer.append("La batería se está acabando\n")
                    .append("Se está poniendo oscuro\n");
            //buffer.close(); --> Si ponemos el bufferWriter dentro del try podemos o no podemos ponerle el close
            System.out.println("\n-------La informaciòn ha sido creada correctamente-------\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);

        try (PrintWriter print = new PrintWriter(new FileWriter(archivo,true))) {
            //FileWriter escritor = new FileWriter(archivo,true); --> así se abre un archivo para escribir, al ponerle el true los datos ingresados no se sobreescriben
            //BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo,true)); --> BufferedWritter es màs optimo que el FileWriter
            print.println("---------------------"); //el PrintWriter permite escribir println, por tanto te ahorras escribir \n
            print.println("La batería se está acabando");
            print.println("Se está poniendo oscuro");
            //print.close(); --> Si ponemos el PrintWriter dentro del try podemos o no podemos ponerle el close
            System.out.println("\n-------La informaciòn ha sido creada correctamente-------\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String leerArchivo(String nombre){
        StringBuilder sB = new StringBuilder();
        File archivo = new File(nombre);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombre));
            String linea;
            while((linea = reader.readLine()) != null){
                sB.append(linea).append("\n");
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e); //Si no encuentra el archivo, no se crea correctamente
        }catch (IOException e) {
            throw new RuntimeException(e); //Si ocurre algún fallo en general
        }return sB.toString();
    }

    public void crearArchivoExcel(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo,true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.append("nombre;")
                    .append("apellido;")
                    .append("edad;")
                    .append("cédula;")
                    .append("telefono;");
            buffer.close();
        } catch (IOException e) {
            throw new RuntimeException(e); //Si ocurre algún fallo en general
        }
    }

}
