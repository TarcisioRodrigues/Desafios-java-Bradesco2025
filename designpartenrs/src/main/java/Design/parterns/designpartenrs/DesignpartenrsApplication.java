package Design.parterns.designpartenrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class DesignpartenrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpartenrsApplication.class, args);
	}

}
