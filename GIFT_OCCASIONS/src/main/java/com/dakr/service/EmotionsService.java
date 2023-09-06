package com.dakr.service;

import java.util.List;

import com.dakr.entity.EMOTIONS;

//EmotionsService.java
public interface EmotionsService {

	EMOTIONS getEmotionById(Long id);

	List<EMOTIONS> getAllEmotions();

	EMOTIONS createEmotion(EMOTIONS emotion);

	EMOTIONS updateEmotion(Long id, EMOTIONS emotion);

	void deleteEmotion(Long id);

}
