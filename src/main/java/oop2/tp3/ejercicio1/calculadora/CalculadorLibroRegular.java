package oop2.tp3.ejercicio1.calculadora;

import oop2.tp3.ejercicio1.modelo.Alquiler;

import java.io.IOException;

public class CalculadorLibroRegular implements CalculadoraLibro {
    private static final Integer DOS = 2;
    private static final Double MONTO_ADICIONAL = 1.5;

    @Override
    public Double calcularMontoLibro(Alquiler alquiler){
        double monto = 2.0;
        if (alquiler.diasAlquilados() > DOS) { //es mayor a dos dias
            monto += (alquiler.diasAlquilados() - DOS) * MONTO_ADICIONAL;
        }
        return monto;
    }
}




