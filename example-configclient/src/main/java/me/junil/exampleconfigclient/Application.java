package me.junil.exampleconfigclient;

import me.junil.exampleautoconfiguration.Holo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

  @Bean
  public Holo holo () {
    Holo holo = new Holo();
    holo.setHowLong(50);
    holo.setName("junil2");
    return holo;
  }

}
