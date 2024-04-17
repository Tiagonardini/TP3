package oop2.tp3.ejercicio3;

public class GastoDesayuno extends Gasto{
    public GastoDesayuno(int monto) {
        super(monto);
    }

    @Override
    String nombre() {
        return "Desayuno";
    }
}
