package wellfernandes.com.github.equipamentdatacollectionapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wellfernandes.com.github.equipamentdatacollectionapi.entities.Equipament;

@Repository
public interface EquipamentRepository extends JpaRepository<Equipament, Long> {

}
