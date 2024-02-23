package com.org.lablesproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.org.lablesproject.dto.LablesDto;
import com.org.lablesproject.entity.Lables;
import com.org.lablesproject.exception.ResourceNotFoundException;
import com.org.lablesproject.mapper.LablesMapper;
import com.org.lablesproject.payload.LablesApiResponse;
import com.org.lablesproject.repository.LableRepository;

@Service
@Component
public class LablesServicesImpl implements LablesServices {

	@Autowired
	private LableRepository lablerepository;

	@Autowired
	private LablesMapper lablemapper;

	@Override
	public LablesApiResponse saveAllData(LablesDto dto) {
		try {
			Lables lables = lablemapper.mapLablesDtoToLables(dto);
			Lables lables2 = lablerepository.save(lables);
			LablesDto lablesdto = lablemapper.mapLablesToLablesDto(lables2);
			return new LablesApiResponse(lablesdto, null, null, HttpStatus.CREATED, "data add successfully", false);
		} catch (Exception e) {
			return new LablesApiResponse(null, null, null, HttpStatus.NOT_FOUND, "Internal Server Error", true);
		}
	}

	@Override
	public LablesApiResponse getAllData() {
		try {
			List<Lables> lables = lablerepository.findAll();
			List<LablesDto> dtos = lablemapper.mapLablesListToLablesDtoList(lables);
			return new LablesApiResponse(null, dtos, null, HttpStatus.OK, "Get All Data successfully", false);
		} catch (Exception e) {
			return new LablesApiResponse(null, null, null, HttpStatus.NOT_FOUND, "Internal Server Error", true);
		}
	}

	@Override
	public LablesApiResponse updateLables(LablesDto lablesDto, int id) {
		try {
			Lables lables = lablerepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Lables", "id", id));
			lables.setModified_date(lablesDto.getModified_date());
			lables.setCreated_by(lablesDto.getCreated_by());
			lables.setCreated_date(lablesDto.getCreated_date());
			lables.setModified_by(lablesDto.getModified_by());
			lables.set_deleted(lablesDto.is_deleted());
			LablesDto dto = lablemapper.mapLablesToLablesDto(lables);
			return new LablesApiResponse(dto, null, null, HttpStatus.OK, "data updated successfully", false);
		} catch (Exception e) {
			return new LablesApiResponse(null, null, null, HttpStatus.NOT_FOUND, "Internal Server Error", true);
		}
	}

	@Override
	public LablesApiResponse deleteData(int id) {
		try {
			lablerepository.deleteById(id);
			return new LablesApiResponse(null, null, null, HttpStatus.OK, "data delete successfully", false);
		} catch (Exception e) {
			return new LablesApiResponse(null, null, null, HttpStatus.NOT_FOUND, "Internal Server Error", true);
		}

	}

	@Override
	public LablesApiResponse getById(int id) {
		try {
			Lables lables = lablerepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Lables", "id", id));
			LablesDto dto = lablemapper.mapLablesToLablesDto(lables);
			return new LablesApiResponse(dto, null, null, HttpStatus.OK, "data get By ID successfully", false);
		} catch (Exception e) {
			return new LablesApiResponse(null, null, null, HttpStatus.NOT_FOUND, "Internal Server Error", true);
		}

	}

}
