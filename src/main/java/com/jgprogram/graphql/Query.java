package com.jgprogram.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private final StationRepository stationRepository;

    public Query(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public Iterable<Station> findAllStations() {
        return stationRepository.findAll();
    }

    public Iterable<Station> findStationsByLcpAndFirmware(String lcpName, String firmware) {
        return stationRepository.findByLcpNameAndFirmwareVersionOrderByName(lcpName, firmware);
    }

    public long countStations() {
        return stationRepository.count();
    }
}
