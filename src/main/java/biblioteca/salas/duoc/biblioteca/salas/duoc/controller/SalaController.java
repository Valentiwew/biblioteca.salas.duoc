package biblioteca.salas.duoc.biblioteca.salas.duoc.controller;

import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Sala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/salas")
public class SalaController {
    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> getAllSalas() {
        return salaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Sala getSalaById(@PathVariable Integer id) {
        return salaService.obtenerPorId(id);
    }

    @PostMapping
    public Sala createSala(@RequestBody Sala sala) {
        return salaService.guardar(sala);
    }

    @PutMapping("/{id}")
    public Sala updateSala(@PathVariable Integer id, @RequestBody Sala sala) {
        sala.setCodigo(id);
        return salaService.guardar(sala);
    }

    @DeleteMapping("/{id}")
    public void deleteSala(@PathVariable Integer id) {
        salaService.eliminarPorId(id);
    }
}
