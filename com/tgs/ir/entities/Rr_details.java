package com.tgs.ir.entities;

public class Rr_details {
@Column(name="rr_id")
 
 private Integer  rrId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="prj_adminstr")
 
 private String  prjAdminstr;

@Column(name="rr_centres_contemplated")
 
 private Integer  rrCentresContemplated;

@Column(name="lndacq_no_rrcentres")
 
 private Integer  lndacqNoRrcentres;

@Column(name="no_villages_affected")
 
 private Integer  noVillagesAffected;

@Column(name="no_families_involved")
 
 private Integer  noFamiliesInvolved;

@Column(name="no_sc_st_families")
 
 private Integer  noScStFamilies;

@Column(name="no_sc_st_persons")
 
 private Integer  noScStPersons;

@Column(name="no_bc_families")
 
 private Integer  noBcFamilies;

@Column(name="no_bc_persons")
 
 private Integer  noBcPersons;

@Column(name="hunits_pattas_issued")
 
 private Integer  hunitsPattasIssued;

@Column(name="hunits_completed")
 
 private Integer  hunitsCompleted;

@Column(name="estimated_cost")
 
 private Double  estimatedCost;

@Column(name="amt_revenue_upto_mar")
 
 private Double  amtRevenueUptoMar;

@Column(name="amt_revenue_upto_lastmonth")
 
 private Double  amtRevenueUptoLastmonth;

@Column(name="amnt_revenue_present_month")
 
 private Double  amntRevenuePresentMonth;

@Column(name="total_amt_revenue")
 
 private Double  totalAmtRevenue;

@Column(name="cum_amt_frm_inceptn")
 
 private Double  cumAmtFrmInceptn;

@Column(name="delay_reasons")
 
 private String  delayReasons;

@Column(name="updated_year")
 
 private String  updatedYear;

@Column(name="updated_month")
 
 private String  updatedMonth;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Rr_details(int rr_id, int project_id, Object prj_adminstr, int rr_centres_contemplated, int lndacq_no_rrcentres, int no_villages_affected, int no_families_involved, int no_sc_st_families, int no_sc_st_persons, int no_bc_families, int no_bc_persons, int hunits_pattas_issued, int hunits_completed, double estimated_cost, double amt_revenue_upto_mar, double amt_revenue_upto_lastmonth, double amnt_revenue_present_month, double total_amt_revenue, double cum_amt_frm_inceptn, Object delay_reasons, Object updated_year, Object updated_month, Object updated_by, Object updated_timestamp, boolean is_latest) {
        this.rr_id = rr_id;
        this.project_id = project_id;
        this.prj_adminstr = prj_adminstr;
        this.rr_centres_contemplated = rr_centres_contemplated;
        this.lndacq_no_rrcentres = lndacq_no_rrcentres;
        this.no_villages_affected = no_villages_affected;
        this.no_families_involved = no_families_involved;
        this.no_sc_st_families = no_sc_st_families;
        this.no_sc_st_persons = no_sc_st_persons;
        this.no_bc_families = no_bc_families;
        this.no_bc_persons = no_bc_persons;
        this.hunits_pattas_issued = hunits_pattas_issued;
        this.hunits_completed = hunits_completed;
        this.estimated_cost = estimated_cost;
        this.amt_revenue_upto_mar = amt_revenue_upto_mar;
        this.amt_revenue_upto_lastmonth = amt_revenue_upto_lastmonth;
        this.amnt_revenue_present_month = amnt_revenue_present_month;
        this.total_amt_revenue = total_amt_revenue;
        this.cum_amt_frm_inceptn = cum_amt_frm_inceptn;
        this.delay_reasons = delay_reasons;
        this.updated_year = updated_year;
        this.updated_month = updated_month;
        this.updated_by = updated_by;
        this.updated_timestamp = updated_timestamp;
        this.is_latest = is_latest;
    }
}
