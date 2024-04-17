package oop2.tp3.ejercicio1.modelo;

public class Regular extends Libro{
    private static final Integer DOS = 2;
    private static final Double MONTO_ADICIONAL = 1.5;

    public Regular(String nombre ) {
        super(nombre);
        puntos = 1;
    }

    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public double calcularMontoLibro(Integer diasAlquilados){
        double monto = 2.0;
        if (diasAlquilados > DOS) { //es mayor a dos dias
            monto += (diasAlquilados - DOS) * MONTO_ADICIONAL;
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
