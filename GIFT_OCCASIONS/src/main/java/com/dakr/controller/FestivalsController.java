
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

import com.dakr.entity.FESTIVALS;
import com.dakr.service.FestivalsService;

//FestivalsController.java
@RestController
@RequestMapping("/festivals")
public class FestivalsController {

	@Autowired
	private FestivalsService festivalsService;

	@GetMapping("/{id}")
	public ResponseEntity<FESTIVALS> getFestivalById(@PathVariable Long id) {
		FESTIVALS festival = festivalsService.getFestivalById(id);
		if (festival != null) {
			return new ResponseEntity<>(festival, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping
	public ResponseEntity<List<FESTIVALS>> getAllFestivals() {
		List<FESTIVALS> festivals = festivalsService.getAllFestivals();
		return new ResponseEntity<>(festivals, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<FESTIVALS> createFestival(@RequestBody FESTIVALS festival) {
		FESTIVALS createdFestival = festivalsService.createFestival(festival);
		return new ResponseEntity<>(createdFestival, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<FESTIVALS> updateFestival(@PathVariable Long id, @RequestBody FESTIVALS festival) {
		FESTIVALS updatedFestival = festivalsService.updateFestival(id, festival);
		if (updatedFestival != null) {
			return new ResponseEntity<>(updatedFestival, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteFestival(@PathVariable Long id) {
		festivalsService.deleteFestival(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
