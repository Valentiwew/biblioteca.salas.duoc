package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

/* Importamos la clase (Estudiante - EstudianteRepository) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Estudiante;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.EstudianteRepository;

/* Importamos @Autowired para que Spring inyecte automaticamente dependencias  */
import org.springframework.beans.factory.annotation.Autowired;

/* Importamos @Service para marcar esta clase como un servicio de Spring */
import org.springframework.stereotype.Service;

/* Importamos la clase List para manejar listas */
import java.util.List;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    /* Metodo para obtener a todos los estudiantes de la BD */
    public List<Estudiante> obtenerTodos() {
        return estudianteRepository.findAll();
    }

    /* Metodo para obtener un estudiante por ID*/
    public Estudiante obtenerPorId(Long id) {
        /* Lo que hace es llamar al repository para buscar al estudiante por su ID y si no lo encuentra, nos devuelve un null */
        return estudianteRepository.findById(id).orElse(null);
    }

    /* Metodo para guardar un estudiante en la BD */
    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    /* Metodo para eliminar un estudiante por su ID */
    public void eliminarPorId(Long id) {
        estudianteRepository.deleteById(id);
    }
}