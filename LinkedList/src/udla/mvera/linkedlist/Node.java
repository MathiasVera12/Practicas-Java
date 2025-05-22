package udla.mvera.linkedlist;

public class Node {
    private Object data; // Declaración de objeto llamado data de tipo Object. Al estar "Object" automaticamente se vuelve objeto no hace falta instanciar
    private Node next; // Declaración de un atributo del nodo llamado udla.mvera.linkedlist.Node
    public Node (Object dato){ // Constructor de la clase udla.mvera.linkedlist.Node, recibe de parametro el valor que tendrá el nodo
        this.data = dato;
    }
    public Object value() {
        return this.data;
    }
    public Node next(){ // Constructor para apuntar al siguiente nodo
        return this.next;
    }
    public void setNext(Node next){ // Ejecución del puntero al nodo siguiente
        this.next = next;
    }
    public void showContent(){ // Muestra el contenido del nodo
        System.out.println(data);
    }
}
