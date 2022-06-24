package wellfernandes.com.github.equipmentdatacollectionapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import wellfernandes.com.github.equipmentdatacollectionapi.entities.Equipment;
import wellfernandes.com.github.equipmentdatacollectionapi.repositories.EquipmentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private EquipmentRepository equipamentRepository;

	@Override
	public void run(String... args) throws Exception {

		// database seeding
		Equipment equipment1 = new Equipment(1L, "Trator");
		Equipment equipment2 = new Equipment(2L, "Caminhão Caçamba");
		Equipment equipment3 = new Equipment(3L, "Caminhão Munck");

		equipamentRepository.saveAll(Arrays.asList(equipment1, equipment2, equipment3));
	}
}
