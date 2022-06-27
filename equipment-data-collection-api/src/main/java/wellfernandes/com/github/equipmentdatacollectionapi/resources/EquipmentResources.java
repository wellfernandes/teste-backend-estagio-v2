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

import wellfernandes.com.github.equipmentdatacollectionapi.entities.Equipment;
import wellfernandes.com.github.equipmentdatacollectionapi.services.EquipmentService;

@RestController
@RequestMapping(value = "/equipments")
public class EquipmentResources {

	@Autowired
	private EquipmentService equipmentService;

	@GetMapping
	public ResponseEntity<List<Equipment>> findAll() {
		List<Equipment> listEquipments = equipmentService.findAll();
		return ResponseEntity.ok().body(listEquipments);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Equipment> findById(@PathVariable Long id) {
		Equipment equipment = equipmentService.findById(id);
		return ResponseEntity.ok().body(equipment);
	}

	@PostMapping
	public ResponseEntity<Equipment> insertEquipment(@RequestBody Equipment equipment) {
		equipment = equipmentService.save(equipment);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(equipment.getId())
				.toUri();
		return ResponseEntity.created(uri).body(equipment);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteEquipment(@PathVariable Long id) {
		equipmentService.delete(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<Equipment> updateEquipment(@PathVariable Long id, @RequestBody Equipment equipment) {
		try {
			Equipment newEquipment = equipmentService.updateEquipment(id, equipment);
			return ResponseEntity.ok(newEquipment);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
}
