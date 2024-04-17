package oop2.tp3.ejercicio3;

public class GastoCena extends Gasto{
    public GastoCena(int monto) {
        super(monto);
    }

    @Override
    String nombre() {
        return "Cena";
    }
}
