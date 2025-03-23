package uz.brb.template.dto.response;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.brb.template.entity.BuildingPhoto;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BuildingResponseDTO {
    private long id;
    private String buildingName;
    private String buildingType;
    private String cadasterNumber;
    private int constructionYear;
    private String renovationPeriod;
    private int currentState;
    private List<BuildingPhoto> photos = new ArrayList<>();
    private int numberOfEmployees;
    private int numberOfFloors;
    private double landingArea;
    private double constructionArea;
    private double totalArea;
    private double totalUsableArea;
    private double buildingBalance;
    private double buildingRemainingBalance;
    private double buildingEstimatedValue;
    private String addedBy;
    private String changedBy;
}
