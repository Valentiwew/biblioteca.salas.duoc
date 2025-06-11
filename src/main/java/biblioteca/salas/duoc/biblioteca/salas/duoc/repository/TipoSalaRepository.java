package biblioteca.salas.duoc.biblioteca.salas.duoc.repository;

/* Importamos la clase (TipoSala) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.TipoSala;

/* Importamos JpaRepository para acceder a funciones CRUD y manejo de datos  */
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoSalaRepository extends JpaRepository<TipoSala, Integer> {
}