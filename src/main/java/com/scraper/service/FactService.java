package com.scraper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scraper.model.Fact;
import com.scraper.repository.FactRepository;

@Service
public class FactService {
	
	@Autowired
	FactRepository factRepository;

	public void saveOrUpdate(Fact fact) {
		factRepository.save(fact);
	}
}
