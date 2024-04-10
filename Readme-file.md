# Hoja de Trabajo # 8

## Autor

Esta hoja de trabajo fue realizada por Mario Fernando Rocha López

### Descripción

Este proyecto consiste en el desarrollo de un sistema de atención de pacientes que llegan a la sección de Emergencias de un hospital. El sistema se basa en una Priority Queue para gestionar las fichas de ingreso de los pacientes, las cuales contienen información como el nombre del paciente, descripción del síntoma y código de emergencia.

## Funcionalidades

- **Registro de Pacientes:** El sistema permite el registro de pacientes mediante la lectura de un archivo de texto llamado `pacientes.txt`, donde cada línea contiene los datos de un paciente separados por comas (nombre del paciente, descripción del síntoma, código de emergencia).

- **Priorización de Atención:** Los pacientes son atendidos en función de su código de emergencia, que va desde la prioridad A (más urgente) hasta la prioridad E (menos urgente).

- **Retiro de Pacientes:** Cuando un médico solicita el siguiente paciente, el sistema retira de la cola de atención al paciente con la prioridad más alta y muestra su nombre, síntoma y prioridad.

## Ejemplo de Uso

Supongamos que se tiene el siguiente archivo de pacientes (`pacientes.txt`):

```
Juan Perez, fractura de pierna, C
Maria Ramirez, apendicitis, A
Lorenzo Toledo, chikunguya, E
Carmen Sarmientos, dolores de parto, B
```

El sistema atendería a los pacientes en el siguiente orden:

1. **Maria Ramirez:** Apendicitis (Prioridad A)
2. **Carmen Sarmientos:** Dolores de parto (Prioridad B)
3. **Juan Perez:** Fractura de pierna (Prioridad C)
4. **Lorenzo Toledo:** Chikungunya (Prioridad E)

## Instrucciones de Ejecución

1. Descarga o clona el repositorio del proyecto.
2. Ejecuta el programa principal.
3. Asegúrate de tener el archivo `pacientes.txt` con el formato especificado en el mismo directorio que el programa.
4. Sigue las indicaciones del sistema para atender a los pacientes.

## Tecnologías Utilizadas

- Lenguaje de Programación: Java https://www.java.com/es/
- Estructuras de Datos: Priority Queue


