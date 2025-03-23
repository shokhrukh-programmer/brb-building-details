package uz.brb.template.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.brb.template.entity.BuildingFinancialRate;
import uz.brb.template.repository.BuildingFinancialDAO;
import uz.brb.template.service.BuildingFinancialService;

import java.util.List;

@Service
public class BuildingFinancialServiceImpl implements BuildingFinancialService {
    private final BuildingFinancialDAO financialDAO;

    @Autowired
    public BuildingFinancialServiceImpl(BuildingFinancialDAO financialDAO) {
        this.financialDAO = financialDAO;
    }

    @Override
    public List<BuildingFinancialRate> findAll() {
        return financialDAO.findAll();
    }
}
