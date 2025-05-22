package udla.mvera.linkedlist;

public class SimpleLinkedList {
    private Node first; // Referencia al primer nodo de la lista -- atributo first de tipo Nodo
    public SimpleLinkedList(){
        this.first = null; // Está en la memoria pero es Null
    }
    public void push(Object obj){
        // Esta es la instanciación de Objeto udla.mvera.linkedlist.Node
        // Para el nuevo Nodo de la cabecera de la lista
        Node newNode = new Node(obj);
        // El nuevo Nodo creado es primero y luego
        // NewNode es el nuevo primero de la lista
        newNode.setNext(this.first);
        this.first = newNode;//da el valor del nodo
    }
    public Node pop(){ // Elimina todo el nodo automaticamente, sin buscar el valor
        Node temp = this.first; // Guardado de referencia del contenido -- guarda el primer nodo en una variable temporal
        this.first = this.first.next(); // guarda el puntero a la dirección de memoria que tenía el nodo que vamos a eliminar
        //Para luego asignar este puntero al primer nodo, dando así que
        //NodoA guardado en temp (valor y demás), puntero NodoB (apunta a NodoC) se asigna a NodoA
        //regresa a temp
        return temp;
    }
    public Node delete(Object val){ // Busca un valor especifico en el la lista, en los nodos, y lo elimina
        Node currentNode = this.first;
        Node previusNode = this.first;
        while (!currentNode.value().equals(val)){
            if(currentNode.next() == null){
                return null;
            }else{
                previusNode = currentNode;
                currentNode = currentNode.next();
            }
        }
        if(currentNode == this.first){
            this.first = this.first.next();
        }else{
            previusNode.setNext(currentNode);
        }
        return currentNode;
    }

    public boolean isEmpty(){
        return (this.first == null); // Es el método para saber si la lista está vacía
    }
    public Node contains(Object val){ // Método para buscar un valor en la lista, ver si contiene ese valor
        Node currentNode = this.first;
        while (!currentNode.value().equals(val)){
            if (currentNode.next() == null){
                return null;
            }else{
                currentNode = currentNode.next();
            }
        }
        return currentNode;
    }
    // Método que permite insertar un nodo con un valor
    // en algún lugar de la lista enlazada
    public Node insert(Object value,  Object newValue){
        Node newNode = new Node(newValue);
        // Primero vamos a first
        Node currentNode = this.first;
        // Recorremos los diferentes nodos de la lista enlazada
        while (!currentNode.value().equals(value)){
            // hasta que sea Null
            if(currentNode.next()== null){
                return null;
            }else{
                currentNode = currentNode.next();
            }
            // Si llega a encontrar el valor
        }
        newNode.setNext(currentNode.next()); // Apunto al nodo al que estaba apuntando
        currentNode.setNext(newNode); //Nodo actual apunta al nuevo nodo que estamos creando
        return newNode; // Retornamos el nodo que se acaba de insertar
    }
    public void printContent(){ // Metodo para imprimir el contenido de los nodos hasta el null
        Node currentNode = first;
        while(currentNode != null){
            currentNode.showContent();
            currentNode = currentNode.next();
        }
    }
}
