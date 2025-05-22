package udla.mvera.colaprioridad;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueLetras {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("C++");
        queue.add("7");
        queue.add("Java");
        queue.add("Phyton");

        System.out.println(queue);
        /*queue.poll();
        System.out.println(queue);*/
        // Elemento de mayor prioridad
        System.out.println("El elemento de mayor prioridad es: " + queue.peek());

        // Declarar la clase iteradora
        Iterator<String> itr2 = queue.iterator();

        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        queue.remove("Java");
        Iterator<String> itr3 = queue.iterator();

        System.out.println("\n");
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }



    }
}
