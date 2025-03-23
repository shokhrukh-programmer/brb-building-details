//package uz.brb.template.repository.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//import uz.brb.template.entity.BuildingFinancialRate;
//import uz.brb.template.entity.BuildingInfo;
//import uz.brb.template.repository.BuildingFinancialDAO;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//@Repository
//public class BuildingFinancialDAOImpl implements BuildingFinancialDAO {
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public BuildingFinancialDAOImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public List<BuildingFinancialRate> findAll() {
//        return jdbcTemplate.query("select * from financial_rates", new CustomRowMapper());
//    }
//
//    private static class CustomRowMapper implements RowMapper<BuildingFinancialRate> {
//        @Override
//        public BuildingFinancialRate mapRow(ResultSet rs, int rowNum) throws SQLException {
//            return BuildingFinancialRate.builder()
//                    .id(rs.getLong("id"))
//                    .buildingBalance(rs.getDouble("building_balance"))
//                    .buildingRemainingBalance(rs.getDouble("building_remaining_balance"))
//                    .buildingEstimatedValue(rs.getDouble("building_estimated_value"))
//                    .buildingInfo(
//                            BuildingInfo.builder()
//                                    .id(rs.getLong("id"))
//                                    .build()
//                    )
//                    .build();
//        }
//    }
//}
