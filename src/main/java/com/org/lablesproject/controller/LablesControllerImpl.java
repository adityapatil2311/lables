package com.org.lablesproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.lablesproject.dto.LablesDto;
import com.org.lablesproject.payload.LablesApiResponse;
import com.org.lablesproject.service.LablesServicesImpl;

@RestController
@RequestMapping("/lable")
public class LablesControllerImpl implements LableController {

	@Autowired
	private LablesServicesImpl servicesImpl;

	@PostMapping("/post")
	@Override
	public LablesApiResponse addAllData(@RequestBody LablesDto dto) {
		return servicesImpl.saveAllData(dto);

	}
// all details
	@GetMapping("/getall")
	@Override
	public LablesApiResponse getAllData() {
		return servicesImpl.getAllData();

	}

	@PutMapping("/update/{id}")
	@Override
	public LablesApiResponse updateLables(@RequestBody LablesDto dto, @PathVariable("id") int id) {
		return servicesImpl.updateLables(dto, id);

	}

	@DeleteMapping("/DELETE/{id}")
	@Override
	public LablesApiResponse deleteData(@PathVariable("id") int id) {
		return servicesImpl.deleteData(id);

	}

	@GetMapping("/getById/{id}")
	@Override
	public LablesApiResponse getById(@PathVariable("id") int id) {
		return servicesImpl.getById(id);

	}
}
