package com.tgs.ir.entities;

public class Consolidated_exp_proforma {
@Column(name="cexp_id")
 
 private Integer  cexpId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="admin_sanc")
 
 private Double  adminSanc;

@Column(name="agrmnt_value")
 
 private Double  agrmntValue;

@Column(name="works")
 
 private Double  works;

@Column(name="price_esc")
 
 private Double  priceEsc;

@Column(name="la_exp")
 
 private Double  laExp;

@Column(name="rr_exp")
 
 private Double  rrExp;

@Column(name="forest_exp")
 
 private Double  forestExp;

@Column(name="crossing_exp")
 
 private Double  crossingExp;

@Column(name="misc_exp")
 
 private Double  miscExp;

@Column(name="htcc_exp")
 
 private Double  htccExp;

@Column(name="total")
 
 private Double  total;

@Column(name="finan_progress_percent")
 
 private Double  finanProgressPercent;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="updated_month")
 
 private Integer  updatedMonth;

@Column(name="updated_year")
 
 private Integer  updatedYear;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Consolidated_exp_proforma(int cexp_id, int project_id, double admin_sanc, double agrmnt_value, double works, double price_esc, double la_exp, double rr_exp, double forest_exp, double crossing_exp, double misc_exp, double htcc_exp, double total, double finan_progress_percent, boolean delete_flag, int updated_month, int updated_year, Object created_by, Object created_timestamp, boolean is_latest) {
        this.cexp_id = cexp_id;
        this.project_id = project_id;
        this.admin_sanc = admin_sanc;
        this.agrmnt_value = agrmnt_value;
        this.works = works;
        this.price_esc = price_esc;
        this.la_exp = la_exp;
        this.rr_exp = rr_exp;
        this.forest_exp = forest_exp;
        this.crossing_exp = crossing_exp;
        this.misc_exp = misc_exp;
        this.htcc_exp = htcc_exp;
        this.total = total;
        this.finan_progress_percent = finan_progress_percent;
        this.delete_flag = delete_flag;
        this.updated_month = updated_month;
        this.updated_year = updated_year;
        this.created_by = created_by;
        this.created_timestamp = created_timestamp;
        this.is_latest = is_latest;
    }
}
