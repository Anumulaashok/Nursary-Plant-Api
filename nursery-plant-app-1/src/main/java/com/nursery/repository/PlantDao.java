package com.nursery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nursery.model.Plant;

@Repository
public interface PlantDao extends JpaRepository<Plant, Integer> {
	
	public List<Plant> findByCommonName(String commonName);
	
	public List<Plant> findByTypeOfPlant(String typeOfPlant);
	
	
}
