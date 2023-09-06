package com.dakr.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Festivals.java
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "FESTIVALS_GIFTS")
public class FESTIVALS {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private LocalDate date;

	// Constructors, getters, setters, etc.
}
