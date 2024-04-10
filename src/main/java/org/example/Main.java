package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de Priority Queue a usar:");
        System.out.println("1. VectorHeap personalizado");
        System.out.println("2. PriorityQueue del Java Collection Framework");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                VectorHeapPersonalizado();
                break;
            case 2:
                PriorityQueueJCF();
                break;
            default:
                System.out.println("Opción no válida. Por favor, introduzca 1 o 2.");
                break;
        }

        scanner.close();
    }

    // En tu clase Main
    public static void VectorHeapPersonalizado() {
        VectorHeap<Paciente> heap = new VectorHeap<>();
        CustomVectorMap.cargarPacientesEnCola(heap);
        CustomVectorMap.atenderPacientes(heap);
    }

    public static void PriorityQueueJCF() {
        PriorityQueueh<Paciente> cola = new PriorityQueueh<>();
        PriorityQueueh.cargarPacientesEnCola(cola);
        PriorityQueueh.atenderPacientes(cola);
    }

}
