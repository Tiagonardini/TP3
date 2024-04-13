package oop2.tp3.ejercicio1.calculadora;

import oop2.tp3.ejercicio1.modelo.Alquiler;

import java.io.IOException;

public class CalculadoraLibroInfantil implements CalculadoraLibro {

    private static final Integer TRES = 3;
    private static final Double MONTO_ADICIONAL = 1.5;
    @Override
    public Double calcularMontoLibro(Alquiler alquiler){
        double monto = 1.5;
            if (alquiler.diasAlquilados() > TRES){
                monto += (alquiler.diasAlquilados() - TRES) * MONTO_ADICIONAL;
            }
        return monto;
    }
}
