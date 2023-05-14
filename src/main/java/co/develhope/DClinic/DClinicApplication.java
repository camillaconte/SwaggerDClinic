package co.develhope.DClinic;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "D-Clinic Project",
				version = "1.0.0",
				description = "API for medical clinic",
				termsOfService = "team3",
				contact = @Contact(
						name = "Develhope Team3",
						email = "team3@develhope.co"
				),
				license = @License(
						name = "licence",
						url = "team3"
				)
		)
)
public class DClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(DClinicApplication.class, args);
	}

}
