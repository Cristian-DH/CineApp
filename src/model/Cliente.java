package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Cliente - Paso 4 del Sistema de Cine.
 * Esta clase hereda de Persona y gestiona su propia lista de entradas.
 */
public class Cliente extends Persona {

    // REQUISITO: Usar una colección (List) para guardar las entradas.
    // Usamos el tipo de dato genérico 'Object' o una interfaz si 'Entrada' no está definida aún,
    // pero lo ideal es apuntar a la clase Entrada del equipo.
    private List<Object> entradasCompradas;

    /**
     * Constructor flexible.
     * Si no conoces los parámetros exactos de Persona, este es el estándar
     * para clases que representan entidades con identidad.
     */
    public Cliente(String nombre) {
        super(nombre);
        this.entradasCompradas = new ArrayList<>();
    }

    // REQUISITO: Debe permitir asociar entradas compradas.
    public void agregarEntrada(Object entrada) {
        if (entrada != null) {
            this.entradasCompradas.add(entrada);
        }
    }

    // Getter para la colección de entradas
    public List<Object> getEntradasCompradas() {
        return entradasCompradas;
    }
    // Método de utilidad para imprimir el estado del cliente

    public void mostrarResumen() {
        System.out.println("Cliente: " + getNombre());
        System.out.println("¡Entrada adquirida!: " + entradasCompradas.size());
    }
}