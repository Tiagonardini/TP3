package oop2.tp3.ejercicio1.modelo;

public class Infantil extends Libro{
    private static final Integer TRES = 3;
    private static final Double MONTO_ADICIONAL = 1.5;

    public Infantil(String nombre) {
        super(nombre);
        puntos = 1;
    }


    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public double calcularMontoLibro(Integer diasAlquilados){
        double monto = 1.5;
        if (diasAlquilados > TRES){
            monto += (diasAlquilados - TRES) * MONTO_ADICIONAL;
        }
        return monto;
    }

    @Override
    public boolean esUnNuevoLanzamiento() {
        return false;
    }

    @Override
    public int getPuntos(Integer dias) {
        return this.puntos;
    }
}
