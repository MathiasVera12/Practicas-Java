package udla.mvera.linkedlist;

public class LinkedListApp {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList(); //instanciando la clase udla.mvera.linkedlist.SimpleLinkedList como un objeto llamado list
        System.out.println("Muestra en consola los valores de los nodos de la lista");

        list.push(1.23);
        list.push(19.23);
        list.push(12.23);

        list.printContent();
        System.out.println("\n");

        // insertar nodo
        // Primer argumento - Valor existente
        // Segundo argumento - Nuevo valor del nuevo nodo insertado
        System.out.println("Inserta un nuevo nodo despues del valor en nodo buscado");
        Node nodo =  list.insert(19.23, 45.68);
        if (nodo == null){ // No pudo encontrar donde ingresar el nuevo nodo
            System.out.println("No es posible insertarlo -> Valor no existe");
        }else{
            System.out.println("Nodo insertado correctamente");
        }

        // Despliegue de la nueva lista enlazada
        System.out.println("La nueva lista enlazada es : ");
        list.printContent();
        System.out.println("\n");

        // Buscar contenido en un nodo
        System.out.println("Búsqueda de Nodos");
        nodo = list.contains(45.68);
        if (nodo == null){ // No pudo encontrar donde ingresar el nuevo nodo
            System.out.println("El valor del nodo no fue encontrado");
        }else{
            System.out.println("El valor del nodo 45.68 fue encontrado");
        }
        System.out.println("\n");

        // Método POP
        System.out.println("Eliminación de nodos");
        while (!list.isEmpty()){
            nodo = list.pop();
            System.out.println("Nodo eliminado: ");
            nodo.showContent();
        }
        list.printContent();
        System.out.println("\n");

        System.out.println("Nueva lista con otros valores: ");
        list.push("Cat");
        list.push("Dog");
        list.push("Dragon");
        list.printContent();
        System.out.println("\n");

        // Eliminación con el método Delete
        System.out.println("Eliminacion de nodo con un valor buscado");
        list.delete("Dragon");
        System.out.println("Lista después de eliminado Dragon: ");
        list.printContent();

    }
}
