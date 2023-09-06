package com.dakr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.entity.SPECIAL_OCCASIONS;

import com.dakr.service.SpecialOccasionsServiceImpl1;


@RestController
@RequestMapping("/specialoccasions")
public class SpecialOccasionsController {

	@Autowired
	private SpecialOccasionsServiceImpl1 specialOccasionsService;

	@GetMapping("/{id}")
	public ResponseEntity<SPECIAL_OCCASIONS> getSpecialOccasionById(@PathVariable Long id) {
		SPECIAL_OCCASIONS specialOccasion = specialOccasionsService.getSpecialOccasionById(id);
		if (specialOccasion != null) {
			return new ResponseEntity<>(specialOccasion, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping
	public ResponseEntity<List<SPECIAL_OCCASIONS>> getAllSpecialOccasions() {
		List<SPECIAL_OCCASIONS> specialOccasions = specialOccasionsService.getAllSpecialOccasions();
		return new ResponseEntity<>(specialOccasions, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<SPECIAL_OCCASIONS> createSpecialOccasion(@RequestBody SPECIAL_OCCASIONS specialOccasion) {
		SPECIAL_OCCASIONS createdSpecialOccasion = specialOccasionsService.createSpecialOccasion(specialOccasion);
		return new ResponseEntity<>(createdSpecialOccasion, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<SPECIAL_OCCASIONS> updateSpecialOccasion(@PathVariable Long id,
			@RequestBody SPECIAL_OCCASIONS specialOccasion) {
		SPECIAL_OCCASIONS updatedSpecialOccasion = specialOccasionsService.updateSpecialOccasion(id, specialOccasion);
		if (updatedSpecialOccasion != null) {
			return new ResponseEntity<>(updatedSpecialOccasion, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteSpecialOccasion(@PathVariable Long id) {
		specialOccasionsService.deleteSpecialOccasion(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
