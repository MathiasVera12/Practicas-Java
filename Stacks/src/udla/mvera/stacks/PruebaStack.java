package udla.mvera.stacks;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.EmptyStackException;
import java.util.Stack;

public class PruebaStack {
    public static void main(String[] args) {
        Stack<Number> pila = new Stack<>(); // A diferencia de las Linked List, el contenido es del tipo de dato que pongamos
        Stack<String> pila2 = new Stack<>();

        // Creación de la Pila - Método Push
        System.out.println("-----------Creación de elementos de la Pila-----------");
        pila.push(12L);
        System.out.println("Ingresó 12L en pila 1");
        pila2.push("Lucas");
        System.out.println("Ingresó Lucas en pila 2");
        imprimirPila(pila, pila2);

        pila.push(35678);
        System.out.println("Ingresó 35678 en pils 1");
        pila2.push("Juan");
        System.out.println("Ingresó Juan en pila 2");
        imprimirPila(pila, pila2);

        pila.push(1.0F);
        System.out.println("Ingresó 1.0F en pila 1");
        pila2.push("Mathias");
        System.out.println("Ingresó Mathias en pila 2");
        imprimirPila(pila, pila2);

        // Eliminación de Elementos de la Pila
        try{
            System.out.println("-----------Eliminación de elementos de la Pila-----------");
            Number objetoEliminado = null;
            String objetoEliminado2 = null;
            // Sacar el elemento de la Pila
            while(true){
                objetoEliminado = pila.pop();
                objetoEliminado2 = pila2.pop();
                System.out.printf("Se eliminó : %s %s %n", objetoEliminado,objetoEliminado2);
                imprimirPila(pila, pila2);
            }
        }catch(EmptyStackException e){
            e.printStackTrace();
        }

    }
    //
    public static void imprimirPila(Stack<Number> pila, Stack<String> pila2){
        if(pila.isEmpty() && pila2.isEmpty()){
            System.out.println("Las pilas estan vacías\n");
        }else{
            System.out.printf("El elemento de las Pilas son : %s %s %n", pila.peek(), pila2.peek());
            System.out.printf("Las pilas contienen : %s (top) \n\t\t\t\t %s (top)%n\n", pila, pila2);
        }
    }
    public static void buscarElemento(){

    }
}
