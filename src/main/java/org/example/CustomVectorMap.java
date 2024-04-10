// Clase EmergencySystemWithCustomVectorHeap
package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomVectorMap {

    public static void cargarPacientesEnCola(VectorHeap<Paciente> heap) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\maroc\\OneDrive - Colegio Jacques Cousteu\\Documentos\\UVG\\2do año\\Algoritmos\\HDT8\\src\\main\\java\\org\\example\\Pacientes.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 3) {
                    heap.add(new Paciente(parts[0], parts[1], parts[2].charAt(0)));
                } else {
                    System.out.println("Línea inválida: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void atenderPacientes(VectorHeap<Paciente> heap) {
        while (!heap.isEmpty()) {
            Paciente paciente = heap.remove();
            System.out.println("Atendiendo a: " + paciente);
        }
    }
}

