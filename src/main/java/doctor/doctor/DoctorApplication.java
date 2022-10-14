package doctor.doctor;

import doctor.doctor.model.Doctor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class DoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(Doctor.class, args);
	}

}
