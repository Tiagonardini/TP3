package oop2.tp3.ejercicio1.main;

import oop2.tp3.ejercicio1.calculadora.CalculadorLibroRegular;
import oop2.tp3.ejercicio1.calculadora.CalculadoraLibroInfantil;
import oop2.tp3.ejercicio1.calculadora.CalculadoraLibroNuevoLanzamiento;
import oop2.tp3.ejercicio1.modelo.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Main {
    public static void main(String args[]) {
//        Libro elTunel = new Libro("El Túnel", Libro.REGULARES);
//        Libro antesDelFin = new Libro("Antes del Fin", Libro.REGULARES);
//        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
//        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
//        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
//        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
//        Cliente yo = new Cliente("Javier");
//        yo.alquilar(alquilerElTunel);
//        yo.alquilar(alquilerAntesDelFin);
//        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
//
//
//        System.out.println(resultado[0]);
//        System.out.println(resultado[1]);
    }

    @Test
    public void alquilerLibrosRegulares() {
          var calculadoraLibroRegular = new CalculadorLibroRegular();
          var libro = new Regular("El tunel");
          var alquiler = new Alquiler(libro, 5);
          var cliente = new Cliente("Tiago");

          cliente.agregarAlquileres(alquiler);

          cliente.calcularDeudaYPuntoObtenidos(calculadoraLibroRegular, libro);

          assertEquals(6.5, cliente.totalDeuda(), 0.001);
          assertEquals(Integer.valueOf(1), cliente.puntosObtenidos());
    }

    @Test
    public void alquilerLibrosInfantiles() {
        var calculadoraLibroInfantil = new CalculadoraLibroInfantil();
        var libro = new Infantil("El Principito");
        var alquiler = new Alquiler(libro, 12);
        var cliente = new Cliente("Tiago");

        cliente.agregarAlquileres(alquiler);

        cliente.calcularDeudaYPuntoObtenidos(calculadoraLibroInfantil, libro);

        assertEquals(15.0, cliente.totalDeuda(), 0.001);
        assertEquals(Integer.valueOf(1), cliente.puntosObtenidos());
    }

    @Test
    public void alquilerLibrosNuevosLanzamiento() {
        var calculadoraLibroNuevoLanzamiento = new CalculadoraLibroNuevoLanzamiento();
        var libro = new NuevoLanzamiento("El diario de Bridget Jones");
        var alquiler = new Alquiler(libro, 20);
        var cliente = new Cliente("Tiago");

        cliente.agregarAlquileres(alquiler);

        cliente.calcularDeudaYPuntoObtenidos(calculadoraLibroNuevoLanzamiento, libro);

        assertEquals(60.0, cliente.totalDeuda(), 0.001);
        assertEquals(Integer.valueOf(2), cliente.puntosObtenidos());
    }
    @Test
    public void alquilerDeLibroRegularSinSuperarDiasAlquilados(){

            var calculadoraLibroRegular = new CalculadorLibroRegular();
            var libro = new Regular("El tunel");
            var alquiler = new Alquiler(libro, 1);
            var cliente = new Cliente("Tiago");

            cliente.agregarAlquileres(alquiler);

            cliente.calcularDeudaYPuntoObtenidos(calculadoraLibroRegular, libro);

            assertEquals(2,cliente.totalDeuda(), 0.001);
            assertEquals(Integer.valueOf(1), cliente.puntosObtenidos());

    }


}