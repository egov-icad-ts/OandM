package com.tgs.ir.entities;

public class Harithaharam_proj_est_ji_data {
@Column(name="ji_id")
 
 private Integer  jiId;

@Column(name="riv_ji_ln")
 
 private Double  rivJiLn;

@Column(name="riv_feasible_ln")
 
 private Double  rivFeasibleLn;

@Column(name="mc_ji_ln")
 
 private Double  mcJiLn;

@Column(name="mc_feasible_ln")
 
 private Double  mcFeasibleLn;

@Column(name="distri_ji_ln")
 
 private Double  distriJiLn;

@Column(name="distri_feasible_ln")
 
 private Double  distriFeasibleLn;

@Column(name="pr_main_ji_ln")
 
 private Double  prMainJiLn;

@Column(name="pr_main_feasible_ln")
 
 private Double  prMainFeasibleLn;

@Column(name="appr_ji_ln")
 
 private Double  apprJiLn;

@Column(name="appr_feasible_ln")
 
 private Double  apprFeasibleLn;

@Column(name="reser_ji_ln")
 
 private Double  reserJiLn;

@Column(name="reser_feasible_ln")
 
 private Double  reserFeasibleLn;

@Column(name="others_ji_ln")
 
 private Double  othersJiLn;

@Column(name="others_feasible_ln")
 
 private Double  othersFeasibleLn;

@Column(name="camp_col_ji_acres")
 
 private Double  campColJiAcres;

@Column(name="camp_col_feasible_acres")
 
 private Double  campColFeasibleAcres;

@Column(name="pump_house_ji_acres")
 
 private Double  pumpHouseJiAcres;

@Column(name="pump_house_feasible_acres")
 
 private Double  pumpHouseFeasibleAcres;

@Column(name="reser_forsh_ji_acres")
 
 private Double  reserForshJiAcres;

@Column(name="reser_forsh_feasible_acres")
 
 private Double  reserForshFeasibleAcres;

@Column(name="others_ji_acres")
 
 private Double  othersJiAcres;

@Column(name="others_feasible_acres")
 
 private Double  othersFeasibleAcres;

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

@Column(name="remarks")
 
 private String  remarks;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="financial_yr")
 
 private String  financialYr;

@Column(name="h_id")
 
 private Integer  hId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;


    public Harithaharam_proj_est_ji_data(int ji_id, double riv_ji_ln, double riv_feasible_ln, double mc_ji_ln, double mc_feasible_ln, double distri_ji_ln, double distri_feasible_ln, double pr_main_ji_ln, double pr_main_feasible_ln, double appr_ji_ln, double appr_feasible_ln, double reser_ji_ln, double reser_feasible_ln, double others_ji_ln, double others_feasible_ln, double camp_col_ji_acres, double camp_col_feasible_acres, double pump_house_ji_acres, double pump_house_feasible_acres, double reser_forsh_ji_acres, double reser_forsh_feasible_acres, double others_ji_acres, double others_feasible_acres, int unit_id, boolean delete_flag, Object created_by, Object created_timestamp, Object deleted_by, Object deleted_timestamp, int circle_id, int division_id, Object remarks, Object updated_by, Object updated_timestamp, Object financial_yr, int h_id, int district_id, int mandal_id) {
        this.ji_id = ji_id;
        this.riv_ji_ln = riv_ji_ln;
        this.riv_feasible_ln = riv_feasible_ln;
        this.mc_ji_ln = mc_ji_ln;
        this.mc_feasible_ln = mc_feasible_ln;
        this.distri_ji_ln = distri_ji_ln;
        this.distri_feasible_ln = distri_feasible_ln;
        this.pr_main_ji_ln = pr_main_ji_ln;
        this.pr_main_feasible_ln = pr_main_feasible_ln;
        this.appr_ji_ln = appr_ji_ln;
        this.appr_feasible_ln = appr_feasible_ln;
        this.reser_ji_ln = reser_ji_ln;
        this.reser_feasible_ln = reser_feasible_ln;
        this.others_ji_ln = others_ji_ln;
        this.others_feasible_ln = others_feasible_ln;
        this.camp_col_ji_acres = camp_col_ji_acres;
        this.camp_col_feasible_acres = camp_col_feasible_acres;
        this.pump_house_ji_acres = pump_house_ji_acres;
        this.pump_house_feasible_acres = pump_house_feasible_acres;
        this.reser_forsh_ji_acres = reser_forsh_ji_acres;
        this.reser_forsh_feasible_acres = reser_forsh_feasible_acres;
        this.others_ji_acres = others_ji_acres;
        this.others_feasible_acres = others_feasible_acres;
        this.unit_id = unit_id;
        this.delete_flag = delete_flag;
        this.created_by = created_by;
        this.created_timestamp = created_timestamp;
        this.deleted_by = deleted_by;
        this.deleted_timestamp = deleted_timestamp;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.remarks = remarks;
        this.updated_by = updated_by;
        this.updated_timestamp = updated_timestamp;
        this.financial_yr = financial_yr;
        this.h_id = h_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
    }
}
