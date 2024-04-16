package oop2.tp3.ejercicio1.modelo;

public class Alquiler {
    private Libro copia;
    private int diasAlquilados;

    public Alquiler(Libro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }

    public int diasAlquilados() {
        return this.diasAlquilados;
    }
}
