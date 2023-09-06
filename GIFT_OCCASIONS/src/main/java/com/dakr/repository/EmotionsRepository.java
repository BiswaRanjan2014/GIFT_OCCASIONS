package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.entity.EMOTIONS;

//EmotionsRepository.java
@Repository
public interface EmotionsRepository extends JpaRepository<EMOTIONS, Long> {

}
