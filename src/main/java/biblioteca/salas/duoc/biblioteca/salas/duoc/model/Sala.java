package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import jakarta.persistence.*; /* Importamos las anotaciones JPA para definir entidades y tablas en la base de datos */
import lombok.Data; /* Importamos la anotacion de Lombok para generar automaticamente getters, setters, toString, etc. */
import lombok.AllArgsConstructor; /* Importamos la anotacion de Lombok para crear un constructor con todos los atributos */
import lombok.NoArgsConstructor; /* Importamos la anotacion de Lombok para crear un constructor sin argumentos */

@Entity
@Table(name = "sala")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sala {
    @Id
    private Integer codigo;
    private String nombre;
    private Integer capacidad;
    private Integer idInstituo;

    @ManyToOne
    @JoinColumn(name = "id_tipo", nullable = false)
    private TipoSala tipoSala;

    // Getters and Setters
}
