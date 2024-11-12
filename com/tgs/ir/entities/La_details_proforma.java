package com.tgs.ir.entities;

public class La_details_proforma {
@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="sdc_id")
 
 private Integer  sdcId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="year")
 
 private Integer  year;

@Column(name="month")
 
 private Integer  month;

@Column(name="total_la_required")
 
 private Double  totalLaRequired;

@Column(name="la_requisitioned")
 
 private Double  laRequisitioned;

@Column(name="la_acquired_upto_lastmonth")
 
 private Double  laAcquiredUptoLastmonth;

@Column(name="la_acquired_present_month")
 
 private Double  laAcquiredPresentMonth;

@Column(name="total_la_acquired")
 
 private Double  totalLaAcquired;

@Column(name="balance_la_tobe_acquired")
 
 private Double  balanceLaTobeAcquired;

@Column(name="la_prog_this_year")
 
 private Double  laProgThisYear;

@Column(name="la_prog_next_year")
 
 private Double  laProgNextYear;

@Column(name="reasons_for_delay")
 
 private String  reasonsForDelay;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="la_id")
 
 private Integer  laId;


    public La_details_proforma(int project_id, int package_id, int sdc_id, int district_id, int year, int month, double total_la_required, double la_requisitioned, double la_acquired_upto_lastmonth, double la_acquired_present_month, double total_la_acquired, double balance_la_tobe_acquired, double la_prog_this_year, double la_prog_next_year, Object reasons_for_delay, Object updated_by, Object updated_timestamp, boolean is_latest, boolean delete_flag, int la_id) {
        this.project_id = project_id;
        this.package_id = package_id;
        this.sdc_id = sdc_id;
        this.district_id = district_id;
        this.year = year;
        this.month = month;
        this.total_la_required = total_la_required;
        this.la_requisitioned = la_requisitioned;
        this.la_acquired_upto_lastmonth = la_acquired_upto_lastmonth;
        this.la_acquired_present_month = la_acquired_present_month;
        this.total_la_acquired = total_la_acquired;
        this.balance_la_tobe_acquired = balance_la_tobe_acquired;
        this.la_prog_this_year = la_prog_this_year;
        this.la_prog_next_year = la_prog_next_year;
        this.reasons_for_delay = reasons_for_delay;
        this.updated_by = updated_by;
        this.updated_timestamp = updated_timestamp;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.la_id = la_id;
    }
}
