package com.org.lablesproject.dto;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class LablesDto {

	private int lable_id;
	private String lable_name;
	private boolean is_deleted;
	private int created_by;
	private LocalDateTime created_date;
	private int modified_by;
    private LocalDateTime modified_date;
}
