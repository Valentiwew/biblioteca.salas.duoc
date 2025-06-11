package biblioteca.salas.duoc.biblioteca.salas.duoc.repository;

/* Importamos la clase (Sala) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Sala;

/* Importamos JpaRepository para acceder a funciones CRUD y manejo de datos  */
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaRepository extends JpaRepository<Sala, Integer> {
}