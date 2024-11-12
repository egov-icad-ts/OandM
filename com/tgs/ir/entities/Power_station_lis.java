package com.tgs.ir.entities;

public class Power_station_lis {
@Column(name="lisid")
 
 private Integer  lisid;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="transformer_rating")
 
 private String  transformerRating;

@Column(name="transformer_type_of_cooling")
 
 private String  transformerTypeOfCooling;

@Column(name="transformer_oil_drain_valve")
 
 private String  transformerOilDrainValve;

@Column(name="transformer_air_release_plug")
 
 private String  transformerAirReleasePlug;

@Column(name="transformer_oil_conservator")
 
 private String  transformerOilConservator;

@Column(name="transformer_pressure_relief_devise")
 
 private String  transformerPressureReliefDevise;

@Column(name="transformer_earthing_terminals")
 
 private String  transformerEarthingTerminals;

@Column(name="transformer_onload_tap_charger")
 
 private String  transformerOnloadTapCharger;

@Column(name="transformer_make")
 
 private String  transformerMake;

@Column(name="transformer_model_no")
 
 private String  transformerModelNo;

@Column(name="transformer_year_of_manufacture")
 
 private Integer  transformerYearOfManufacture;

@Column(name="method_of_connection")
 
 private String  methodOfConnection;

@Column(name="emulation_system")
 
 private String  emulationSystem;

@Column(name="station_transformer_rating")
 
 private Double  stationTransformerRating;

@Column(name="station_transformer_type_of_cooling")
 
 private String  stationTransformerTypeOfCooling;

@Column(name="station_transformer_oil_drain_valve")
 
 private String  stationTransformerOilDrainValve;

@Column(name="station_transformer_air_release_plug")
 
 private String  stationTransformerAirReleasePlug;

@Column(name="station_transformer_oil_conservator")
 
 private String  stationTransformerOilConservator;

@Column(name="station_transformer_pressure_relief_devise")
 
 private String  stationTransformerPressureReliefDevise;

@Column(name="station_transformer_earthing_terminals")
 
 private String  stationTransformerEarthingTerminals;

@Column(name="station_transformer_onload_tap_charger")
 
 private String  stationTransformerOnloadTapCharger;

@Column(name="station_transformer_make")
 
 private String  stationTransformerMake;

@Column(name="station_transformer_model_no")
 
 private String  stationTransformerModelNo;

@Column(name="station_transformer_year_of_manufacture")
 
 private Integer  stationTransformerYearOfManufacture;

@Column(name="uat_rating")
 
 private String  uatRating;

@Column(name="uat_type_of_cooling")
 
 private String  uatTypeOfCooling;

@Column(name="uat_oil_drain_valve")
 
 private String  uatOilDrainValve;

@Column(name="uat_air_release_plug")
 
 private String  uatAirReleasePlug;

@Column(name="uat_oil_conservator")
 
 private String  uatOilConservator;

@Column(name="uat_pressure_relief_devise")
 
 private String  uatPressureReliefDevise;

@Column(name="uat_earthing_terminals")
 
 private String  uatEarthingTerminals;

@Column(name="uat_onload_tap_charger")
 
 private String  uatOnloadTapCharger;

@Column(name="uat_make")
 
 private String  uatMake;

@Column(name="uat_model_no")
 
 private String  uatModelNo;

@Column(name="uat_year_of_manufacture")
 
 private Integer  uatYearOfManufacture;

@Column(name="substation_rating")
 
 private String  substationRating;

@Column(name="substation_voltage")
 
 private String  substationVoltage;

@Column(name="substaion_buscurrent")
 
 private String  substaionBuscurrent;

@Column(name="substation_ct")
 
 private String  substationCt;

@Column(name="substation_pt")
 
 private String  substationPt;

@Column(name="substation_break")
 
 private String  substationBreak;

@Column(name="substation_design_discharge_buscurrent")
 
 private Double  substationDesignDischargeBuscurrent;

@Column(name="substation_isolates")
 
 private String  substationIsolates;

@Column(name="switches_rating")
 
 private String  switchesRating;

@Column(name="switches_no_of_panels")
 
 private Double  switchesNoOfPanels;

@Column(name="switches_control_system")
 
 private String  switchesControlSystem;

@Column(name="dc_batteries")
 
 private String  dcBatteries;

@Column(name="dc_rating")
 
 private String  dcRating;

@Column(name="dc_type")
 
 private String  dcType;

@Column(name="dc_make")
 
 private String  dcMake;

@Column(name="dc_model_no")
 
 private String  dcModelNo;

@Column(name="dc_year_of_manufacture")
 
 private Integer  dcYearOfManufacture;

@Column(name="dc_batterychages")
 
 private String  dcBatterychages;

@Column(name="dcdb")
 
 private String  dcdb;

@Column(name="ups_rating")
 
 private String  upsRating;

@Column(name="ups_backup_time")
 
 private String  upsBackupTime;

@Column(name="ups_make")
 
 private String  upsMake;

@Column(name="ups_model_no")
 
 private String  upsModelNo;

@Column(name="ups_year_of_manufacture")
 
 private Integer  upsYearOfManufacture;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="post_id")
 
 private String  postId;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="lift_id")
 
 private Integer  liftId;

@Column(name="approved_by_username")
 
 private String  approvedByUsername;

@Column(name="approved_timestamp")
 
 private timestamp without time zone  approvedTimestamp;

