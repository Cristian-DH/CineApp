package model;

import java.util.ArrayList;
import java.util.List;

public class Funcion {

    private Pelicula pelicula;
    private String horario;
    private int capacidadSala;
    private List<Integer> asientosVendidos;

    public Funcion(Pelicula pelicula, String horario, int capacidadSala) {
        this.asientosVendidos = new ArrayList<>();
        setPelicula(pelicula);
        setHorario(horario);
        setCapacidadSala(capacidadSala);
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        if (pelicula != null) {
            this.pelicula = pelicula;
        }
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        if (horario != null && !horario.trim().isEmpty()) {
            this.horario = horario.trim();
        }
    }

    public int getCapacidadSala() {
        return capacidadSala;
    }

    public void setCapacidadSala(int capacidadSala) {
        if (capacidadSala > 0) {
            this.capacidadSala = capacidadSala;
        }
    }

    public List<Integer> getAsientosVendidos() {
        return asientosVendidos;
    }

    public int getEntradasVendidas() {
        return asientosVendidos.size();
    }

    public int getAsientosDisponibles() {
        return capacidadSala - asientosVendidos.size();
    }

    public boolean hayAsientosDisponibles() {
        return getAsientosDisponibles() > 0;
    }

    public boolean asientoYaVendido(int numeroAsiento) {
        return asientosVendidos.contains(numeroAsiento);
    }

    public boolean asientoValido(int numeroAsiento) {
        return numeroAsiento >= 1 && numeroAsiento <= capacidadSala;
    }

    public boolean venderAsiento(int numeroAsiento) {
        if (!asientoValido(numeroAsiento)) {
            return false;
        }

        if (!hayAsientosDisponibles()) {
            return false;
        }

        if (asientoYaVendido(numeroAsiento)) {
            return false;
        }

        asientosVendidos.add(numeroAsiento);
        return true;
    }

    public void mostrarInformacion() {
        System.out.println("=== FUNCION ===");
        System.out.println("Pelicula: " + pelicula.getTitulo());
        System.out.println("Duracion: " + pelicula.getDuracion() + " min");
        System.out.println("Horario: " + horario);
        System.out.println("Capacidad sala: " + capacidadSala);
        System.out.println("Entradas vendidas: " + getEntradasVendidas());
        System.out.println("Asientos disponibles: " + getAsientosDisponibles());

    }

    @Override
    public String toString() {
        return "Funcion:" +
                "\npelicula: " + pelicula.getTitulo() +
                "\nduracion: " + pelicula.getDuracion() + " min" +
                "\nhorario: " + horario +
                "\ncapacidadSala: " + capacidadSala +
                "\nentradasVendidas: " + getEntradasVendidas() +
                "\nasientosDisponibles: " + getAsientosDisponibles();
    }
}