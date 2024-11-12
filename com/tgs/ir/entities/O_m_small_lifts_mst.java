package com.tgs.ir.entities;

public class O_m_small_lifts_mst {
@Column(name="lis_id")
 
 private Integer  lisId;

@Column(name="lis_type")
 
 private String  lisType;

@Column(name="name_of_lis")
 
 private String  nameOfLis;

@Column(name="location_of_lis")
 
 private String  locationOfLis;

@Column(name="approach_channel_length")
 
 private Double  approachChannelLength;

@Column(name="approach_channel_req_discharge")
 
 private Double  approachChannelReqDischarge;

@Column(name="approach_channel_design_discharge")
 
 private Double  approachChannelDesignDischarge;

@Column(name="approach_channel_bedwidth")
 
 private Double  approachChannelBedwidth;

@Column(name="approach_channel_fsd")
 
 private Double  approachChannelFsd;

@Column(name="approach_channel_velocity")
 
 private Double  approachChannelVelocity;

@Column(name="approach_channel_bedfall")
 
 private String  approachChannelBedfall;

@Column(name="approach_channel_sideslope")
 
 private Double  approachChannelSideslope;

@Column(name="approach_channel_freeboard")
 
 private Double  approachChannelFreeboard;

@Column(name="approach_channel_value_of_n")
 
 private Double  approachChannelValueOfN;

@Column(name="approach_channel_fsl")
 
 private Double  approachChannelFsl;

@Column(name="approach_channel_tbl")
 
 private Double  approachChannelTbl;

@Column(name="approach_channel_twb")
 
 private Double  approachChannelTwb;

@Column(name="approach_channel_bedlevel_start")
 
 private Double  approachChannelBedlevelStart;

@Column(name="approach_channel_bedlevel_end")
 
 private Double  approachChannelBedlevelEnd;

@Column(name="gravity_canal_length")
 
 private Double  gravityCanalLength;

@Column(name="gravity_canal_req_discharge")
 
 private Double  gravityCanalReqDischarge;

@Column(name="gravity_canal_design_discharge")
 
 private Double  gravityCanalDesignDischarge;

@Column(name="gravity_canal_bedwidth")
 
 private Double  gravityCanalBedwidth;

@Column(name="gravity_canal_fsd")
 
 private Double  gravityCanalFsd;

@Column(name="gravity_canal_velocity")
 
 private Double  gravityCanalVelocity;

@Column(name="gravity_canal_bedfall")
 
 private String  gravityCanalBedfall;

@Column(name="gravity_canal_bedlevel_start")
 
 private Double  gravityCanalBedlevelStart;

@Column(name="gravity_canal_bedlevel_end")
 
 private Double  gravityCanalBedlevelEnd;

@Column(name="gravity_canal_freeboard")
 
 private Double  gravityCanalFreeboard;

@Column(name="hr_type_of_gates")
 
 private String  hrTypeOfGates;

@Column(name="hr_no_of_gates")
 
 private Integer  hrNoOfGates;

@Column(name="hr_size")
 
 private String  hrSize;

@Column(name="hr_sill_level")
 
 private Double  hrSillLevel;

@Column(name="hr_hoist_type")
 
 private String  hrHoistType;

@Column(name="hr_hoist_details")
 
 private String  hrHoistDetails;

@Column(name="hr_operating_method")
 
 private String  hrOperatingMethod;

@Column(name="trashracks_size")
 
 private Double  trashracksSize;

@Column(name="trashrack_material")
 
 private String  trashrackMaterial;

@Column(name="tunnel_diameter")
 
 private Double  tunnelDiameter;

@Column(name="tunnel_length")
 
 private Double  tunnelLength;

@Column(name="tunnel_design_discharge")
 
 private Double  tunnelDesignDischarge;

@Column(name="no_of_drafttube_tunnels")
 
 private Integer  noOfDrafttubeTunnels;

@Column(name="drafttube_tunnel_size")
 
