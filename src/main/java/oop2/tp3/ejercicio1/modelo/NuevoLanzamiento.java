package oop2.tp3.ejercicio1.modelo;

public class NuevoLanzamiento extends Libro{

    private static final Double MONTO_ADICIONAL = 3.0;

    public NuevoLanzamiento(String nombre) {
        super(nombre);
        puntos = 2;
    }


    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public double calcularMontoLibro(Integer diasAlquilados) {
        double monto = 0.0;
        monto += (diasAlquilados * MONTO_ADICIONAL);
        return monto;
    }



    @Override
    public int getPuntos(Integer dias) {
        if (dias > 1) {
            return puntos;
        else
            return puntos - 1;
        }
    }
}
