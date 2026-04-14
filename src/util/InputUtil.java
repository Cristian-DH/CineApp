// Clase utilitaria para manejar entradas por consola de forma segura
package util;

import java.util.Scanner;

public class InputUtil {

    // Scanner único para todo el sistema
    private static final Scanner sc = new Scanner(System.in);


    // LEER ENTEROS (METODO 1): Lee un número entero sin que el programa se rompa

    public static int leerInt(String mensaje) {

        while (true) { // repite hasta ue se ingrese eun n° válido

            try {
                System.out.print(mensaje);

                return Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {  //catch sirve para atrapar errores y evitar que el programa se rompa.
                // Maneja error cuando el usuario no escribe un número
                System.out.println("Error: debes ingresar un número válido.");
            }
        }
    }


    // LEER TEXTO (METODO 2): Lee cualquier texto ingresado por el usuario

    public static String leerString(String mensaje) {

        System.out.print(mensaje);
        return sc.nextLine();
    }

    // LEER LOS ENTEROS CON RANGO (METODO 3): Válida que el número esté dentro de un rango permitido

    public static int leerIntRango(String mensaje, int min, int max) {

        while (true) {

            try {
                System.out.print(mensaje);

                int valor = Integer.parseInt(sc.nextLine());

                if (valor >= min && valor <= max) {
                    return valor;
                } else {
                    System.out.println("Debe estar entre " + min + " y " + max);
                }

            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número válido");
            }
        }
    }
}