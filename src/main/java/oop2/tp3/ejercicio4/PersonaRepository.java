package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PersonaRepository {

    private Jdbi jdbi;

    public PersonaRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    /**
     * Busca por nombre a parte
     */
    public List<Persona> buscarPorNombre(String nombreOParte) throws IOException {
        return jdbi.withHandle(handle -> {
            var rs = handle
                    .select("select nombre, apellido from persona where nombre like ?")
                    .bind(0, "%" + nombreOParte + "%").mapToMap(String.class).list();

            Objects.requireNonNull(rs, "La lista de personas no puede ser nula.");
            var personas = new ArrayList<Persona>();
            for (Map<String, String> map : rs) {
                personas.add(new Persona(map.get("nombre"), map.get("apellido")));
            }
            return personas;
        });

    }
    /**
     * Dado un id, retorna:
     * - null si el id no se encuentra en la BD
     * - la instancia de Persona encontrada
     */
    public Persona buscarId(Long id) throws IOException {
        return jdbi.withHandle(handle -> {
            var rs = handle
                    .select("select nombre, apellido from persona where id_persona = ?")
                    .bind(0, id).mapToMap(String.class).list();
            Objects.requireNonNull(rs, "La lista de personas no puede ser nula.");
            if (rs.isEmpty()) {
                return new Persona(rs.get(0).get("nombre"), rs.get(0).get("apellido"));
            }else throw new IOException("La persona no se encuentra dentro de la base de datos");
        });
    }

}
