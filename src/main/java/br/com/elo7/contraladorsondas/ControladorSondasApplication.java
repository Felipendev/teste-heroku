package br.com.elo7.contraladorsondas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ControladorSondasApplication {
	@GetMapping
	public String getHomeTeste() {
		return "Controlador Sondas - API";
	}
	public static void main(String[] args) {
		SpringApplication.run(ControladorSondasApplication.class, args);
	}
}

