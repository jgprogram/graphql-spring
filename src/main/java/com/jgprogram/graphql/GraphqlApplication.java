package com.jgprogram.graphql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StationRepository stationRepository) {
		return args -> {
			Set<Station> stations = Stream.iterate(1, (ixName) -> ixName + 1)
					.map(this::createStation)
					.limit(1000)
					.collect(Collectors.toSet());

			stationRepository.saveAll(stations);
		};
	}

	private Station createStation(int id) {
		return new Station(
				(long)id,
				"EVB-P1518" + id,
				"321." + id % 10,
				"POL",
				"Customer" + id % 100
		);
	}
}
