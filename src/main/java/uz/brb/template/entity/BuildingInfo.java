package uz.brb.template.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.brb.template.service.BuildingFinancialService;

@Entity
@Table(name = "building_infos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BuildingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String buildingName;
    private String buildingType;
    private String cadasterNumber;
    @OneToOne(mappedBy = "buildingInfo")
    private BuildingTechnicalDetail technicalDetail;
    @OneToOne(mappedBy = "buildingInfo")
    private BuildingFinancialRate buildingFinancialRate;
}
