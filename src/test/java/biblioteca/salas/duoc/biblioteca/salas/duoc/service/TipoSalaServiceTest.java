package biblioteca.salas.duoc.biblioteca.salas.duoc.service;

/* Importamos Mockito */
import static org.mockito.Mockito.*;

/* Importamos Jupiter */
import static org.junit.jupiter.api.Assertions.*;

/* Importamos las clases (TipoSala - TipoSalaRepository - TipoSalaService) */
import biblioteca.salas.duoc.biblioteca.salas.duoc.model.TipoSala;
import biblioteca.salas.duoc.biblioteca.salas.duoc.repository.TipoSalaRepository;
import biblioteca.salas.duoc.biblioteca.salas.duoc.service.TipoSalaService;

/* Importamos Jupiter */
import org.junit.jupiter.api.Test;

/* Importamos  */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

/* Importamos List - Optional */
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class TipoSalaServiceTest {

    @Autowired
    private TipoSalaService tipoSalaService;

    @MockBean
    private TipoSalaRepository tipoSalaRepository;

    @Test
    public void testFindAll() {
        when(tipoSalaRepository.findAll()).thenReturn(List.of(new TipoSala(1, "Laboratorio")));

        List<TipoSala> tipos = tipoSalaService.listarTodos();
        assertNotNull(tipos);
        assertEquals(1, tipos.size());
    }

    @Test
    public void testFindById() {
        Integer id = 1;
        TipoSala tipoSala = new TipoSala(id, "Laboratorio");
        when(tipoSalaRepository.findById(id)).thenReturn(Optional.of(tipoSala));

        TipoSala found = tipoSalaService.obtenerPorId(id);
        assertNotNull(found);
        assertEquals(id, found.getIdTipo());
    }

    @Test
    public void testSave() {
        TipoSala tipoSala = new TipoSala(1, "Laboratorio");
        when(tipoSalaRepository.save(tipoSala)).thenReturn(tipoSala);

        TipoSala saved = tipoSalaService.guardar(tipoSala);
        assertNotNull(saved);
        assertEquals("Laboratorio", saved.getNombre());
    }

    @Test
    public void testDeleteById() {
        Integer id = 1;
        doNothing().when(tipoSalaRepository).deleteById(id);

        tipoSalaService.eliminarPorId(id);
        verify(tipoSalaRepository, times(1)).deleteById(id);
    }
}
