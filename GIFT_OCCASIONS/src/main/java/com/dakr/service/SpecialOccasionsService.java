package com.dakr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dakr.entity.SPECIAL_OCCASIONS;


@Service
public interface SpecialOccasionsService {

	SPECIAL_OCCASIONS getSpecialOccasionById(Long id);

	List<SPECIAL_OCCASIONS> getAllSpecialOccasions();

	SPECIAL_OCCASIONS createSpecialOccasion(SPECIAL_OCCASIONS specialOccasion);

	SPECIAL_OCCASIONS updateSpecialOccasion(Long id, SPECIAL_OCCASIONS specialOccasion);

	void deleteSpecialOccasion(Long id);
}
