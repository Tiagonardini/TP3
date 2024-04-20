package oop2.tp3.ejercicio1.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final List<Alquiler> alquileres;
    private final String name;
    private Double totalDeuda;
    private Integer puntosObtenidos;

    private static final Integer ES_MAYOR_A_UNO = 1;
    public Cliente(String nombre) {
        this.name = nombre;
        this.alquileres = new ArrayList<>();
        this.totalDeuda = 0.0;
        this.puntosObtenidos = 0;
    }


    public void agregarAlquileres (Alquiler alquiler){
        this.alquileres.add(alquiler);
    }

    public double totalDeuda(){
        return totalDeuda;
    }



    public void calcularDeudaYPuntoObtenidos (Alquiler alquiler) {
        for (Alquiler alquiler1: alquileres){
            totalDeuda += alquiler.calcularMontoLibro();
            puntosObtenidos += alquiler.puntajeLibros();
        }
    }

//    public Object[] calcularDeudaYPuntosObtenidos() {
//        Object[] resultado = new Object[2];
//        double total = 0;
//        int puntosAlquilerFrecuente = 0;
//        for (Alquiler alquiler : alquileres) {
//            double monto = 0;
//// determine amounts for each line
//            switch (alquiler.copia().libro().codigoPrecio()) {
//                case Libro.REGULARES:
//                    monto += 2;
//                    if (alquiler.diasAlquilados() > 2)
//                        monto += (alquiler.diasAlquilados() - 2) * 1.5;
//                    break;
//                case Libro.NUEVO_LANZAMIENTO:
//                    monto += alquiler.diasAlquilados() * 3;
//                    break;
//                case Libro.INFANTILES:
//                    monto += 1.5;
//                    if (alquiler.diasAlquilados() > 3)
//                        monto += (alquiler.diasAlquilados() - 3) * 1.5;
//                    break;
//            }
//            total += monto;
//            // sumo puntos por alquiler
//            puntosAlquilerFrecuente++;
//            // bonus por dos días de alquiler de un nuevo lanzamiento
//            if ((alquiler.copia().libro().codigoPrecio() == Libro.NUEVO_LANZAMIENTO)
//                    && alquiler.diasAlquilados() > 1) {
//                puntosAlquilerFrecuente++;
//            }
//        }
//        resultado[0] = total;
//        resultado[1] = puntosAlquilerFrecuente;
//        return resultado;
//    }

    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }

    public Integer puntosObtenidos (){
        return this.puntosObtenidos;
    }
}