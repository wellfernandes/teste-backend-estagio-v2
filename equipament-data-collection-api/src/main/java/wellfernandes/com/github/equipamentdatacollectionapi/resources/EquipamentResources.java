package wellfernandes.com.github.equipamentdatacollectionapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wellfernandes.com.github.equipamentdatacollectionapi.entities.Equipament;
import wellfernandes.com.github.equipamentdatacollectionapi.services.EquipamentService;

@RestController
@RequestMapping(value = "/equipaments")
public class EquipamentResources {

	@Autowired
	private EquipamentService equipamentService;

	@GetMapping
	public ResponseEntity<List<Equipament>> findAll() {
		List<Equipament> listEquipaments = equipamentService.findAll();
		return ResponseEntity.ok().body(listEquipaments);
	}

}
