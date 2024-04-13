package oop2.tp3.ejercicio1.calculadora;

import oop2.tp3.ejercicio1.modelo.Alquiler;

public class CalculadoraLibroNuevoLanzamiento implements CalculadoraLibro {
    private static final Double MONTO_ADICIONAL = 3.0;

    @Override
    public Double calcularMontoLibro(Alquiler alquiler) {
            double monto = 0.0;
            monto += (alquiler.diasAlquilados() * MONTO_ADICIONAL);
            return monto;
        }
    }
