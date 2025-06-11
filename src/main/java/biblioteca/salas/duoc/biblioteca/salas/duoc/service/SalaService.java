package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

/* Importamos las clases (Sala- SalaRepository) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Sala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.SalaRepository;

/* Importamos la anotacion para que Spring pueda inyectar objetos automaticamente */
import org.springframework.beans.factory.annotation.Autowired;

/* Importamos @Service para marcar esta clase como un servicio de Spring */
import org.springframework.stereotype.Service;

/* Importamos la clase List para manejar listas */
import java.util.List;

@Service
public class SalaService {
    @Autowired
    private SalaRepository salaRepository;

    /* Metodo para Listar todas las salas */
    public List<Sala> listarTodos() {
        return salaRepository.findAll();
    }

    /* Metodo para obtener una Sala por ID*/
    public Sala obtenerPorId(Integer id) {
        return salaRepository.findById(id).orElse(null);
    }

    /* Metodo para guardar una Sala */
    public Sala guardar(Sala sala) {
        return salaRepository.save(sala);
    }

    /* Metodo para eliminar por Id una Sala */
    public void eliminarPorId(Integer id) {
        salaRepository.deleteById(id);
    }
}