@Column(name="approved_post_id")
 
 private String  approvedPostId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Power_station_lis(int lisid, int project_id, Object transformer_rating, Object transformer_type_of_cooling, Object transformer_oil_drain_valve, Object transformer_air_release_plug, Object transformer_oil_conservator, Object transformer_pressure_relief_devise, Object transformer_earthing_terminals, Object transformer_onload_tap_charger, Object transformer_make, Object transformer_model_no, int transformer_year_of_manufacture, Object method_of_connection, Object emulation_system, double station_transformer_rating, Object station_transformer_type_of_cooling, Object station_transformer_oil_drain_valve, Object station_transformer_air_release_plug, Object station_transformer_oil_conservator, Object station_transformer_pressure_relief_devise, Object station_transformer_earthing_terminals, Object station_transformer_onload_tap_charger, Object station_transformer_make, Object station_transformer_model_no, int station_transformer_year_of_manufacture, Object uat_rating, Object uat_type_of_cooling, Object uat_oil_drain_valve, Object uat_air_release_plug, Object uat_oil_conservator, Object uat_pressure_relief_devise, Object uat_earthing_terminals, Object uat_onload_tap_charger, Object uat_make, Object uat_model_no, int uat_year_of_manufacture, Object substation_rating, Object substation_voltage, Object substaion_buscurrent, Object substation_ct, Object substation_pt, Object substation_break, double substation_design_discharge_buscurrent, Object substation_isolates, Object switches_rating, double switches_no_of_panels, Object switches_control_system, Object dc_batteries, Object dc_rating, Object dc_type, Object dc_make, Object dc_model_no, int dc_year_of_manufacture, Object dc_batterychages, Object dcdb, Object ups_rating, Object ups_backup_time, Object ups_make, Object ups_model_no, int ups_year_of_manufacture, boolean delete_flag, boolean is_latest, Object created_by_username, Object post_id, Object created_timestamp, Object updated_timestamp, boolean edit_flag, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, int lift_id, Object approved_by_username, Object approved_timestamp, Object approved_post_id, Object deleted_by, Object deleted_time, int unit_id, int circle_id, int division_id, int sub_division_id) {
        this.lisid = lisid;
        this.project_id = project_id;
        this.transformer_rating = transformer_rating;
        this.transformer_type_of_cooling = transformer_type_of_cooling;
        this.transformer_oil_drain_valve = transformer_oil_drain_valve;
        this.transformer_air_release_plug = transformer_air_release_plug;
        this.transformer_oil_conservator = transformer_oil_conservator;
        this.transformer_pressure_relief_devise = transformer_pressure_relief_devise;
        this.transformer_earthing_terminals = transformer_earthing_terminals;
        this.transformer_onload_tap_charger = transformer_onload_tap_charger;
        this.transformer_make = transformer_make;
        this.transformer_model_no = transformer_model_no;
        this.transformer_year_of_manufacture = transformer_year_of_manufacture;
        this.method_of_connection = method_of_connection;
        this.emulation_system = emulation_system;
        this.station_transformer_rating = station_transformer_rating;
        this.station_transformer_type_of_cooling = station_transformer_type_of_cooling;
        this.station_transformer_oil_drain_valve = station_transformer_oil_drain_valve;
        this.station_transformer_air_release_plug = station_transformer_air_release_plug;
        this.station_transformer_oil_conservator = station_transformer_oil_conservator;
        this.station_transformer_pressure_relief_devise = station_transformer_pressure_relief_devise;
        this.station_transformer_earthing_terminals = station_transformer_earthing_terminals;
        this.station_transformer_onload_tap_charger = station_transformer_onload_tap_charger;
        this.station_transformer_make = station_transformer_make;
        this.station_transformer_model_no = station_transformer_model_no;
        this.station_transformer_year_of_manufacture = station_transformer_year_of_manufacture;
        this.uat_rating = uat_rating;
        this.uat_type_of_cooling = uat_type_of_cooling;
        this.uat_oil_drain_valve = uat_oil_drain_valve;
        this.uat_air_release_plug = uat_air_release_plug;
        this.uat_oil_conservator = uat_oil_conservator;
        this.uat_pressure_relief_devise = uat_pressure_relief_devise;
        this.uat_earthing_terminals = uat_earthing_terminals;
        this.uat_onload_tap_charger = uat_onload_tap_charger;
        this.uat_make = uat_make;
        this.uat_model_no = uat_model_no;
        this.uat_year_of_manufacture = uat_year_of_manufacture;
        this.substation_rating = substation_rating;
        this.substation_voltage = substation_voltage;
        this.substaion_buscurrent = substaion_buscurrent;
        this.substation_ct = substation_ct;
        this.substation_pt = substation_pt;
        this.substation_break = substation_break;
        this.substation_design_discharge_buscurrent = substation_design_discharge_buscurrent;
        this.substation_isolates = substation_isolates;
        this.switches_rating = switches_rating;
        this.switches_no_of_panels = switches_no_of_panels;
        this.switches_control_system = switches_control_system;
        this.dc_batteries = dc_batteries;
        this.dc_rating = dc_rating;
        this.dc_type = dc_type;
        this.dc_make = dc_make;
        this.dc_model_no = dc_model_no;
        this.dc_year_of_manufacture = dc_year_of_manufacture;
        this.dc_batterychages = dc_batterychages;
        this.dcdb = dcdb;
        this.ups_rating = ups_rating;
        this.ups_backup_time = ups_backup_time;
        this.ups_make = ups_make;
        this.ups_model_no = ups_model_no;
        this.ups_year_of_manufacture = ups_year_of_manufacture;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_username = created_by_username;
        this.post_id = post_id;
        this.created_timestamp = created_timestamp;
        this.updated_timestamp = updated_timestamp;
        this.edit_flag = edit_flag;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.lift_id = lift_id;
        this.approved_by_username = approved_by_username;
        this.approved_timestamp = approved_timestamp;
        this.approved_post_id = approved_post_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
