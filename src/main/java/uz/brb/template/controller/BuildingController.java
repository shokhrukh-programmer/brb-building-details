package uz.brb.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.brb.template.dto.response.BuildingResponseDTO;
import uz.brb.template.service.BuildingInfoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BuildingController {
    private final BuildingInfoService buildingService;

    @Autowired
    public BuildingController(BuildingInfoService buildingService) {
        this.buildingService = buildingService;
    }

    @GetMapping("/building-list")
    public ResponseEntity<List<BuildingResponseDTO>> getAllBuildings() {
        return new ResponseEntity<>(buildingService.findAllBuildingInfo(), HttpStatus.OK);
    }
}
