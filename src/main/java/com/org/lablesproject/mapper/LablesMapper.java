package com.org.lablesproject.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.org.lablesproject.dto.LablesDto;
import com.org.lablesproject.entity.Lables;

@Mapper(componentModel = "spring")
public interface LablesMapper {

	Lables mapLablesDtoToLables(LablesDto lablesdto);

	LablesDto mapLablesToLablesDto(Lables lables);

	List<LablesDto> mapLablesListToLablesDtoList(List<Lables> lables);
}
