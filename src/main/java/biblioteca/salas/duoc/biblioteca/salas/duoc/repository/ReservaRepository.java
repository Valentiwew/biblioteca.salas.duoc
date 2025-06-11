package biblioteca.salas.duoc.biblioteca.salas.duoc.repository;

/* Importamos la clase (Reserva) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Reserva;

/* Importamos JpaRepository para acceder a funciones CRUD y manejo de datos  */
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
}