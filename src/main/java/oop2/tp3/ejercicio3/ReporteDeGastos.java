package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

enum TipoDeGasto {
    CENA, DESAYUNO, ALQUILER_AUTO
}

abstract class Gasto {
    TipoDeGasto tipoGasto;
    int monto;

    public Gasto(int monto){
        this.monto = monto;
    }

    abstract String nombre();
}

public class ReporteDeGastos {
    public String imprimir(List<Gasto> gastos, LocalDate fechaDelReporte) {
        String reporte = "";
        int total = 0;
        int gastosDeComida = 0;

//        reporte = "Expenses " + fechaDelReporte + System.lineSeparator();
        System.out.println("Expenses " + fechaDelReporte);

        for (Gasto gasto : gastos) {
            if (gasto.tipoGasto == TipoDeGasto.CENA || gasto.tipoGasto == TipoDeGasto.DESAYUNO) {
                gastosDeComida += gasto.monto;
            }

            String nombreGasto = "";
            switch (gasto.tipoGasto) {
                case CENA:
                    nombreGasto = "Cena";
                    break;
                case DESAYUNO:
                    nombreGasto = "Desayuno";
                    break;
                case ALQUILER_AUTO:
                    nombreGasto = "Alquiler de Autos";
                    break;
            }

            String marcaExcesoComidas = gasto.tipoGasto == TipoDeGasto.CENA && gasto.monto > 5000
                    || gasto.tipoGasto == TipoDeGasto.DESAYUNO && gasto.monto > 1000 ? "X" : " ";

//            reporte += nombreGasto + "\t" + gasto.monto + "\t" + marcaExcesoComidas + System.lineSeparator();
            System.out.println(nombreGasto + "\t" + gasto.monto + "\t" + marcaExcesoComidas);
            total += gasto.monto;
        }

//        reporte += "Gastos de comida: " + gastosDeComida + System.lineSeparator();
        System.out.println("Gastos de comida: " + gastosDeComida);
        System.out.println("Total de gastos: " + total);//
        // reporte += "Total de gastos: " + total + System.lineSeparator();
        return reporte;
    }

}


