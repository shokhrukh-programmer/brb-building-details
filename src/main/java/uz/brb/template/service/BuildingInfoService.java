package uz.brb.template.service;

import uz.brb.template.dto.response.BuildingResponseDTO;
import uz.brb.template.entity.BuildingInfo;

import java.util.List;

public interface BuildingInfoService {
    List<BuildingResponseDTO> findAllBuildingInfo();
}
