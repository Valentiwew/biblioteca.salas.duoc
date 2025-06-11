package biblioteca.salas.duoc.biblioteca.salas.duoc.repository;

/* Importamos la clase (Estudiante) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Estudiante;

/* Importamos JpaRepository para acceder a funciones CRUD y manejo de datos  */
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

}
