package biblioteca.salas.duoc.biblioteca.salas.duoc.controller;

/* Importamos las clases (Carrera - CarreraService) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Carrera;
import biblioteca.salas.duoc.biblioteca.salas.duoc.service.CarreraService;

/* Importamos la anotacion para que Spring pueda inyectar objetos automaticamente */
import org.springframework.beans.factory.annotation.Autowired;

/* Importamos todas las anotaciones */
import org.springframework.web.bind.annotation.*;

/* Importamos la clase List para manejar listas */
import java.util.List;

@RestController
@RequestMapping("/api/v1/carreras") /* La estructura del HTTP de nuestra API */
public class CarreraController {
    @Autowired
    private CarreraService carreraService;

    @GetMapping
    public List<Carrera> listarCarreras() {
        return carreraService.listarTodo();
    }

    @GetMapping("/{codigo}")
    public Carrera obtenerCarreraPorCodigo(@PathVariable String codigo) {
        return carreraService.obtenerCodigo(codigo);
    }

    @PostMapping
    public Carrera crearCarrera(@RequestBody Carrera carrera) {
        return carreraService.guardar(carrera);
    }

    @PutMapping("/{codigo}")
    public Carrera actualizarCarrera(@PathVariable String codigo, @RequestBody Carrera carrera) {
        carrera.setCodigo(codigo);
        return carreraService.guardar(carrera);
    }

    @DeleteMapping("/{codigo}")
    public void eliminarCarrera(@PathVariable String codigo) {
        carreraService.eliminarCodigo(codigo);
    }
}
