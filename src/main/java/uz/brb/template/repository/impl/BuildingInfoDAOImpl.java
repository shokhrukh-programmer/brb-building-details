//package uz.brb.template.repository.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//import uz.brb.template.entity.BuildingInfo;
//import uz.brb.template.repository.BuildingInfoDAO;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//@Repository
//public class BuildingInfoDAOImpl implements BuildingInfoDAO {
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public BuildingInfoDAOImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public List<BuildingInfo> findAllBuildingInfo() {
//        return jdbcTemplate.query("select * from building_infos", new BuildingInfoRowMapper());
//    }
//
//    private static class BuildingInfoRowMapper implements RowMapper<BuildingInfo> {
//        @Override
//        public BuildingInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
//            return BuildingInfo.builder()
//                    .id(rs.getLong("id"))
//                    .buildingName(rs.getString("building_name"))
//                    .buildingType(rs.getString("building_type"))
//                    .cadasterNumber(rs.getString("cadaster_number"))
//                    .build();
//        }
//    }
//}
