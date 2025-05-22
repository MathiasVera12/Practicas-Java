import java.util.*;

public class Cola{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<PersonaCevallosVera> cola = new LinkedList<>();
        PersonaCevallosVera nuevaPersona = new PersonaCevallosVera();
        List temporal = new ArrayList<>();
        int cant = 0, base = 0, opcion = 0;
        do {
            System.out.println("Ingrese la opcion que requiera: \n1. ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
            }
        }while(opcion != 0);
        System.out.println("Ingrese cuantas nuevas personas desea ingresar: ");
        cant = scanner.nextInt();
        for(int i = 0; i < cant; i++){
            System.out.println("Ingrese la cedula: ");
            nuevaPersona.setCedula(scanner.next());
            System.out.println("Ingrese la nombre: ");
            nuevaPersona.setCedula(scanner.next());
            System.out.println("Ingrese la edad: ");
            nuevaPersona.setCedula(scanner.next());
            System.out.println("Ingrese la genero: ");
            nuevaPersona.setCedula(scanner.next());
            System.out.println("Ingrese la region: ");
            nuevaPersona.setCedula(scanner.next());
            if(base < nuevaPersona.getEdad()){
                base = nuevaPersona.getEdad();
                temporal.add(nuevaPersona.getCedula());
                cola.add();
            }
        }
        System.out.println(cola);
    }
}
