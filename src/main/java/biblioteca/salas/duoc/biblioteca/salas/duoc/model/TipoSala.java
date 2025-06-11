package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor; /* Importamos la anotacion de Lombok para crear un constructor con todos los atributos */
import lombok.Data; /* Importamos la anotacion de Lombok para generar automaticamente getters, setters, toString, etc. */
import lombok.NoArgsConstructor; /* Importamos la anotacion de Lombok para crear un constructor sin argumentos */


@Entity
@Table(name = "tipo_sala")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoSala {
    @Id
    private Integer idTipo;
    private String nombre;

    // Getters and Setters
}