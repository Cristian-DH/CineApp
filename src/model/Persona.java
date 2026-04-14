package model;

public class Persona {
}

// Atributos Persona
protected String nombre;


//Constructor
public Persona(String nombre){
    this.nombre = nombre;
}
// Getter
public String getNombre(){
    return nombre;
}

// Método para mostrar información
public void mostrarInformacion (){
    System.out.println("Nombre: " + nombre);
}


