package com.dakr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Emotions.java
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "EMOTIONS_GIFTS")
public class EMOTIONS {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String appreciation;
	private String friends;
	private String congratulation;
	private String LoveandAffection;

	// Constructors, getters, setters, etc.

}
