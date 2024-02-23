package com.org.lablesproject.controller;

import com.org.lablesproject.dto.LablesDto;
import com.org.lablesproject.payload.LablesApiResponse;

public interface LableController {

	public LablesApiResponse addAllData(LablesDto dto);

	public LablesApiResponse getAllData();

	public LablesApiResponse updateLables(LablesDto dto, int id);

	public LablesApiResponse deleteData(int id);

	public LablesApiResponse getById(int id);

}
