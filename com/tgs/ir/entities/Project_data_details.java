package com.tgs.ir.entities;

public class Project_data_details {
@Column(name="proj_data_id")
 
 private Integer  projDataId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="prj_type")
 
 private Integer  prjType;

@Column(name="prj_status")
 
 private String  prjStatus;

@Column(name="prj_end_date")
 
 private String  prjEndDate;

@Column(name="river_sub_basin")
 
 private String  riverSubBasin;

@Column(name="catchment_area_sqkm")
 
 private String  catchmentAreaSqkm;

@Column(name="composite_type")
 
 private String  compositeType;

@Column(name="lenght_of_dam")
 
 private String  lenghtOfDam;

@Column(name="height_of_dam")
 
 private String  heightOfDam;

@Column(name="spillway_type")
 
 private String  spillwayType;

@Column(name="spillway_size")
 
 private String  spillwaySize;

@Column(name="spillway_gates")
 
 private String  spillwayGates;

@Column(name="spillway_design_flood_cumecs")
 
 private String  spillwayDesignFloodCumecs;

@Column(name="top_level_dam_m")
 
 private String  topLevelDamM;

@Column(name="minimum_draw_down_level_m")
 
 private String  minimumDrawDownLevelM;

@Column(name="maximum_water_level_m")
 
 private String  maximumWaterLevelM;

@Column(name="full_reservoir_level_m")
 
 private String  fullReservoirLevelM;

@Column(name="gross_storage_at_frl_m")
 
 private String  grossStorageAtFrlM;

@Column(name="live_storage_m")
 
 private String  liveStorageM;

@Column(name="dead_storage_m")
 
 private String  deadStorageM;

@Column(name="flood_discharge_m_s")
 
 private String  floodDischargeMS;

@Column(name="river_bed_level_m")
 
 private String  riverBedLevelM;

@Column(name="irrigation_potential_ha")
 
 private String  irrigationPotentialHa;

@Column(name="ultimate_irrigation_potential_ha")
 
 private String  ultimateIrrigationPotentialHa;

@Column(name="crops")
 
 private String  crops;


    public Project_data_details(int proj_data_id, int project_id, int prj_type, Object prj_status, Object prj_end_date, Object river_sub_basin, Object catchment_area_sqkm, Object composite_type, Object lenght_of_dam, Object height_of_dam, Object spillway_type, Object spillway_size, Object spillway_gates, Object spillway_design_flood_cumecs, Object top_level_dam_m, Object minimum_draw_down_level_m, Object maximum_water_level_m, Object full_reservoir_level_m, Object gross_storage_at_frl_m, Object live_storage_m, Object dead_storage_m, Object flood_discharge_m_s, Object river_bed_level_m, Object irrigation_potential_ha, Object ultimate_irrigation_potential_ha, Object crops) {
        this.proj_data_id = proj_data_id;
        this.project_id = project_id;
        this.prj_type = prj_type;
        this.prj_status = prj_status;
        this.prj_end_date = prj_end_date;
        this.river_sub_basin = river_sub_basin;
        this.catchment_area_sqkm = catchment_area_sqkm;
        this.composite_type = composite_type;
        this.lenght_of_dam = lenght_of_dam;
        this.height_of_dam = height_of_dam;
        this.spillway_type = spillway_type;
        this.spillway_size = spillway_size;
        this.spillway_gates = spillway_gates;
        this.spillway_design_flood_cumecs = spillway_design_flood_cumecs;
        this.top_level_dam_m = top_level_dam_m;
        this.minimum_draw_down_level_m = minimum_draw_down_level_m;
        this.maximum_water_level_m = maximum_water_level_m;
        this.full_reservoir_level_m = full_reservoir_level_m;
        this.gross_storage_at_frl_m = gross_storage_at_frl_m;
        this.live_storage_m = live_storage_m;
        this.dead_storage_m = dead_storage_m;
        this.flood_discharge_m_s = flood_discharge_m_s;
        this.river_bed_level_m = river_bed_level_m;
        this.irrigation_potential_ha = irrigation_potential_ha;
        this.ultimate_irrigation_potential_ha = ultimate_irrigation_potential_ha;
        this.crops = crops;
    }
}
