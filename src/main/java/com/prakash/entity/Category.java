package com.prakash.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoryId;
	private String categoryTitle;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

}
