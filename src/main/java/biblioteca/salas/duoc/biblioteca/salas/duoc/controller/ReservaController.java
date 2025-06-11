package biblioteca.salas.duoc.biblioteca.salas.duoc.controller;

/* Importamos las clases (Reserva - ReservaService) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Reserva;
import biblioteca.salas.duoc.biblioteca.salas.duoc.service.ReservaService;

/* Importamos la anotacion para que Spring pueda inyectar objetos automaticamente */
import org.springframework.beans.factory.annotation.Autowired;

/* Importamos todas las anotaciones */
import org.springframework.web.bind.annotation.*;

/* Importamos la clase List para manejar listas */
import java.util.List;

@RestController
@RequestMapping("/api/v1/reservas") /* La estructura del HTTP de nuestra API */
public class ReservaController {
    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public List<Reserva> listarTodasReservas() {
        return reservaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Reserva obtenerReservaById(@PathVariable Integer id) {
        return reservaService.obtenerPorId(id);
    }

    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva reserva) {
        return reservaService.guardar(reserva);
    }

    @PutMapping("/{id}")
    public Reserva actualizarReserva(@PathVariable Integer id, @RequestBody Reserva reserva) {
        reserva.setId(id);
        return reservaService.guardar(reserva);
    }

    @DeleteMapping("/{id}")
    public void eliminarReserva(@PathVariable Integer id) {
        reservaService.eliminarPorId(id);
    }
}