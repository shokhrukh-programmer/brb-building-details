package uz.brb.template.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.brb.template.dto.response.BuildingResponseDTO;
import uz.brb.template.entity.BuildingFinancialRate;
import uz.brb.template.entity.BuildingInfo;
import uz.brb.template.entity.BuildingTechnicalDetail;
import uz.brb.template.repository.BuildingInfoDAO;
import uz.brb.template.service.BuildingInfoService;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingInfoServiceImpl implements BuildingInfoService {
    private final BuildingInfoDAO buildingInfoDAO;

    @Autowired
    public BuildingInfoServiceImpl(BuildingInfoDAO buildingInfoDAO) {
        this.buildingInfoDAO = buildingInfoDAO;
    }

    @Override
    public List<BuildingResponseDTO> findAllBuildingInfo() {
        List<BuildingInfo> buildingInfoServiceList =
                buildingInfoDAO.findAll();
        List<BuildingResponseDTO> result = new ArrayList<>();

        buildingInfoServiceList.stream().forEach(b -> {
                    BuildingTechnicalDetail t = b.getTechnicalDetail();
                    BuildingFinancialRate f = b.getBuildingFinancialRate();

                    result.add(
                            BuildingResponseDTO.builder()
                                    .id(b.getId())
                                    .buildingName(b.getBuildingName())
                                    .buildingType(b.getBuildingType())
                                    .cadasterNumber(b.getCadasterNumber())
                                    .constructionYear(t.getConstructionYear())
                                    .renovationPeriod(t.getRenovationPeriod())
                                    .currentState(t.getCurrentState())
                                    .photos(t.getPhotos())
                                    .numberOfEmployees(t.getNumberOfEmployees())
                                    .numberOfFloors(t.getNumberOfFloors())
                                    .landingArea(t.getLandingArea())
                                    .constructionArea(t.getConstructionArea())
                                    .totalArea(t.getTotalArea())
                                    .totalUsableArea(t.getTotalUsableArea())
                                    .buildingBalance(f.getBuildingBalance())
                                    .buildingRemainingBalance(f.getBuildingRemainingBalance())
                                    .buildingEstimatedValue(f.getBuildingEstimatedValue())
                                    .addedBy("")
                                    .changedBy("")
                                    .build()
                    );
                }
                );

        return result;
    }
}
