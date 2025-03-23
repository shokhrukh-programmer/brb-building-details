package uz.brb.template.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "financial_rates")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BuildingFinancialRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double buildingBalance;
    private double buildingRemainingBalance;
    private double buildingEstimatedValue;
    @OneToOne
    @JoinColumn(name = "building_id", referencedColumnName = "id")
    private BuildingInfo buildingInfo;
}
