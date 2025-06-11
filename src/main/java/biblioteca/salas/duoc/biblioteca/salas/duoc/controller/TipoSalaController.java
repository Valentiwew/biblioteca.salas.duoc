package biblioteca.salas.duoc.biblioteca.salas.duoc.controller;

/* Importamos las clases (TipoSala - TipoSalaService) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.TipoSala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.service.TipoSalaService;

/* Importamos la anotacion para que Spring pueda inyectar objetos automaticamente */
import org.springframework.beans.factory.annotation.Autowired;

/* Importamos todas las anotaciones */
import org.springframework.web.bind.annotation.*;

/* Importamos la clase List para manejar listas */
import java.util.List;

@RestController
@RequestMapping("/api/v1/tipo-salas") /* La estructura del HTTP de nuestra API */
public class TipoSalaController {
    @Autowired
    private TipoSalaService tipoSalaService;

    @GetMapping
    public List<TipoSala> listarTodoTipoSalas() {
        return tipoSalaService.listarTodos();
    }

    @GetMapping("/{id}")
    public TipoSala obtenerTipoSalaPorId(@PathVariable Integer id) {
        return tipoSalaService.obtenerPorId(id);
    }

    @PostMapping
    public TipoSala crearTipoSala(@RequestBody TipoSala tipoSala) {
        return tipoSalaService.guardar(tipoSala);
    }

    @PutMapping("/{id}")
    public TipoSala actualizarTipoSala(@PathVariable Integer id, @RequestBody TipoSala tipoSala) {
        tipoSala.setIdTipo(id);
        return tipoSalaService.guardar(tipoSala);
    }

    @DeleteMapping("/{id}")
    public void eliminarTipoSala(@PathVariable Integer id) {
        tipoSalaService.eliminarPorId(id);
    }
}
