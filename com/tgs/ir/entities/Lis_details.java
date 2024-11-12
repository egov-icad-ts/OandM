package com.tgs.ir.entities;

public class Lis_details {
@Column(name="lis_id")
 
 private Integer  lisId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="no_of_lifts")
 
 private Integer  noOfLifts;

@Column(name="lift_pumps")
 
 private Integer  liftPumps;

@Column(name="total_power_required")
 
 private Double  totalPowerRequired;

@Column(name="hrs_running_per_day")
 
 private Double  hrsRunningPerDay;

@Column(name="days_running_day")
 
 private Double  daysRunningDay;

@Column(name="height_mtrs")
 
 private Double  heightMtrs;

@Column(name="contemplated_new")
 
 private Double  contemplatedNew;

@Column(name="contemplated_stab")
 
 private Double  contemplatedStab;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Lis_details(int lis_id, int project_id, int district_id, int no_of_lifts, int lift_pumps, double total_power_required, double hrs_running_per_day, double days_running_day, double height_mtrs, double contemplated_new, double contemplated_stab, boolean delete_flag, boolean is_latest) {
        this.lis_id = lis_id;
        this.project_id = project_id;
        this.district_id = district_id;
        this.no_of_lifts = no_of_lifts;
        this.lift_pumps = lift_pumps;
        this.total_power_required = total_power_required;
        this.hrs_running_per_day = hrs_running_per_day;
        this.days_running_day = days_running_day;
        this.height_mtrs = height_mtrs;
        this.contemplated_new = contemplated_new;
        this.contemplated_stab = contemplated_stab;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
    }
}
