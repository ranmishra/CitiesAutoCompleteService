package com.paramati.citiesautocompleteservice.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.paramati.citiesautocompleteservice.repository.entity.City;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface CityRepository  extends Repository<City,Long> {
 	public List<String> fetchCitiesByPrefix (@Param("prefix") String prefix,Pageable pageable);
}
