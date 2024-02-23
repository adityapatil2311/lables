package com.org.lablesproject.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "lables")
@Data
public class Lables {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "lable_id",nullable = false)
	private int lable_id;
	@Column(name = "lable_name",nullable = false)
	private String lable_name;
	private boolean is_deleted;
	@Column(name = "created_by",nullable = false)
	private int created_by;
	@Column(name = "created_date",nullable = false)
	private LocalDateTime created_date;
	private int modified_by;
	private LocalDateTime modified_date;

}
