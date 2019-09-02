package com.jgprogram.graphql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StationRepository stationRepository) {
		return args -> {
			Station station = new Station(
					1L,
					"EVB-P1518000",
					"POL",
					"321.123.444",
					"Star"
			);

			stationRepository.save(station);
		};
	}
}
