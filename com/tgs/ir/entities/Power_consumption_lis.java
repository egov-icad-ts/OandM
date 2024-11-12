package com.tgs.ir.entities;

public class Power_consumption_lis {
@Column(name="pc_id")
 
 private Integer  pcId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="lift_name")
 
 private String  liftName;

@Column(name="num_pumps")
 
 private Integer  numPumps;

@Column(name="pump_capacity_mw")
 
 private Double  pumpCapacityMw;

@Column(name="rated_capacity_mw")
 
 private Double  ratedCapacityMw;

@Column(name="waterlifted_lastmonth_tmc")
 
 private Double  waterliftedLastmonthTmc;

@Column(name="waterlifted_thismonth_tmc")
 
 private Double  waterliftedThismonthTmc;

@Column(name="total_water_lifted_tmc")
 
 private Double  totalWaterLiftedTmc;

@Column(name="powerconsumed_lastmonth_mw")
 
 private Double  powerconsumedLastmonthMw;

@Column(name="powerconsumed_thismonth_mw")
 
 private Double  powerconsumedThismonthMw;

@Column(name="cummulative_powerconsumed_mw")
 
 private Double  cummulativePowerconsumedMw;

@Column(name="power_remarks")
 
 private String  powerRemarks;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="updated_month")
 
 private Integer  updatedMonth;

@Column(name="updated_year")
 
 private Integer  updatedYear;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="lift_id")
 
 private Integer  liftId;


    public Power_consumption_lis(int pc_id, int project_id, Object lift_name, int num_pumps, double pump_capacity_mw, double rated_capacity_mw, double waterlifted_lastmonth_tmc, double waterlifted_thismonth_tmc, double total_water_lifted_tmc, double powerconsumed_lastmonth_mw, double powerconsumed_thismonth_mw, double cummulative_powerconsumed_mw, Object power_remarks, Object updated_by, boolean is_latest, Object updated_time, int updated_month, int updated_year, boolean delete_flag, int lift_id) {
        this.pc_id = pc_id;
        this.project_id = project_id;
        this.lift_name = lift_name;
        this.num_pumps = num_pumps;
        this.pump_capacity_mw = pump_capacity_mw;
        this.rated_capacity_mw = rated_capacity_mw;
        this.waterlifted_lastmonth_tmc = waterlifted_lastmonth_tmc;
        this.waterlifted_thismonth_tmc = waterlifted_thismonth_tmc;
        this.total_water_lifted_tmc = total_water_lifted_tmc;
        this.powerconsumed_lastmonth_mw = powerconsumed_lastmonth_mw;
        this.powerconsumed_thismonth_mw = powerconsumed_thismonth_mw;
        this.cummulative_powerconsumed_mw = cummulative_powerconsumed_mw;
        this.power_remarks = power_remarks;
        this.updated_by = updated_by;
        this.is_latest = is_latest;
        this.updated_time = updated_time;
        this.updated_month = updated_month;
        this.updated_year = updated_year;
        this.delete_flag = delete_flag;
        this.lift_id = lift_id;
    }
}
