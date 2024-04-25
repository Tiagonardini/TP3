package oop2.tp3.ejercicio4;



import org.jdbi.v3.core.Jdbi;

import java.io.IOException;

import static java.lang.Object.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

        new SetUpDatabase(jdbi).setUp();

        var repo = new PersonaRepository(jdbi);
        var personas = repo.buscarPorNombre("Jos");
        for (Persona persona : personas) {
            System.out.println(persona.nombre() + " " + persona.apellido());
        }

        var persona = repo.buscarId(2L);
        System.out.println(persona.nombre() + " " + persona.apellido());

    }
}
