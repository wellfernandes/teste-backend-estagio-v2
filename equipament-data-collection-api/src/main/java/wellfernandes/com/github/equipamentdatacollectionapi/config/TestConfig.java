package wellfernandes.com.github.equipamentdatacollectionapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import wellfernandes.com.github.equipamentdatacollectionapi.entities.Equipament;
import wellfernandes.com.github.equipamentdatacollectionapi.repositories.EquipamentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private EquipamentRepository equipamentRepository;

	@Override
	public void run(String... args) throws Exception {

		// database seeding
		Equipament equipament1 = new Equipament(null, "Trator");
		Equipament equipament2 = new Equipament(null, "Caminhão");

		equipamentRepository.saveAll(Arrays.asList(equipament1, equipament2));
	}
}
