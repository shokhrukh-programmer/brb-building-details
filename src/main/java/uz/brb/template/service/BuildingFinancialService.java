package uz.brb.template.service;

import uz.brb.template.entity.BuildingFinancialRate;

import java.util.List;

public interface BuildingFinancialService {
    List<BuildingFinancialRate> findAll();
}
