package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

/* Importamos la clase (Reserva - ReservaRepository) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Reserva;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.ReservaRepository;

/* Importamos la anotacion para que Spring pueda inyectar objetos automaticamente */
import org.springframework.beans.factory.annotation.Autowired;

/* Importamos @Service para marcar esta clase como un servicio de Spring */
import org.springframework.stereotype.Service;

/* Importamos la clase List para manejar listas */
import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    /* Metodo para listar a todas las Reservas */
    public List<Reserva> listarTodos() {
        return reservaRepository.findAll();
    }

    /* Metodo para obtener por Id una Reserva */
    public Reserva obtenerPorId(Integer id) {
        return reservaRepository.findById(id).orElse(null);
    }

    /* Metodo para guardar una Reserva */
    public Reserva guardar(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    /* Metodo para eliminar Por Id una Reserva */
    public void eliminarPorId(Integer id) {
        reservaRepository.deleteById(id);
    }
}