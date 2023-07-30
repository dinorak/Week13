package pet.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetStoreApplication {
	@SuppressWarnings("unused")
	private static dbConnection connect;

	public static void main(String[] args) {
		dbConnection.getConnection();
		SpringApplication.run(PetStoreApplication.class, args);

	}

}
