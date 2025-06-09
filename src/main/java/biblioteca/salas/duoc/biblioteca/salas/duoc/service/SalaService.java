package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Sala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {
    @Autowired
    private SalaRepository salaRepository;

    public List<Sala> listarTodos() {
        return salaRepository.findAll();
    }

    public Sala obtenerPorId(Integer id) {
        return salaRepository.findById(id).orElse(null);
    }

    public Sala guardar(Sala sala) {
        return salaRepository.save(sala);
    }

    public void eliminarPorId(Integer id) {
        salaRepository.deleteById(id);
    }
}
