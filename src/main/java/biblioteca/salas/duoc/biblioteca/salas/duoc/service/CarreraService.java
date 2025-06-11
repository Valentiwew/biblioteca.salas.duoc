package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

/* Importamos la clase (Carrera - CarreraRepository) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Carrera;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.CarreraRepository;

/* Importamos @Autowired para que Spring inyecte automaticamente dependencias  */
import org.springframework.beans.factory.annotation.Autowired;

/* Importamos @Service para marcar esta clase como un servicio de Spring */
import org.springframework.stereotype.Service;

/* Importamos la clase List para manejar listas */
import java.util.List;

@Service
public class CarreraService {
    @Autowired
    private CarreraRepository carreraRepository;

    /* Metodo para obtener a todas las carreras de la BD */
    public List<Carrera> listarTodo() {
        return carreraRepository.findAll();
    }

    /* Metodo para obtener una carrera por un Codigo*/
    public Carrera obtenerCodigo(String codigo) {
        return carreraRepository.findById(codigo).orElse(null);
    }

    /* Metodo para guardar una carrera */
    public Carrera guardar(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    /* Metodo para eliminar un codigo de una carrera */
    public void eliminarCodigo(String codigo) {
        carreraRepository.deleteById(codigo);
    }
}
