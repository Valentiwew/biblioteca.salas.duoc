package biblioteca.salas.duoc.biblioteca.salas.duoc.controller;

/* Importamos las clases (Sala - SalaService) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Sala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.service.SalaService;

/* Importamos la anotacion para que Spring pueda inyectar objetos automaticamente */
import org.springframework.beans.factory.annotation.Autowired;

/* Importamos todas las anotaciones */
import org.springframework.web.bind.annotation.*;

/* Importamos la clase List para manejar listas */
import java.util.List;

@RestController
@RequestMapping("/api/v1/salas") /* La estructura del HTTP de nuestra API */
public class SalaController {
    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> listarTodaSalas() {
        return salaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Sala obtenerSalaPorId(@PathVariable Integer id) {
        return salaService.obtenerPorId(id);
    }

    @PostMapping
    public Sala crearSala(@RequestBody Sala sala) {
        return salaService.guardar(sala);
    }

    @PutMapping("/{id}")
    public Sala actualizarSala(@PathVariable Integer id, @RequestBody Sala sala) {
        sala.setCodigo(id);
        return salaService.guardar(sala);
    }

    @DeleteMapping("/{id}")
    public void eliminarSala(@PathVariable Integer id) {
        salaService.eliminarPorId(id);
    }
}
