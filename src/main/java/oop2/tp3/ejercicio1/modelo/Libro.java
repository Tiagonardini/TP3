package oop2.tp3.ejercicio1.modelo;

public abstract class Libro {
    String nombre;
    public Libro(String nombre) {
        this.nombre = nombre;
    }



    public abstract String nombre();


    public abstract boolean esUnNuevoLanzamiento();
}