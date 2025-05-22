package udla.mvera.colaprioridad;

import java.util.PriorityQueue;

public class PriorityQueueE {
    public static void main(String[] args) {
        // Declaracion de la clase Priority Queue
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        // [6,9,8,1,5,6,0,11,10,4]
        queue.add(6);
        queue.add(9);
        queue.add(8);
        queue.add(1);
        queue.add(5);
        queue.add(6);
        queue.add(0);
        queue.add(11);
        queue.add(10);
        queue.add(4);
        System.out.println("-----------Primera cola con prioridad-----------");
        System.out.println(queue);
        // Eliminar o desencolar un elemento para ver como se recalcula el arbol
        System.out.println("-----------Al desencolar un numero-----------");
        System.out.println("El elemento desencolado fue : " + queue.poll());
        System.out.println(queue);



    }
}
