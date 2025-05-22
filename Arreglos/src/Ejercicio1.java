import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------EJERCICIO 1-----------------------");
        int valores[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int longitud = valores.length;
        System.out.println("Vector de numeros\n");
        for(int i = 0; i < longitud; i++){
            System.out.println("Indice " + i + " : " + valores[i]);
        }

        int amultiplicar = 0;
        System.out.print("\nPor favor ingrese un número que desee multiplicar con el vector ☻: ");
        amultiplicar = scanner.nextInt();

        System.out.println("\nVector multiplicado\n");
        for(int i = 0; i < longitud; i++){
            System.out.println("Indice " + i + " : " + valores[i]*amultiplicar);
        }
    }
}
