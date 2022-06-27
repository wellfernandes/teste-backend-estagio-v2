package wellfernandes.com.github.equipmentdatacollectionapi.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import wellfernandes.com.github.equipmentdatacollectionapi.entities.EquipmentState;
import wellfernandes.com.github.equipmentdatacollectionapi.services.EquipmentStateService;

@RestController
@RequestMapping(value = "/equipments/states")
public class EquipmentStateResources {

	@Autowired
	private EquipmentStateService equipmentStateService;

	@GetMapping
	public ResponseEntity<List<EquipmentState>> findAll() {
		List<EquipmentState> listEquipmentState = equipmentStateService.findAll();
		return ResponseEntity.ok().body(listEquipmentState);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<EquipmentState> findById(@PathVariable Long id) {
		EquipmentState equipmentState = equipmentStateService.findById(id);
		return ResponseEntity.ok().body(equipmentState);
	}

	@PostMapping
	public ResponseEntity<EquipmentState> insertEquipment(@RequestBody EquipmentState equipmentState) {
		equipmentState = equipmentStateService.save(equipmentState);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(equipmentState.getId())
				.toUri();
		return ResponseEntity.created(uri).body(equipmentState);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteEquipmentState(@PathVariable Long id) {
		equipmentStateService.deleteEquipmentState(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<EquipmentState> updateEquipmentState(@PathVariable Long id,
			@RequestBody EquipmentState equipmentState) {
		try {
			EquipmentState newEquipmentState = equipmentStateService.updateEquipmentState(id, equipmentState);
			return ResponseEntity.ok(newEquipmentState);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}
