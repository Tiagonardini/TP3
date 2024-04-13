package oop2.tp3.ejercicio1.modelo;

public class Infantil extends Libro{
    public Infantil(String nombre) {
        super(nombre);
    }



    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public boolean esUnNuevoLanzamiento() {
        return false;
    }
}
