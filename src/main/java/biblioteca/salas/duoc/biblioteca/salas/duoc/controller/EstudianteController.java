package biblioteca.salas.duoc.biblioteca.salas.duoc.controller;

/* Importamos las clases (Estudiante - EstudianteService) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Estudiante;
import biblioteca.salas.duoc.biblioteca.salas.duoc.service.EstudianteService;

/* Importamos la anotacion para que Spring pueda inyectar objetos automaticamente */
import org.springframework.beans.factory.annotation.Autowired;

/* Importamos todas las anotaciones */
import org.springframework.web.bind.annotation.*;

/* Importamos la clase List para manejar listas */
import java.util.List;

@RestController
@RequestMapping("/api/v1/estudiantes") /* La estructura del HTTP de nuestra API */
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping /* Anotacion que obtiene a Todos los Estudiantes */
    public List<Estudiante> listarTodosEstudiantes() {
        return estudianteService.listarTodos();
    }

    @GetMapping("/{id}") /* Anotacion que obtiene a los Estudiantes por su ID */
    public Estudiante obtenerEstudiantesPorId(@PathVariable Integer id) {
        return estudianteService.obtenerPorId(id);
    }

    @PostMapping /* Anotacion que sirve para Crear un Estudiante */
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.guardar(estudiante);
    }

    @PutMapping("/{id}") /* Anotacion que sirve para Actualizar a un Estudiante */
    public Estudiante actualizarEstudiante(@PathVariable Integer id, @RequestBody Estudiante estudiante) {
        /* setId, es el objeto de la clase "Estudiante",
           Que esta recibiendo desde @RequestBody */
        estudiante.setId(id);
        return estudianteService.guardar(estudiante);
    }

    @DeleteMapping("/{id}") /* Anotacion para Eliminar a un Estudiante */
    public void eliminarEstudiante(@PathVariable Integer id) {
        estudianteService.eliminarPorId(id);
    }
}
