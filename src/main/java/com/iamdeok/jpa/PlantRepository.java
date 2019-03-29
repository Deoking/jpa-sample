package com.iamdeok.jpa;

import com.iamdeok.jpa.dto.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}
