package wellfernandes.com.github.equipmentdatacollectionapi.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wellfernandes.com.github.equipmentdatacollectionapi.entities.Equipment;
import wellfernandes.com.github.equipmentdatacollectionapi.repositories.EquipmentRepository;

@Service
public class EquipmentService {

	@Autowired
	private EquipmentRepository equipmentRepository;

	public List<Equipment> findAll() {
		return equipmentRepository.findAll();
	}

	public Equipment findById(Long id) {
		Optional<Equipment> optionalEquipment = equipmentRepository.findById(id);
		return optionalEquipment.get();
	}

	@Transactional
	public Equipment save(Equipment equipment) {
		return equipmentRepository.save(equipment);
	}

	@Transactional
	public void delete(Long id) {
		equipmentRepository.deleteById(id);
	}

	@Transactional
	public Equipment updateEquipment(Long id, Equipment newEquipment) throws Exception {
		Equipment equipment = findById(id);
		equipment.setName(newEquipment.getName());
		return equipmentRepository.save(equipment);
	}
}
