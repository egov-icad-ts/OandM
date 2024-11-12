package com.tgs.ir.entities;

public class Budget_reappropriation {
@Column(name="reapp_id")
 
 private Integer  reappId;

@Column(name="referenceid")
 
 private Double  referenceid;

@Column(name="hoa")
 
 private String  hoa;

@Column(name="budgettype")
 
 private String  budgettype;

@Column(name="totalbudget")
 
 private Double  totalbudget;

@Column(name="availablebudget")
 
 private Double  availablebudget;

@Column(name="newavailablebudget")
 
 private Double  newavailablebudget;

@Column(name="unit_id")
 
 private Double  unitId;

@Column(name="budget_year")
 
 private Double  budgetYear;

@Column(name="budgetfrom")
 
 private boolean  budgetfrom;

@Column(name="budgetto")
 
 private boolean  budgetto;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="budgetproceding")
 
 private String  budgetproceding;

@Column(name="budgetprocedingdate")
 
 private date  budgetprocedingdate;


    public Budget_reappropriation(int reapp_id, double referenceid, Object hoa, Object budgettype, double totalbudget, double availablebudget, double newavailablebudget, double unit_id, double budget_year, boolean budgetfrom, boolean budgetto, boolean delete_flag, Object created_date, boolean is_latest, Object budgetproceding, Object budgetprocedingdate) {
        this.reapp_id = reapp_id;
        this.referenceid = referenceid;
        this.hoa = hoa;
        this.budgettype = budgettype;
        this.totalbudget = totalbudget;
        this.availablebudget = availablebudget;
        this.newavailablebudget = newavailablebudget;
        this.unit_id = unit_id;
        this.budget_year = budget_year;
        this.budgetfrom = budgetfrom;
        this.budgetto = budgetto;
        this.delete_flag = delete_flag;
        this.created_date = created_date;
        this.is_latest = is_latest;
        this.budgetproceding = budgetproceding;
        this.budgetprocedingdate = budgetprocedingdate;
    }
}
