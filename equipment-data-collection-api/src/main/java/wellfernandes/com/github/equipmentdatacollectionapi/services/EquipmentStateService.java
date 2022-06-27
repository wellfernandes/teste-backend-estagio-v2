package wellfernandes.com.github.equipmentdatacollectionapi.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wellfernandes.com.github.equipmentdatacollectionapi.entities.EquipmentState;
import wellfernandes.com.github.equipmentdatacollectionapi.repositories.EquipmentStateRepository;

@Service
public class EquipmentStateService {

	@Autowired
	private EquipmentStateRepository equipmentStateRepository;

	public List<EquipmentState> findAll() {
		return equipmentStateRepository.findAll();
	}

	public EquipmentState findById(Long id) {
		Optional<EquipmentState> optionalEquipmentState = equipmentStateRepository.findById(id);
		return optionalEquipmentState.get();
	}

	@Transactional
	public EquipmentState save(EquipmentState equipmentState) {
		return equipmentStateRepository.save(equipmentState);
	}

	@Transactional
	public void deleteEquipmentState(Long id) {
		equipmentStateRepository.deleteById(id);
	}

	@Transactional
	public EquipmentState updateEquipmentState(Long id, EquipmentState newEquipmentState) throws Exception {
		EquipmentState equipmentState = findById(id);
		equipmentState.setName(newEquipmentState.getName());
		return equipmentStateRepository.save(equipmentState);
	}
}
