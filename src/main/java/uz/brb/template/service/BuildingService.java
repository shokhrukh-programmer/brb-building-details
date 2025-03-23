package uz.brb.template.service;

import uz.brb.template.dto.response.BuildingResponseDTO;

import java.util.List;

public interface BuildingService {
    List<BuildingResponseDTO> getAllBuildingInfos();
}
