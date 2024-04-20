package oop2.tp3.ejercicio3;

import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EjemploDeUsoDelReporte {
    @Test
    public void gastoDesayunoMayorA1000() {
        var g1 = new GastoDesayuno(10000);
        var reporte = new ReporteDeGastos();
        assertEquals("Expenses 2024-04-19\n" +
                "Desayuno\t10000\tX\n" +
                "Gastos de comida: 10000\n" +
                "Total de gastos: 10000\n", reporte.imprimir(List.of(g1), LocalDate.of(2024,4, 19)));
    }

    @Test
    public void gastosMultiplesCenaYAlquilerDeAuto() {
        var g1 = new GastoAlquilerAuto(100000);
        var g2 = new GastoCena(1000);
        var reporte = new ReporteDeGastos();

        String expectedOutput = "Expenses 2024-04-19\n" +
                "Alquiler del auto\t100000\t \n" +
                "Cena\t1000\t \n" +
                "Gastos de comida: 1000\n" +
                "Total de gastos: 101000\n";

        assertEquals(expectedOutput, reporte.imprimir(List.of(g1, g2), LocalDate.of(2024, 4, 19)));
    }
//    public void gastosMultiplesCenaYAlquilerDeAuto() {
//        var g1 = new GastoAlquilerAuto(100000);
//        var g2 = new GastoCena(1000);
//        var reporte = new ReporteDeGastos();
//        assertEquals("Expenses 2024-04-19\n" +
//                "Alquiler de auto\t100000\t \n" +
//                "Cena\t1000\t \n"+
//                "Gastos de comida: 1000\n" +
//                "Total de gastos: 101000\n", reporte.imprimir(List.of(g1,g2), LocalDate.of(2024,4, 19)));
//    }
    public void gastosMultiplesCenaMayor500() {
        var g1 = new GastoDesayuno(10000);
        var g2 = new GastoCena(10);
        var reporte = new ReporteDeGastos();
        assertEquals("Expenses 2024-04-19\n" +
                "Desayuno 10000 X\n" +
                "Cena 10  \n"+
                "Gastos de comida: 10010\n" +
                "Total de gastos: 10010\n", reporte.imprimir(List.of(g1,g2), LocalDate.of(2024,4, 19)));
    }
//    public void gastosMultiples() {
//        var g1 = new GastoDesayuno(10000);
//        var g2 = new GastoCena(10);
//        var reporte = new ReporteDeGastos();
//        assertEquals("Expenses 2024-04-19\n" +
//                "Desayuno 10000 X\n" +
//                "Cena 10  \n"+
//                "Gastos de comida: 10010\n" +
//                "Total de gastos: 10010\n", reporte.imprimir(List.of(g1,g2), LocalDate.of(2024,4, 19)));
//    }

    @Test
    public void gastosMultiples() {
        var g1 = new GastoDesayuno(10000);
        var g2 = new GastoCena(10);
        var reporte = new ReporteDeGastos();

        String salidaEsperada = "Expenses 2024-04-19\n" +
                "Desayuno\t10000\tX\n" +
                "Cena\t10\t \n" +
                "Gastos de comida: 10010\n" +
                "Total de gastos: 10010\n";

        assertEquals(salidaEsperada, reporte.imprimir(List.of(g1, g2), LocalDate.of(2024, 4, 19)));
    }
}