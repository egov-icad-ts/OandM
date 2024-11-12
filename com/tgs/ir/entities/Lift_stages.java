package com.tgs.ir.entities;

public class Lift_stages {
@Column(name="lift_stage_id")
 
 private Integer  liftStageId;

@Column(name="stage_name")
 
 private String  stageName;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="no_of_lifts")
 
 private Integer  noOfLifts;

@Column(name="no_of_pumps")
 
 private Integer  noOfPumps;

@Column(name="pump_rating")
 
 private Double  pumpRating;

@Column(name="total_power")
 
 private Double  totalPower;

@Column(name="no_of_hours")
 
 private Integer  noOfHours;

@Column(name="no_of_days")
 
 private Integer  noOfDays;

@Column(name="lift_height")
 
 private Double  liftHeight;

@Column(name="contemplated_new")
 
 private String  contemplatedNew;

@Column(name="contemplated_stab")
 
 private String  contemplatedStab;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Lift_stages(int lift_stage_id, Object stage_name, int project_id, int district_id, int no_of_lifts, int no_of_pumps, double pump_rating, double total_power, int no_of_hours, int no_of_days, double lift_height, Object contemplated_new, Object contemplated_stab, boolean delete_flag, boolean is_latest) {
        this.lift_stage_id = lift_stage_id;
        this.stage_name = stage_name;
        this.project_id = project_id;
        this.district_id = district_id;
        this.no_of_lifts = no_of_lifts;
        this.no_of_pumps = no_of_pumps;
        this.pump_rating = pump_rating;
        this.total_power = total_power;
        this.no_of_hours = no_of_hours;
        this.no_of_days = no_of_days;
        this.lift_height = lift_height;
        this.contemplated_new = contemplated_new;
        this.contemplated_stab = contemplated_stab;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
    }
}
