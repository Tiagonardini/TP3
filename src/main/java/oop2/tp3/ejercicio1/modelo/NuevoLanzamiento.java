package oop2.tp3.ejercicio1.modelo;

public class NuevoLanzamiento extends Libro{
    public NuevoLanzamiento(String nombre) {
        super(nombre);
    }


    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public boolean esUnNuevoLanzamiento() {
        return true;
    }
}
