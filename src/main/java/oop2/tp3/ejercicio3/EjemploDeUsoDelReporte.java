package oop2.tp3.ejercicio3;

import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EjemploDeUsoDelReporte {

    @Test

    public void gastoDesayunoMayorA1000(){
        var g1 = new GastoDesayuno(1000);
        g1.tipoGasto = TipoDeGasto.DESAYUNO;
//        g1.monto =1000;
        var reporte = new ReporteDeGastos();


        assertEquals("Expenses 2024-04-16\n" +
                "Desayuno\t1000\t \n" +
                "Gastos de comida: 1000\n" +
                "Total de gastos: 1000\n", reporte.imprimir(List.of(g1), LocalDate.now()));
    }
    @Test
    public void gastosMultiples (){
        var g1 = new GastoDesayuno(1000);
        g1.tipoGasto = TipoDeGasto.DESAYUNO;

        var z1 = new GastoCena(10);
        z1.tipoGasto = TipoDeGasto.CENA;

        var reporte = new ReporteDeGastos();

        var salida = reporte.imprimir(List.of(g1,z1), LocalDate.of(2024, 10, 10));

        assertEquals("Expenses 2024-10-10\n" +
                "Desayuno\t1000\tX\n" +
                "Cena\t10\t \n"+
                "Gastos de comida: 1010\n" +
                "Total de gastos: 1010\n", salida);
    }
}