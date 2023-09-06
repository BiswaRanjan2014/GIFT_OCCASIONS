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

import com.dakr.entity.EMOTIONS;
import com.dakr.service.EmotionsService;

//EmotionsController.java
@RestController
@RequestMapping("emotions")
public class EmotionsController {

	@Autowired
	private EmotionsService emotionsService;

	@GetMapping("/{id}")
	public ResponseEntity<EMOTIONS> getEmotionById(@PathVariable Long id) {
		EMOTIONS emotion = emotionsService.getEmotionById(id);
		if (emotion != null) {
			return new ResponseEntity<>(emotion, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping
	
	public ResponseEntity<List<EMOTIONS>> getAllEmotions() {
		List<EMOTIONS> emotions = emotionsService.getAllEmotions();
		return new ResponseEntity<>(emotions, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<EMOTIONS> createEmotion(@RequestBody EMOTIONS emotion) {
		EMOTIONS createdEmotion = emotionsService.createEmotion(emotion);
		return new ResponseEntity<>(createdEmotion, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<EMOTIONS> updateEmotion(@PathVariable Long id, @RequestBody EMOTIONS emotion) {
		EMOTIONS updatedEmotion = emotionsService.updateEmotion(id, emotion);
		if (updatedEmotion != null) {
			return new ResponseEntity<>(updatedEmotion, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmotion(@PathVariable Long id) {
		emotionsService.deleteEmotion(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
