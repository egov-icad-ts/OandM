package com.tgs.ir.entities;

public class La_irri_montly_acq_proforma {
@Column(name="la_irr_acq_id")
 
 private Integer  laIrrAcqId;

@Column(name="la_req_ac")
 
 private Integer  laReqAc;

@Column(name="la_req_gt")
 
 private Double  laReqGt;

@Column(name="la_acq_prev_ac")
 
 private Integer  laAcqPrevAc;

@Column(name="la_acq_prev_gt")
 
 private Double  laAcqPrevGt;

@Column(name="la_acq_this_ac")
 
 private Integer  laAcqThisAc;

@Column(name="la_acq_this_gt")
 
 private Double  laAcqThisGt;

@Column(name="cum_this_ac")
 
 private Integer  cumThisAc;

@Column(name="cum_this_gt")
 
 private Double  cumThisGt;

@Column(name="bal_ac")
 
 private Integer  balAc;

@Column(name="bal_gt")
 
 private Double  balGt;

@Column(name="sdr_ac")
 
 private Integer  sdrAc;

@Column(name="sdr_gt")
 
 private Double  sdrGt;

@Column(name="pn_ac")
 
 private Integer  pnAc;

@Column(name="pn_gt")
 
 private Double  pnGt;

@Column(name="pd_dn_ac")
 
 private Integer  pdDnAc;

@Column(name="pd_pn_gt")
 
 private Double  pdPnGt;

@Column(name="award_ac")
 
 private Integer  awardAc;

@Column(name="award_gt")
 
 private Double  awardGt;

@Column(name="tot_bal_ac")
 
 private Integer  totBalAc;

@Column(name="tot_bal_gt")
 
 private Double  totBalGt;

@Column(name="la_issues")
 
 private String  laIssues;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="prj_id")
 
 private Integer  prjId;

@Column(name="pkg_id")
 
 private Integer  pkgId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="sdc_lao_id")
 
 private Integer  sdcLaoId;

@Column(name="month")
 
 private Integer  month;

@Column(name="year")
 
 private Integer  year;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_date")
 
 private timestamp without time zone  deletedDate;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_date")
 
 private timestamp without time zone  updatedDate;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="tot_land_required_irr_id")
 
 private Integer  totLandRequiredIrrId;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public La_irri_montly_acq_proforma(int la_irr_acq_id, int la_req_ac, double la_req_gt, int la_acq_prev_ac, double la_acq_prev_gt, int la_acq_this_ac, double la_acq_this_gt, int cum_this_ac, double cum_this_gt, int bal_ac, double bal_gt, int sdr_ac, double sdr_gt, int pn_ac, double pn_gt, int pd_dn_ac, double pd_pn_gt, int award_ac, double award_gt, int tot_bal_ac, double tot_bal_gt, Object la_issues, Object remarks, int prj_id, int pkg_id, int district_id, int sdc_lao_id, int month, int year, int unit_id, int circle_id, int division_id, Object created_by, Object created_date, Object deleted_by, Object deleted_date, Object updated_by, Object updated_date, int mandal_id, int village_id, boolean delete_flag, int tot_land_required_irr_id, boolean is_latest) {
        this.la_irr_acq_id = la_irr_acq_id;
        this.la_req_ac = la_req_ac;
        this.la_req_gt = la_req_gt;
        this.la_acq_prev_ac = la_acq_prev_ac;
        this.la_acq_prev_gt = la_acq_prev_gt;
        this.la_acq_this_ac = la_acq_this_ac;
        this.la_acq_this_gt = la_acq_this_gt;
        this.cum_this_ac = cum_this_ac;
        this.cum_this_gt = cum_this_gt;
        this.bal_ac = bal_ac;
        this.bal_gt = bal_gt;
        this.sdr_ac = sdr_ac;
        this.sdr_gt = sdr_gt;
        this.pn_ac = pn_ac;
        this.pn_gt = pn_gt;
        this.pd_dn_ac = pd_dn_ac;
        this.pd_pn_gt = pd_pn_gt;
        this.award_ac = award_ac;
        this.award_gt = award_gt;
        this.tot_bal_ac = tot_bal_ac;
        this.tot_bal_gt = tot_bal_gt;
        this.la_issues = la_issues;
        this.remarks = remarks;
        this.prj_id = prj_id;
        this.pkg_id = pkg_id;
        this.district_id = district_id;
        this.sdc_lao_id = sdc_lao_id;
        this.month = month;
        this.year = year;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.created_by = created_by;
        this.created_date = created_date;
        this.deleted_by = deleted_by;
        this.deleted_date = deleted_date;
        this.updated_by = updated_by;
        this.updated_date = updated_date;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.delete_flag = delete_flag;
        this.tot_land_required_irr_id = tot_land_required_irr_id;
        this.is_latest = is_latest;
    }
}
