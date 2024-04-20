package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

abstract class Gasto {
    int monto;

    public Gasto(int monto){
        this.monto = monto;
    }

    abstract String nombre();

    public int monto(){
        return this.monto;
    }
    protected int montoComida() {
        return 0;
    }

    protected boolean esExcesoDeComida() {
        return false;
    }
}

public class ReporteDeGastos {
    public String imprimir(List<Gasto> gastos, LocalDate fechaDelReporte) {
        String reporte = "";
        int total = 0;
        int gastosDeComida = 0;

        reporte = "Expenses " + fechaDelReporte + System.lineSeparator();

        for (Gasto gasto : gastos) {
            gastosDeComida += gasto.montoComida();
            String marcaExcesoComidas = gasto.esExcesoDeComida() ? "X" : " ";

            reporte += gasto.nombre() +"\t"+ gasto.monto() +"\t"+ marcaExcesoComidas + System.lineSeparator();
            total += gasto.monto();
        }

        reporte += "Gastos de comida: " + gastosDeComida + System.lineSeparator();
        reporte += "Total de gastos: " + total + System.lineSeparator();

        return reporte;
    }

}


