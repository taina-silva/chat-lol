package dev.taina.chatlol;

import dev.taina.chatlol.application.ListChampionsUseCase;
import dev.taina.chatlol.domain.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ChatLolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatLolApplication.class, args);
	}

	@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository championsRepository) {
		return new ListChampionsUseCase(championsRepository);
	}
}