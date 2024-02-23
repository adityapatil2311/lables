package com.org.lablesproject.payload;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

import com.org.lablesproject.dto.LablesDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LablesApiResponse {

	private LablesDto lablesDto;
	private List<LablesDto> lablesDtoList;
	private Page<LablesDto> lablesDtoPage;
	private HttpStatus status;
	private String message;
	private boolean error;

}