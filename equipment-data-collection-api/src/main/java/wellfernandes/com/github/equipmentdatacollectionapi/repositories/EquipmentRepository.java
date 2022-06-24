package wellfernandes.com.github.equipmentdatacollectionapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wellfernandes.com.github.equipmentdatacollectionapi.entities.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

}
