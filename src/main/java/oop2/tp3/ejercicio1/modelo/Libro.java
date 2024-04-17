package oop2.tp3.ejercicio1.modelo;

public abstract class Libro {
    String nombre;
    int puntos;
    public Libro(String nombre) {
        this.nombre = nombre;
    }



    public abstract String nombre();

    public abstract double calcularMontoLibro(Integer diasAlquilados);
    public abstract int getPuntos(Integer dias);
}