package br.com.viniciusleite.gestao_Vagas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Aponta para o spring a classe principal do progeto.
//
// @ComponentScan("br.com.viniciusleite") // Informa ao spring que ele deve escanear o pacote xy
public class PrimeiroProjetoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringbootApplication.class, args);
	}

}