 private String  drafttubeTunnelSize;

@Column(name="drafttube_tunnel_shape")
 
 private String  drafttubeTunnelShape;

@Column(name="drafttube_tunnel_length")
 
 private Double  drafttubeTunnelLength;

@Column(name="drafttube_tunnel_material")
 
 private String  drafttubeTunnelMaterial;

@Column(name="drafttube_tunnel_design_discharge")
 
 private Double  drafttubeTunnelDesignDischarge;

@Column(name="no_of_drafttube_tunnel_gates")
 
 private Integer  noOfDrafttubeTunnelGates;

@Column(name="drafttube_tunnel_gates_size")
 
 private String  drafttubeTunnelGatesSize;

@Column(name="drafttube_tunnel_gates_silllevel")
 
 private Double  drafttubeTunnelGatesSilllevel;

@Column(name="dt_crane_details")
 
 private String  dtCraneDetails;

@Column(name="dt_crane_capacity")
 
 private Double  dtCraneCapacity;

@Column(name="dt_crane_make")
 
 private String  dtCraneMake;

@Column(name="dt_cane_year_of_mfg")
 
 private Integer  dtCaneYearOfMfg;

@Column(name="dt_crane_model_no")
 
 private String  dtCraneModelNo;

@Column(name="pumphouse_type")
 
 private String  pumphouseType;

@Column(name="pumphouse_location")
 
 private String  pumphouseLocation;

@Column(name="pumphouse_size")
 
 private Double  pumphouseSize;

@Column(name="pumphouse_category")
 
 private String  pumphouseCategory;

@Column(name="created_by_userid")
 
 private String  createdByUserid;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="post_id")
 
 private String  postId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="file_path")
 
 private String  filePath;

