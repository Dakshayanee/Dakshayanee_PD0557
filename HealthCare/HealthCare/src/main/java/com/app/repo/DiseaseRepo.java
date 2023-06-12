package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Disease;

public interface DiseaseRepo extends JpaRepository<Disease,Integer> {

}
