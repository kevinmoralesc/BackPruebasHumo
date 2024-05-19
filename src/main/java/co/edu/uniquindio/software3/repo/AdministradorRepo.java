package co.edu.uniquindio.software3.repo;

import co.edu.uniquindio.software3.entidades.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepo extends JpaRepository<Administrador,Integer> {
}
