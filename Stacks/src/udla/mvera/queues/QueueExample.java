package udla.mvera.queues;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Añadir elementos a la cola {1, 2, 3, ...}
        System.out.println("-------Añadir elementos a la cola-------");
        for (int i = 0; i<=5; i++){
            queue.add(i); // Cuando no hay elementos en cola regresa una excepción, se puede usar try y catch
            // queue.offer(i); --> Cuando no hay elementos en cola regresa un valor hexadecimal
        }
        // Muestra el contenido de la cola
        System.out.printf("Elementos de la cola: %s%n", queue);

        // Eliminar la cabeza del queue
        System.out.println("\n-------Eliminar la cabeza de la cola-------");
        int head = queue.remove(); // lanza una excepcion si está vacía, para usar try y catch
        // int head = queue.poll(); --> no lanza una excepcion
        System.out.println("El head de la cola es: " + head);
        // Muestra los elementos actuales de la queue
        System.out.println("Los elementos de la cola, al borrar el head, son: " + queue);

        // Mostrar la longitud o numero de elementos de la Cola
        System.out.println("\n-------Mostrar el numero de elementos de la Cola-------");
        int size = queue.size();
        System.out.println("La longitud de la cola es: " + size);

        // Mostrar cualquier elemento que esté en el head
        System.out.println("\n-------Mostrar la head de la Cola-------");
        System.out.println("El head de la cola es: " + queue.peek());

        // Mostrar el ultimo elemento de la cola
        System.out.println("\n-------Mostrar el back de la Cola-------");
        for(int i = size; i>1; i--){
            System.out.println("El head de la cola es: " + queue.remove());
        }
        System.out.println("El back de la cola es: " + queue);


    }
}