@Column(name="lis_functionality")
 
 private String  lisFunctionality;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="civil_com_idc_id")
 
 private Integer  civilComIdcId;


    public O_m_small_lifts_mst(int lis_id, Object lis_type, Object name_of_lis, Object location_of_lis, double approach_channel_length, double approach_channel_req_discharge, double approach_channel_design_discharge, double approach_channel_bedwidth, double approach_channel_fsd, double approach_channel_velocity, Object approach_channel_bedfall, double approach_channel_sideslope, double approach_channel_freeboard, double approach_channel_value_of_n, double approach_channel_fsl, double approach_channel_tbl, double approach_channel_twb, double approach_channel_bedlevel_start, double approach_channel_bedlevel_end, double gravity_canal_length, double gravity_canal_req_discharge, double gravity_canal_design_discharge, double gravity_canal_bedwidth, double gravity_canal_fsd, double gravity_canal_velocity, Object gravity_canal_bedfall, double gravity_canal_bedlevel_start, double gravity_canal_bedlevel_end, double gravity_canal_freeboard, Object hr_type_of_gates, int hr_no_of_gates, Object hr_size, double hr_sill_level, Object hr_hoist_type, Object hr_hoist_details, Object hr_operating_method, double trashracks_size, Object trashrack_material, double tunnel_diameter, double tunnel_length, double tunnel_design_discharge, int no_of_drafttube_tunnels, Object drafttube_tunnel_size, Object drafttube_tunnel_shape, double drafttube_tunnel_length, Object drafttube_tunnel_material, double drafttube_tunnel_design_discharge, int no_of_drafttube_tunnel_gates, Object drafttube_tunnel_gates_size, double drafttube_tunnel_gates_silllevel, Object dt_crane_details, double dt_crane_capacity, Object dt_crane_make, int dt_cane_year_of_mfg, Object dt_crane_model_no, Object pumphouse_type, Object pumphouse_location, double pumphouse_size, Object pumphouse_category, Object created_by_userid, Object created_date, boolean delete_flag, Object post_id, int project_id, Object file_path, Object lis_functionality, int unit_id, int circle_id, int division_id, int sub_division_id, int civil_com_idc_id) {
        this.lis_id = lis_id;
        this.lis_type = lis_type;
        this.name_of_lis = name_of_lis;
        this.location_of_lis = location_of_lis;
        this.approach_channel_length = approach_channel_length;
        this.approach_channel_req_discharge = approach_channel_req_discharge;
        this.approach_channel_design_discharge = approach_channel_design_discharge;
        this.approach_channel_bedwidth = approach_channel_bedwidth;
        this.approach_channel_fsd = approach_channel_fsd;
        this.approach_channel_velocity = approach_channel_velocity;
        this.approach_channel_bedfall = approach_channel_bedfall;
        this.approach_channel_sideslope = approach_channel_sideslope;
        this.approach_channel_freeboard = approach_channel_freeboard;
        this.approach_channel_value_of_n = approach_channel_value_of_n;
        this.approach_channel_fsl = approach_channel_fsl;
        this.approach_channel_tbl = approach_channel_tbl;
        this.approach_channel_twb = approach_channel_twb;
        this.approach_channel_bedlevel_start = approach_channel_bedlevel_start;
        this.approach_channel_bedlevel_end = approach_channel_bedlevel_end;
        this.gravity_canal_length = gravity_canal_length;
        this.gravity_canal_req_discharge = gravity_canal_req_discharge;
        this.gravity_canal_design_discharge = gravity_canal_design_discharge;
        this.gravity_canal_bedwidth = gravity_canal_bedwidth;
        this.gravity_canal_fsd = gravity_canal_fsd;
        this.gravity_canal_velocity = gravity_canal_velocity;
        this.gravity_canal_bedfall = gravity_canal_bedfall;
        this.gravity_canal_bedlevel_start = gravity_canal_bedlevel_start;
        this.gravity_canal_bedlevel_end = gravity_canal_bedlevel_end;
        this.gravity_canal_freeboard = gravity_canal_freeboard;
        this.hr_type_of_gates = hr_type_of_gates;
        this.hr_no_of_gates = hr_no_of_gates;
        this.hr_size = hr_size;
        this.hr_sill_level = hr_sill_level;
        this.hr_hoist_type = hr_hoist_type;
        this.hr_hoist_details = hr_hoist_details;
        this.hr_operating_method = hr_operating_method;
        this.trashracks_size = trashracks_size;
        this.trashrack_material = trashrack_material;
        this.tunnel_diameter = tunnel_diameter;
        this.tunnel_length = tunnel_length;
        this.tunnel_design_discharge = tunnel_design_discharge;
        this.no_of_drafttube_tunnels = no_of_drafttube_tunnels;
        this.drafttube_tunnel_size = drafttube_tunnel_size;
        this.drafttube_tunnel_shape = drafttube_tunnel_shape;
        this.drafttube_tunnel_length = drafttube_tunnel_length;
        this.drafttube_tunnel_material = drafttube_tunnel_material;
        this.drafttube_tunnel_design_discharge = drafttube_tunnel_design_discharge;
        this.no_of_drafttube_tunnel_gates = no_of_drafttube_tunnel_gates;
        this.drafttube_tunnel_gates_size = drafttube_tunnel_gates_size;
        this.drafttube_tunnel_gates_silllevel = drafttube_tunnel_gates_silllevel;
        this.dt_crane_details = dt_crane_details;
        this.dt_crane_capacity = dt_crane_capacity;
        this.dt_crane_make = dt_crane_make;
        this.dt_cane_year_of_mfg = dt_cane_year_of_mfg;
        this.dt_crane_model_no = dt_crane_model_no;
        this.pumphouse_type = pumphouse_type;
        this.pumphouse_location = pumphouse_location;
        this.pumphouse_size = pumphouse_size;
        this.pumphouse_category = pumphouse_category;
        this.created_by_userid = created_by_userid;
        this.created_date = created_date;
        this.delete_flag = delete_flag;
        this.post_id = post_id;
        this.project_id = project_id;
        this.file_path = file_path;
        this.lis_functionality = lis_functionality;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.civil_com_idc_id = civil_com_idc_id;
    }
}
