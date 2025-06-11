package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import jakarta.persistence.*; /* Importamos las anotaciones JPA para definir entidades y tablas en la base de datos */
import lombok.Data; /* Importamos la anotacion de Lombok para generar automaticamente getters, setters, toString, etc. */
import lombok.AllArgsConstructor; /* Importamos la anotacion de Lombok para crear un constructor con todos los atributos */
import lombok.NoArgsConstructor; /* Importamos la anotacion de Lombok para crear un constructor sin argumentos */

/* Importamos la clase List para manejar listas */
import java.util.Date;

@Entity
@Table(name = "reserva")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    @Id
    private Integer id;
    private Date fechaSolicitada;
    private Date horaSolicitada;
    private Date horaCierre;
    private Integer estado;

    @ManyToOne
    @JoinColumn(name = "id_estudiante", nullable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "codigo_sala", nullable = false)
    private Sala sala;

    // Getters and Setters
}