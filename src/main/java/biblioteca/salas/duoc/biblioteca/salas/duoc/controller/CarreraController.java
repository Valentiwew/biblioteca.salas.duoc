package biblioteca.salas.duoc.biblioteca.salas.duoc.controller;

import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Carrera;
import biblioteca.salas.duoc.biblioteca.salas.duoc.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/carreras")

public class CarreraController {
    @Autowired
    private CarreraService carreraService;

    @GetMapping
    public ResponseEntity<List<Carrera>> listar() {
        List<Carrera> carreras = carreraService.listar();
        if (carreras.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(carreras, HttpStatus.OK);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Carrera> obtenerCarreraPorId(@PathVariable String codigo) {
        try {
            Carrera carrera = carreraService.obtenerCarreraPorId(codigo);
            return new ResponseEntity<>(carrera, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Carrera> crearCarrera(@RequestBody Carrera carrera) {
        Carrera savedCarrera = carreraService.guardarCarrera(carrera);
        return new ResponseEntity<>(savedCarrera, HttpStatus.CREATED);
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<Carrera> actualizarCarrera(@PathVariable String codigo, Carrera carrera) {
        try {
            Carrera carreraActualizada = carreraService.obtenerCarreraPorId(codigo);
            carreraActualizada.setCodigo(codigo);
            carreraActualizada.setNombre(carrera.getNombre());

            carreraService.guardarCarrera(carreraActualizada);
            return new ResponseEntity<>(carreraActualizada, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> eliminarCarrera(@PathVariable String codigo) {
        try {
            carreraService.eliminarCarrera(codigo);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
