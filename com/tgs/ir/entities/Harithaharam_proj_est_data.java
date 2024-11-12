package com.tgs.ir.entities;

public class Harithaharam_proj_est_data {
@Column(name="h_id")
 
 private Integer  hId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="plant_amt")
 
 private Double  plantAmt;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="riv_len_2022")
 
 private Double  rivLen2022;

@Column(name="riv_len_2023")
 
 private Double  rivLen2023;

@Column(name="mc_len_2022")
 
 private Double  mcLen2022;

@Column(name="mc_len_2023")
 
 private Double  mcLen2023;

@Column(name="distri_len_2022")
 
 private Double  distriLen2022;

@Column(name="distri_len_2023")
 
 private Double  distriLen2023;

@Column(name="appr_len_2022")
 
 private Double  apprLen2022;

@Column(name="appr_len_2023")
 
 private Double  apprLen2023;

@Column(name="press_main_len_2022")
 
 private Double  pressMainLen2022;

@Column(name="press_main_len_2023")
 
 private Double  pressMainLen2023;

@Column(name="others_len_2022")
 
 private Double  othersLen2022;

@Column(name="others_len_2023")
 
 private Double  othersLen2023;

@Column(name="camp_off_acres_2022")
 
 private Double  campOffAcres2022;

@Column(name="camp_off_acres_2023")
 
 private Double  campOffAcres2023;

@Column(name="pump_house_acres_2022")
 
 private Double  pumpHouseAcres2022;

@Column(name="pump_house_acres_2023")
 
 private Double  pumpHouseAcres2023;

@Column(name="reser_forsh_acres_2022")
 
 private Double  reserForshAcres2022;

@Column(name="reser_forsh_acres_2023")
 
 private Double  reserForshAcres2023;

@Column(name="other_acres_2022")
 
 private Double  otherAcres2022;

@Column(name="others_acres_2023")
 
 private Double  othersAcres2023;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_timestamp")
 
 private timestamp without time zone  deletedTimestamp;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="reser_len_2022")
 
 private Double  reserLen2022;

@Column(name="reser_len_2023")
 
 private Double  reserLen2023;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="epc")
 
 private Integer  epc;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="survey_no")
 
 private String  surveyNo;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="latitude_d")
 
 private Integer  latitudeD;

@Column(name="latitude_m")
 
 private Integer  latitudeM;

@Column(name="latitude_s")
 
 private Double  latitudeS;

@Column(name="longitude_d")
 
 private Integer  longitudeD;

@Column(name="longitude_m")
 
 private Integer  longitudeM;

@Column(name="longitude_s")
 
 private Double  longitudeS;


    public Harithaharam_proj_est_data(int h_id, int project_id, double plant_amt, int district_id, int mandal_id, double riv_len_2022, double riv_len_2023, double mc_len_2022, double mc_len_2023, double distri_len_2022, double distri_len_2023, double appr_len_2022, double appr_len_2023, double press_main_len_2022, double press_main_len_2023, double others_len_2022, double others_len_2023, double camp_off_acres_2022, double camp_off_acres_2023, double pump_house_acres_2022, double pump_house_acres_2023, double reser_forsh_acres_2022, double reser_forsh_acres_2023, double other_acres_2022, double others_acres_2023, int unit_id, boolean delete_flag, Object created_by, Object created_timestamp, Object deleted_by, Object deleted_timestamp, int circle_id, int division_id, double reser_len_2022, double reser_len_2023, int package_id, int epc, int village_id, Object survey_no, Object remarks, int latitude_d, int latitude_m, double latitude_s, int longitude_d, int longitude_m, double longitude_s) {
        this.h_id = h_id;
        this.project_id = project_id;
        this.plant_amt = plant_amt;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.riv_len_2022 = riv_len_2022;
        this.riv_len_2023 = riv_len_2023;
        this.mc_len_2022 = mc_len_2022;
        this.mc_len_2023 = mc_len_2023;
        this.distri_len_2022 = distri_len_2022;
        this.distri_len_2023 = distri_len_2023;
        this.appr_len_2022 = appr_len_2022;
        this.appr_len_2023 = appr_len_2023;
        this.press_main_len_2022 = press_main_len_2022;
        this.press_main_len_2023 = press_main_len_2023;
        this.others_len_2022 = others_len_2022;
        this.others_len_2023 = others_len_2023;
        this.camp_off_acres_2022 = camp_off_acres_2022;
        this.camp_off_acres_2023 = camp_off_acres_2023;
        this.pump_house_acres_2022 = pump_house_acres_2022;
        this.pump_house_acres_2023 = pump_house_acres_2023;
        this.reser_forsh_acres_2022 = reser_forsh_acres_2022;
        this.reser_forsh_acres_2023 = reser_forsh_acres_2023;
        this.other_acres_2022 = other_acres_2022;
        this.others_acres_2023 = others_acres_2023;
        this.unit_id = unit_id;
        this.delete_flag = delete_flag;
        this.created_by = created_by;
        this.created_timestamp = created_timestamp;
        this.deleted_by = deleted_by;
        this.deleted_timestamp = deleted_timestamp;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.reser_len_2022 = reser_len_2022;
        this.reser_len_2023 = reser_len_2023;
        this.package_id = package_id;
        this.epc = epc;
        this.village_id = village_id;
        this.survey_no = survey_no;
        this.remarks = remarks;
        this.latitude_d = latitude_d;
        this.latitude_m = latitude_m;
        this.latitude_s = latitude_s;
        this.longitude_d = longitude_d;
        this.longitude_m = longitude_m;
        this.longitude_s = longitude_s;
    }
}
