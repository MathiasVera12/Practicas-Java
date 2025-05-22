import java.util.Arrays;
public class Arreglos {
    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;

        for(int i=0; i< total-1; i++){
            for(int j=0;j<total-1;j++) {
                if (((Comparable)arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
                contador ++;
            }
        }

        System.out.println("-----Usando For con Orden-----");
        for(int i = 0; i < total; i++){
            System.out.println("Indice " + i + " : " + arreglo[i] + "z");
        }

        System.out.println("Las interacciones son: " + contador);
    }
    public static void main(String[] args) {
        //String [] productos = new String [7];
        //productos[0] = "Producto 1";

        String[] productos = {"Kingstone memory", "Samsung Galaxy", "Disco Duro", "Asus Notebook", "Macbook Air", "Chromecast", "Bicicleta"};

        int total = productos.length;

        System.out.println("-----Usando For-----");
        for(int i = 0; i < total; i++){
            System.out.println("Indice " + i + " : " + productos[i]);
        }

        //Para ver el array ordenado se usa la librería Arrays y Arrays.sort como primer método

        /*System.out.println("-----Usando For con Orden-----");
        Arrays.sort(productos);
        for(int i = 0; i < total; i++){
            System.out.println("Indice " + i + " : " + productos[i]);
        }*/

        //Tambien se puede utilizar el método burbuja para ordenar los datos, que usa el compareTo para comparar los elementos del array

        //int contador = 0;

        /*for(int i=0; i< total-1; i++){
            for(int j=0;j<total-1;j++) {
                if (productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j + 1];
                    productos[j + 1] = auxiliar;
                }
                contador ++;
            }
        }*/

        sortBurbuja(productos);

        /*System.out.println("-----Usando For con Orden-----");
        for(int i = 0; i < total; i++){
            System.out.println("Indice " + i + " : " + productos[i]);
        }*/

        //System.out.println("Las interacciones son: " + contador);

        //Para optimizar, se pueden hacer cambios a la misma linea de código, el hecho de poner total-1 baja de 49 interacciones a 36 y si se usa solo j en el asignar los valores baja a 21

        //Ahora con un array numerico

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        //int total1 = numeros.length;

        //Método de burbuja con ints

        /*for(int i = 0; i < total1-1; i++){
            for(int j = 0;j < total1-1;j++) {
                if (((Comparable<Integer>)numeros[j+1]).compareTo(numeros[j]) == 0) {
                    Integer auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
                contador ++;
            }
        }*/

        sortBurbuja(numeros);

        /*System.out.println("-----Usando For con Orden en Cadena de Numeros-----");
        for(int i = 0; i < total1; i++){
            System.out.println("Indice " + i + " : " + numeros[i]);
        }
        System.out.println("Las interacciones son: " + contador);*/

    }
}
