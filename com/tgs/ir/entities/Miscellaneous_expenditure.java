package com.tgs.ir.entities;

public class Miscellaneous_expenditure {
@Column(name="mis_id")
 
 private Integer  misId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="amt_to_elec_dept")
 
 private Double  amtToElecDept;

@Column(name="amt_electdept_upto_lastmonth")
 
 private Double  amtElectdeptUptoLastmonth;

@Column(name="amt_elecdept_present_month")
 
 private Double  amtElecdeptPresentMonth;

@Column(name="total_amt")
 
 private Double  totalAmt;

@Column(name="cum_amt_since_inception")
 
 private Double  cumAmtSinceInception;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="mis_exp_upto_mar")
 
 private Double  misExpUptoMar;

@Column(name="mis_exp_upto_last_month")
 
 private Double  misExpUptoLastMonth;

@Column(name="mis_exp_present_month")
 
 private Double  misExpPresentMonth;

@Column(name="total_mis_exp")
 
 private Double  totalMisExp;

@Column(name="cum_mis_exp_inception")
 
 private Double  cumMisExpInception;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="cum_mis_exp")
 
 private Double  cumMisExp;

@Column(name="amt_railway")
 
 private Double  amtRailway;

@Column(name="amt_nhai")
 
 private Double  amtNhai;

@Column(name="amt_nh")
 
 private Double  amtNh;

@Column(name="amt_rb_dept")
 
 private Double  amtRbDept;

@Column(name="others")
 
 private Double  others;

@Column(name="total_roads_rail")
 
 private Double  totalRoadsRail;

@Column(name="updated_year")
 
 private Integer  updatedYear;

@Column(name="updated_month")
 
 private Integer  updatedMonth;


    public Miscellaneous_expenditure(int mis_id, int project_id, double amt_to_elec_dept, double amt_electdept_upto_lastmonth, double amt_elecdept_present_month, double total_amt, double cum_amt_since_inception, Object remarks, double mis_exp_upto_mar, double mis_exp_upto_last_month, double mis_exp_present_month, double total_mis_exp, double cum_mis_exp_inception, Object updated_by, Object updated_time, boolean is_latest, int package_id, double cum_mis_exp, double amt_railway, double amt_nhai, double amt_nh, double amt_rb_dept, double others, double total_roads_rail, int updated_year, int updated_month) {
        this.mis_id = mis_id;
        this.project_id = project_id;
        this.amt_to_elec_dept = amt_to_elec_dept;
        this.amt_electdept_upto_lastmonth = amt_electdept_upto_lastmonth;
        this.amt_elecdept_present_month = amt_elecdept_present_month;
        this.total_amt = total_amt;
        this.cum_amt_since_inception = cum_amt_since_inception;
        this.remarks = remarks;
        this.mis_exp_upto_mar = mis_exp_upto_mar;
        this.mis_exp_upto_last_month = mis_exp_upto_last_month;
        this.mis_exp_present_month = mis_exp_present_month;
        this.total_mis_exp = total_mis_exp;
        this.cum_mis_exp_inception = cum_mis_exp_inception;
        this.updated_by = updated_by;
        this.updated_time = updated_time;
        this.is_latest = is_latest;
        this.package_id = package_id;
        this.cum_mis_exp = cum_mis_exp;
        this.amt_railway = amt_railway;
        this.amt_nhai = amt_nhai;
        this.amt_nh = amt_nh;
        this.amt_rb_dept = amt_rb_dept;
        this.others = others;
        this.total_roads_rail = total_roads_rail;
        this.updated_year = updated_year;
        this.updated_month = updated_month;
    }
}
