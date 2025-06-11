package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import jakarta.persistence.*; /* Importamos las anotaciones JPA para definir entidades y tablas en la base de datos */
import lombok.Data; /* Importamos la anotacion de Lombok para generar automaticamente getters, setters, toString, etc. */
import lombok.AllArgsConstructor; /* Importamos la anotacion de Lombok para crear un constructor con todos los atributos */
import lombok.NoArgsConstructor; /* Importamos la anotacion de Lombok para crear un constructor sin argumentos */

@Entity
@Table(name = "carrera")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carrera {
    @Id
    private String codigo;
    private String nombre;

}
