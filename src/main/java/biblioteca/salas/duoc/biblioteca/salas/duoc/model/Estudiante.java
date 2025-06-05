package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

/* Importamos las anotaciones JPA para definir entidades y tablas en la base de datos */
import jakarta.persistence.*;

/* Importamos la anotacion de Lombok para generar automaticamente getters, setters, toString, etc. */
import lombok.Data;

/* Importamos la anotacion de Lombok para crear un constructor con todos los atributos */
import lombok.AllArgsConstructor;

/* Importamos la anotacion de Lombok para crear un constructor sin argumentos */
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estudiante")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 9)
    private String run;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(nullable = true, length = 100)
    private String correo;

    @Column(nullable = false, length = 100)
    private String jornada;

    @Column(nullable = true, length = 100)
    private Integer telefono;

    @ManyToOne
    @JoinColumn(name = "carrera_codigo", nullable = false)
    private Carrera carrera;

}
