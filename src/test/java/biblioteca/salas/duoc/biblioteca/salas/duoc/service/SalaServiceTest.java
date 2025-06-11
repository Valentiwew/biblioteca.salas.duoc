package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

/* Importamos Mockito */
import static org.mockito.Mockito.*;

/* Importamos Jupiter */
import static org.junit.jupiter.api.Assertions.*;

/* Importamos las clases (Sala - TipoSala - SalaRepository - SalaService) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Sala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.TipoSala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.SalaRepository;

/* Importamos  */
import org.junit.jupiter.api.Test;

/* Importamos  */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/* Importamos  */
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class SalaServiceTest {

    @Autowired
    private SalaService salaService;

    @MockBean
    private SalaRepository salaRepository;

    @Test
    public void testFindAll() {
        when(salaRepository.findAll()).thenReturn(List.of(new Sala(1, "Sala A", 30, 1, new TipoSala())));

        List<Sala> salas = salaService.listarTodos();
        assertNotNull(salas);
        assertEquals(1, salas.size());
    }

    @Test
    public void testFindById() {
        Integer id = 1;
        Sala sala = new Sala(id, "Sala A", 30, 1, new TipoSala());
        when(salaRepository.findById(id)).thenReturn(Optional.of(sala));

        Sala found = salaService.obtenerPorId(id);
        assertNotNull(found);
        assertEquals(id, found.getCodigo());
    }

    @Test
    public void testSave() {
        Sala sala = new Sala(1, "Sala A", 30, 1, new TipoSala());
        when(salaRepository.save(sala)).thenReturn(sala);

        Sala saved = salaService.guardar(sala);
        assertNotNull(saved);
        assertEquals("Sala A", saved.getNombre());
    }

    @Test
    public void testDeleteById() {
        Integer id = 1;
        doNothing().when(salaRepository).deleteById(id);

        salaService.eliminarPorId(id);
        verify(salaRepository, times(1)).deleteById(id);
    }
}
