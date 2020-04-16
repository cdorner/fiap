package br.com.fiap.shopping_cidadao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ShoppingCidadaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCidadaoApplication.class, args);
	}

}
