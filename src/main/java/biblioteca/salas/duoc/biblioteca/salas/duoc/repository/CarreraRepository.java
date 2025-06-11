package biblioteca.salas.duoc.biblioteca.salas.duoc.repository;

/* Importamos la clase (Carrera) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Carrera;

/* Importamos JpaRepository para acceder a funciones CRUD y manejo de datos  */
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarreraRepository extends JpaRepository<Carrera, String> {
}