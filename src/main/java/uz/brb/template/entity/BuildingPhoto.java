package uz.brb.template.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "building_photos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BuildingPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fileName;
    private String filePath;
    @ManyToOne
    @JoinColumn(name = "building_id", referencedColumnName = "id", nullable = false)
    private BuildingTechnicalDetail building;
}
