package model;

public class Pelicula { // Clase Pelicula

    private String titulo; // Atributo título
    private int duracion; // Duración en minutos

    public Pelicula(String titulo, int duracion) { // Constructor
        this.titulo = titulo; // Asigna título
        this.duracion = duracion; // Asigna duración
    }

    public String getTitulo() { // Getter título
        return titulo; // Retorna título
    }

    public int getDuracion() { // Getter duración
        return duracion; // Retorna duración
    }

    public void mostrarInfo() { // Método para mostrar info
        System.out.println("Película: " + titulo + " - " + duracion + " min"); // Imprime info
    }
}
