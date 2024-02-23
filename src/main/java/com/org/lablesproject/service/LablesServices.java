package com.org.lablesproject.service;

import com.org.lablesproject.dto.LablesDto;
import com.org.lablesproject.payload.LablesApiResponse;

public interface LablesServices {

	LablesApiResponse saveAllData(LablesDto dto);

	LablesApiResponse getAllData();

	LablesApiResponse updateLables(LablesDto lablesDto, int id);

	LablesApiResponse deleteData(int id);

	LablesApiResponse getById(int id);
}
