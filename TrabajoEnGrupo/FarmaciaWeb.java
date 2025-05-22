import java.util.Scanner;
import java.util.Random;
public class FarmaciaWeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        String nombre = "admin";
        String contrasena = "admin";
        int producto = 0;
        int opcion = 0;

        Integer[] numero;
        numero = new Integer[5];
        for(int i=0; i<5;i++){
            numero[i] = r.nextInt(10)+1;
        }

        String[] medicamentos = {"Paracetamol","Ibuprofeno","Amoxicilina","Aspirina","Curitas"};
        int cantidad = medicamentos.length;

        System.out.println("Ingrese su nombre de usuario: ");
        nombre = scanner.next();

        System.out.println("Ingrese su contraseña: ");
        contrasena = scanner.next();

        if(nombre.equals("admin") && contrasena.equals("admin")){
            System.out.println("Bienvenido: " + nombre + "!");
            do{
                System.out.println("\n-------¿Que deseas realizar hoy?-------");
                System.out.println(" 1.Ver el catalogo\n 2.Comprar medicinas\n 3.Vender medicinas\n 4.Salir");
                opcion = scanner.nextInt();
                
                switch (opcion){
                    case 1:
                        System.out.println("El catalogo se visualiza de esta forma: ");
                        for(int i = 0; i < cantidad; i++){
                            System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el numero del medicamento que desea comprar: ");
                        producto = scanner.nextInt();
                        switch(producto){
                            case 1:
                                numero[0] -= 1;
                                System.out.println("La compra se ha realizado con exito");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 2:
                                numero[1] -= 1;
                                System.out.println("La compra se ha realizado con exito");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 3:
                                numero[2] -= 1;
                                System.out.println("La compra se ha realizado con exito");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 4:
                                numero[3] -= 1;
                                System.out.println("La compra se ha realizado con exito");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 5:
                                numero[4] -= 1;
                                System.out.println("La compra se ha realizado con exito");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese el nombre del medicamento que desea vender: ");
                        producto = scanner.nextInt();
                        switch(producto){
                            case 1:
                                numero[0] += 1;
                                System.out.println("----La venta se ha realizado con exito----");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 2:
                                numero[1] += 1;
                                System.out.println("----La venta se ha realizado con exito----");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 3:
                                numero[2] += 1;
                                System.out.println("----La venta se ha realizado con exito----");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 4:
                                numero[3] += 1;
                                System.out.println("----La venta se ha realizado con exito----");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 5:
                                numero[4] += 1;
                                System.out.println("----La venta se ha realizado con exito----");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Salio con exito del programa, ten un buen dia " + nombre + "!");
                        break;
                }

            }while(opcion != 4);
        }else{
            do{
                System.out.println("Bienvenido: " + nombre + "!" + "\n-------¿Que deseas realizar hoy?-------");
                System.out.println(" 1.Ver catalogo\n 2.Comprar medicinas\n 3.Salir");
                opcion = scanner.nextInt();

                switch (opcion){
                    case 1:
                        System.out.println("El catalogo se visualiza de esta forma: ");
                        for(int i = 0; i < cantidad; i++){
                            System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el numero del medicamento que desea comprar: ");
                        producto = scanner.nextInt();
                        switch(producto){
                            case 1:
                                numero[0] -= 1;
                                System.out.println("La compra se ha realizado con exito");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 2:
                                numero[1] -= 1;
                                System.out.println("La compra se ha realizado con exito");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 3:
                                numero[2] -= 1;
                                System.out.println("La compra se ha realizado con exito");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 4:
                                numero[3] -= 1;
                                System.out.println("La compra se ha realizado con exito");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                            case 5:
                                numero[4] -= 1;
                                System.out.println("La compra se ha realizado con exito");
                                System.out.println("El catalogo se visualiza de esta forma: ");
                                for(int i = 0; i < cantidad; i++){
                                    System.out.println((i+1)+"----"+medicamentos[i]+"----"+numero[i]);
                                }
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Salio con exito del programa, ten un buen dia " + nombre + "!");
                        break;
                }
            }while(opcion != 3);
        }
    }
}
