package com.tgs.ir.entities;

public class Budget_mst {
@Column(name="budget_id")
 
 private Integer  budgetId;

@Column(name="hoa")
 
 private String  hoa;

@Column(name="budgettype")
 
 private String  budgettype;

@Column(name="totalbudget")
 
 private Double  totalbudget;

@Column(name="eligiblebudget")
 
 private Double  eligiblebudget;

@Column(name="expenditureamount")
 
 private Double  expenditureamount;

@Column(name="authorizedamount")
 
 private Double  authorizedamount;

@Column(name="totalexpenditure")
 
 private Double  totalexpenditure;

@Column(name="balancebe")
 
 private Double  balancebe;

@Column(name="billspending")
 
 private Double  billspending;

@Column(name="availablebe")
 
 private Double  availablebe;

@Column(name="readyforpayment")
 
 private Double  readyforpayment;

@Column(name="unit_id")
 
 private Double  unitId;

@Column(name="budget_year")
 
 private Double  budgetYear;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Budget_mst(int budget_id, Object hoa, Object budgettype, double totalbudget, double eligiblebudget, double expenditureamount, double authorizedamount, double totalexpenditure, double balancebe, double billspending, double availablebe, double readyforpayment, double unit_id, double budget_year, boolean delete_flag, Object created_date, boolean is_latest) {
        this.budget_id = budget_id;
        this.hoa = hoa;
        this.budgettype = budgettype;
        this.totalbudget = totalbudget;
        this.eligiblebudget = eligiblebudget;
        this.expenditureamount = expenditureamount;
        this.authorizedamount = authorizedamount;
        this.totalexpenditure = totalexpenditure;
        this.balancebe = balancebe;
        this.billspending = billspending;
        this.availablebe = availablebe;
        this.readyforpayment = readyforpayment;
        this.unit_id = unit_id;
        this.budget_year = budget_year;
        this.delete_flag = delete_flag;
        this.created_date = created_date;
        this.is_latest = is_latest;
    }
}
