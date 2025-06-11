package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

/* Importamos las clases (TipoSala- TipoSalaRepository) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.TipoSala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.TipoSalaRepository;

/* Importamos la anotacion para que Spring pueda inyectar objetos automaticamente */
import org.springframework.beans.factory.annotation.Autowired;

/* Importamos @Service para marcar esta clase como un servicio de Spring */
import org.springframework.stereotype.Service;

/* Importamos la clase List para manejar listas */
import java.util.List;

@Service
public class TipoSalaService {
    @Autowired
    private TipoSalaRepository tipoSalaRepository;

    /* Metodo para Listar todos los Tipos de Sala */
    public List<TipoSala> listarTodos() {
        return tipoSalaRepository.findAll();
    }

    /* Metodo para Obtener por id cada Tipo de Sala */
    public TipoSala obtenerPorId(Integer id) {
        return tipoSalaRepository.findById(id).orElse(null);
    }

    /* Metodo para guardar un Tipo de Sala */
    public TipoSala guardar(TipoSala tipoSala) {
        return tipoSalaRepository.save(tipoSala);
    }

    /* Metodo para eliminar por Id un Tipo de Sala */
    public void eliminarPorId(Integer id) {
        tipoSalaRepository.deleteById(id);
    }
}
