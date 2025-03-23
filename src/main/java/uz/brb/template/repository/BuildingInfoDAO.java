package uz.brb.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.brb.template.entity.BuildingInfo;

import java.util.List;

@Repository
public interface BuildingInfoDAO extends JpaRepository<BuildingInfo, Long> {
}
