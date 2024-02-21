package com.org.lablesproject.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Lables {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lable_id;
	private String lable_name;
	private Byte is_deleted;
	private int created_by;
	private LocalDateTime created_date;
	private int modified_by;
    private LocalDateTime modified_date;
	public Lables(int lable_id, String lable_name, Byte is_deleted, int created_by, LocalDateTime created_date,
			int modified_by, LocalDateTime modified_date) {
		super();
		this.lable_id = lable_id;
		this.lable_name = lable_name;
		this.is_deleted = is_deleted;
		this.created_by = created_by;
		this.created_date = created_date;
		this.modified_by = modified_by;
		this.modified_date = modified_date;
	}
	public Lables() {
		super();
	}
	public int getLable_id() {
		return lable_id;
	}
	public void setLable_id(int lable_id) {
		this.lable_id = lable_id;
	}
	public String getLable_name() {
		return lable_name;
	}
	public void setLable_name(String lable_name) {
		this.lable_name = lable_name;
	}
	public Byte isIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(Byte is_deleted) {
		this.is_deleted = is_deleted;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public LocalDateTime getCreated_date() {
		return created_date;
	}
	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}
	public int getModified_by() {
		return modified_by;
	}
	public void setModified_by(int modified_by) {
		this.modified_by = modified_by;
	}
	public LocalDateTime getModified_date() {
		return modified_date;
	}
	public void setModified_date(LocalDateTime modified_date) {
		this.modified_date = modified_date;
	}

}
