package com.scraper.repository;

import org.springframework.data.repository.CrudRepository;

import com.scraper.model.Fact;

public interface FactRepository extends CrudRepository<Fact, Integer>{

}
