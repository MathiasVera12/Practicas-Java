package edu.mvera.herenciahospital;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Especialista persona1 = new Especialista();
        System.out.println("Ingrese los valores del Especialista: ");
        persona1.setNombre("Juan Luis");
        persona1.setEdad(35);
        persona1.setCedula(1004052351);
        persona1.setId("A1002357");
        persona1.setCasado("Si");
        persona1.setResistencia(120);
        persona1.setEspecialidad("Neurólogo");
        persona1.setClinica("Clinica Moderna");
        persona1.setSueldo(1230.56);

        System.out.println("Los datos ingresados son: ");
        System.out.println(persona1.getNombre() + " " + persona1.getEdad() + " " + persona1.getCedula()+ " " + persona1.getId() + " " + " " + persona1.getResistencia() + " " + persona1.getEspecialidad() + " " +persona1.getClinica() + " " + persona1.getSueldo());
    }
}