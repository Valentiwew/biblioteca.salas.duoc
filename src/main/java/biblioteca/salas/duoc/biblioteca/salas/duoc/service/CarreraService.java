package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Carrera;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.CarreraRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Transactional
public class CarreraService {

    @Autowired
    private CarreraRepository carreraRepository;

    public List<Carrera> listar() {
        return carreraRepository.findAll();
    }

    public Carrera obtenerCarreraPorId(String codigo) {
        return carreraRepository.findById(codigo).get();
    }

    public Carrera guardarCarrera(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    public void eliminarCarrera(String codigo) {
        carreraRepository.deleteById(codigo);
    }
}
