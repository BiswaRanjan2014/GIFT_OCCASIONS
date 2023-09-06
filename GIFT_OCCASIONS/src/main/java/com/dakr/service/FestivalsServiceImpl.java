package com.dakr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.entity.FESTIVALS;
import com.dakr.repository.FestivalsRepository;

//FestivalsServiceImpl.java
@Service
public class FestivalsServiceImpl implements FestivalsService {

	@Autowired
	private FestivalsRepository festivalsRepository;

	@Override
	public FESTIVALS getFestivalById(Long id) {
		return festivalsRepository.findById(id).orElse(null);
	}

	@Override
	public List<FESTIVALS> getAllFestivals() {
		return festivalsRepository.findAll();
	}

	@Override
	public FESTIVALS createFestival(FESTIVALS festival) {
		return festivalsRepository.save(festival);
	}

	@Override
	public FESTIVALS updateFestival(Long id, FESTIVALS festival) {
		FESTIVALS existingFestival = festivalsRepository.findById(id).orElse(null);
		if (existingFestival != null) {
			// Update the fields as needed
			existingFestival.setName(festival.getName());
			existingFestival.setDate(festival.getDate());

			return festivalsRepository.save(existingFestival);
		}
		return null;
	}

	@Override
	public void deleteFestival(Long id) {
		festivalsRepository.deleteById(id);
	}
}
