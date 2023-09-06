package com.dakr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.entity.SPECIAL_OCCASIONS;

//SpecialOccasionsRepository
@Repository
public interface SpecialOccasionsRepository extends JpaRepository<SPECIAL_OCCASIONS, Long>  {

	
	  SPECIAL_OCCASIONS updateSpecialOccasion(Long id, SPECIAL_OCCASIONS
	  specialOccasion);
	  
	  SPECIAL_OCCASIONS createSpecialOccasion(SPECIAL_OCCASIONS specialOccasion);
	  
	  List<SPECIAL_OCCASIONS> getAllSpecialOccasions();
	  
	  SPECIAL_OCCASIONS getSpecialOccasionById(Long id);
	  
	  void deleteSpecialOccasion(Long id);
	 
}
