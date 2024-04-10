// Clase EmergencySystemWithJavaPriorityQueue
package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class PriorityQueueh<P> extends PriorityQueue<Paciente> {


    public static void cargarPacientesEnCola(java.util.PriorityQueue<Paciente> cola) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\maroc\\OneDrive - Colegio Jacques Cousteu\\Documentos\\UVG\\2do año\\Algoritmos\\HDT8\\src\\main\\java\\org\\example\\Pacientes.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 3) {
                    cola.add(new Paciente(parts[0], parts[1], parts[2].charAt(0)));
                } else {
                    System.out.println("Línea inválida: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void atenderPacientes(java.util.PriorityQueue<Paciente> cola) {
        while (!cola.isEmpty()) {
            Paciente paciente = cola.poll();
            System.out.println("Atendiendo a: " + paciente);
            // Puedes agregar una pausa o esperar una confirmación del usuario aquí si lo deseas.
        }
    }

}



