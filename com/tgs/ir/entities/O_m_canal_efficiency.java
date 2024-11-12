package com.tgs.ir.entities;

public class O_m_canal_efficiency {
@Column(name="eff_id")
 
 private Integer  effId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="canal_id")
 
 private Integer  canalId;

@Column(name="reach_id")
 
 private Integer  reachId;

@Column(name="year")
 
 private Integer  year;

@Column(name="month")
 
 private Integer  month;

@Column(name="fortnight")
 
 private Integer  fortnight;

@Column(name="design_discharge_cusecs")
 
 private Double  designDischargeCusecs;

@Column(name="discharge_start_reach_cusecs")
 
 private Double  dischargeStartReachCusecs;

@Column(name="discharge_end_reach_cusecs")
 
 private Double  dischargeEndReachCusecs;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_on")
 
 private timestamp without time zone  updatedOn;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="total_utilizations_cusecs")
 
 private Double  totalUtilizationsCusecs;

@Column(name="other_utilizations_cusecs")
 
 private Double  otherUtilizationsCusecs;

@Column(name="remarks")
 
 private String  remarks;


    public O_m_canal_efficiency(int eff_id, int project_id, int canal_id, int reach_id, int year, int month, int fortnight, double design_discharge_cusecs, double discharge_start_reach_cusecs, double discharge_end_reach_cusecs, Object updated_by, Object updated_on, boolean is_latest, boolean delete_flag, double total_utilizations_cusecs, double other_utilizations_cusecs, Object remarks) {
        this.eff_id = eff_id;
        this.project_id = project_id;
        this.canal_id = canal_id;
        this.reach_id = reach_id;
        this.year = year;
        this.month = month;
        this.fortnight = fortnight;
        this.design_discharge_cusecs = design_discharge_cusecs;
        this.discharge_start_reach_cusecs = discharge_start_reach_cusecs;
        this.discharge_end_reach_cusecs = discharge_end_reach_cusecs;
        this.updated_by = updated_by;
        this.updated_on = updated_on;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.total_utilizations_cusecs = total_utilizations_cusecs;
        this.other_utilizations_cusecs = other_utilizations_cusecs;
        this.remarks = remarks;
    }
}
