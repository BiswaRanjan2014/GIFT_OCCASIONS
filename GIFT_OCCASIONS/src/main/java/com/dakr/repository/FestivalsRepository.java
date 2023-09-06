package com.dakr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dakr.entity.FESTIVALS;

//FestivalsRepository.java
@Repository
public interface FestivalsRepository extends JpaRepository<FESTIVALS, Long> {

}
