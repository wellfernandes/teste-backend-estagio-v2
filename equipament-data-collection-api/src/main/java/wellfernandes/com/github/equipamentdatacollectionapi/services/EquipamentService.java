package wellfernandes.com.github.equipamentdatacollectionapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wellfernandes.com.github.equipamentdatacollectionapi.entities.Equipament;
import wellfernandes.com.github.equipamentdatacollectionapi.repositories.EquipamentRepository;

@Service
public class EquipamentService {

	@Autowired
	private EquipamentRepository equipamentRepository;

	public List<Equipament> findAll() {
		return equipamentRepository.findAll();
	}

	public Equipament findById(Long id) {
		Optional<Equipament> optionalEquipament = equipamentRepository.findById(id);
		return optionalEquipament.get();
	}
}
