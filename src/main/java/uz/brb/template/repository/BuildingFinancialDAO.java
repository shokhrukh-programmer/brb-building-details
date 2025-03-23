package uz.brb.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.brb.template.entity.BuildingFinancialRate;

import java.util.List;

public interface BuildingFinancialDAO extends JpaRepository<BuildingFinancialRate, Long> {
    /*List<BuildingFinancialRate> findAll();*/
}
