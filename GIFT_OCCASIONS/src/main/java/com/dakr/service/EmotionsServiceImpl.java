package com.dakr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.entity.EMOTIONS;
import com.dakr.repository.EmotionsRepository;

//EmotionsServiceImpl.java
@Service
public class EmotionsServiceImpl implements EmotionsService {

	@Autowired
	private EmotionsRepository emotionsRepository;

	@Override
	public EMOTIONS getEmotionById(Long id) {
		return emotionsRepository.findById(id).orElse(null);
	}

	@Override
	public List<EMOTIONS> getAllEmotions() {
		return emotionsRepository.findAll();
	}

	@Override
	public EMOTIONS createEmotion(EMOTIONS emotion) {
		return emotionsRepository.save(emotion);
	}

	@Override
	public EMOTIONS updateEmotion(Long id, EMOTIONS emotion) {
		EMOTIONS existingEmotion = emotionsRepository.findById(id).orElse(null);
		if (existingEmotion != null) {
			// Update the fields as needed
			existingEmotion.setAppreciation(emotion.getAppreciation());
			existingEmotion.setFriends(emotion.getFriends());
			existingEmotion.setCongratulation(emotion.getCongratulation());
			existingEmotion.setLoveandAffection(emotion.getLoveandAffection());

			return emotionsRepository.save(existingEmotion);
		}
		return null;
	}

	@Override
	public void deleteEmotion(Long id) {
		emotionsRepository.deleteById(id);
	}
}
