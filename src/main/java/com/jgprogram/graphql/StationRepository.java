package com.jgprogram.graphql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
    List<Station> findByLcpNameContainingAndFirmwareVersionContainingOrderByName(String lcpName, String FirmwareVersion);
}
