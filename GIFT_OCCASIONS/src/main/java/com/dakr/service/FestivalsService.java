package com.dakr.service;

import java.util.List;

import com.dakr.entity.FESTIVALS;

//FestivalsService.java
public interface FestivalsService {

	FESTIVALS getFestivalById(Long id);

	List<FESTIVALS> getAllFestivals();

	FESTIVALS createFestival(FESTIVALS festival);

	FESTIVALS updateFestival(Long id, FESTIVALS festival);

	void deleteFestival(Long id);

}
