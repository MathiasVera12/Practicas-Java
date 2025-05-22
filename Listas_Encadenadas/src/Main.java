import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        Node head = new Node(69);
        System.out.println(head); //imprime la direccion de memoria - es el puntero a esa direccion
        System.out.println(head.value); //imprime el valor en el espacio de la direccion de memoria del puntero
        System.out.println(head.next); //imprime la direccion de memoria del siguiente nodo, en teoria
        //imprime null porque no le asignamos un espacio de memoria al siguiente nodo, no creamos el objeto



    }
}