package biblioteca.salas.duoc.biblioteca.salas.duoc.repository;

import biblioteca.salas.duoc.biblioteca.salas.duoc.model.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CarreraRepository extends JpaRepository<Carrera, String> {
    //Hay que eliminar y reacerlos porque son un interface, no una clase xd

}
