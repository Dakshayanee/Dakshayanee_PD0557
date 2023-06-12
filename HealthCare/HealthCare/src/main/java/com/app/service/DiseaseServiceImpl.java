package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Disease;
import com.app.repo.DiseaseRepo;

@Service
@Transactional
public class DiseaseServiceImpl implements IDiseaseService {
   
	@Autowired
	private DiseaseRepo diseaserepo;
	
	@Override
	public Disease addOrEditDisease(Disease disease) {
		return diseaserepo.save(disease);
	}
	
	

}
