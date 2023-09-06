package com.dakr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.entity.SPECIAL_OCCASIONS;
import com.dakr.repository.SpecialOccasionsRepository;

@Service
public  class SpecialOccasionsServiceImpl1 implements SpecialOccasionsService {

	@Autowired
	private SpecialOccasionsRepository specialOccasionsRepository;

	@Override
	public SPECIAL_OCCASIONS getSpecialOccasionById(Long id) {
		return specialOccasionsRepository.findById(id).orElse(null);
	}

	@Override
	public List<SPECIAL_OCCASIONS> getAllSpecialOccasions() {
		return specialOccasionsRepository.findAll();
	}

	@Override
	public SPECIAL_OCCASIONS createSpecialOccasion(SPECIAL_OCCASIONS specialOccasion) {
		return specialOccasionsRepository.save(specialOccasion);
	}

	@Override
	public SPECIAL_OCCASIONS updateSpecialOccasion(Long id, SPECIAL_OCCASIONS specialOccasion) {
		SPECIAL_OCCASIONS existingSpecialOccasion = specialOccasionsRepository.findById(id).orElse(null);
		if (existingSpecialOccasion != null) {
			// Update the fields as needed
			existingSpecialOccasion.setName(specialOccasion.getName());
			existingSpecialOccasion.setDate(specialOccasion.getDate());

			return specialOccasionsRepository.save(existingSpecialOccasion);
		}
		return null;
	}

	@Override
	public void deleteSpecialOccasion(Long id) {
		specialOccasionsRepository.deleteById(id);
	}
}