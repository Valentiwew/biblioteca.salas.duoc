package biblioteca.salas.duoc.biblioteca.salas.duoc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
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
