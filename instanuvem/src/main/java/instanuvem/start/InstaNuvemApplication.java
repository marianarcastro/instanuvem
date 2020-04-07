package instanuvem.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "instanuvem.endpoint")
public class InstaNuvemApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstaNuvemApplication.class, args);
	}
}
