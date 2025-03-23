package uz.brb.template.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "building_technical_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BuildingTechnicalDetail {
    @Id
    private long id;
    private int constructionYear;
    private String renovationPeriod;
    private int currentState;
    @OneToMany(mappedBy = "building", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BuildingPhoto> photos = new ArrayList<>();
    private int numberOfEmployees;
    private int numberOfFloors;
    private double landingArea;
    private double constructionArea;
    private double totalArea;
    private double totalUsableArea;
    @OneToOne
    @JoinColumn(name = "building_id", referencedColumnName = "id")
    private BuildingInfo buildingInfo;
}
