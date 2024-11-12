package com.tgs.ir.entities;

public class Tds_outstanding_demand {
@Column(name="tds_id")
 
 private Integer  tdsId;

@Column(name="tan")
 
 private String  tan;

@Column(name="d_outstand_amt")
 
 private Double  dOutstandAmt;

@Column(name="d_late_levy")
 
 private Double  dLateLevy;

@Column(name="d_addt_late_levy")
 
 private Double  dAddtLateLevy;

@Column(name="d_interest")
 
 private Double  dInterest;

@Column(name="d_tot_outstand_demand")
 
 private Double  dTotOutstandDemand;

@Column(name="a_outstand_amt")
 
 private Double  aOutstandAmt;

@Column(name="a_late_levy")
 
 private Double  aLateLevy;

@Column(name="a_addt_late_levy")
 
 private Double  aAddtLateLevy;

@Column(name="a_interest")
 
 private Double  aInterest;

@Column(name="a_tot_outstand_demand")
 
 private Double  aTotOutstandDemand;

@Column(name="balance")
 
 private Double  balance;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_postid")
 
 private String  createdPostid;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="unit_name")
 
 private String  unitName;

@Column(name="circle_name")
 
 private String  circleName;

@Column(name="division_name")
 
 private String  divisionName;

@Column(name="d_short_payment")
 
 private Double  dShortPayment;

@Column(name="d_short_deduction")
 
 private Double  dShortDeduction;

@Column(name="a_short_payment")
 
 private Double  aShortPayment;

@Column(name="a_short_deduction")
 
 private Double  aShortDeduction;

@Column(name="o_tan")
 
 private String  oTan;

@Column(name="fin_year")
 
 private String  finYear;


    public Tds_outstanding_demand(int tds_id, Object tan, double d_outstand_amt, double d_late_levy, double d_addt_late_levy, double d_interest, double d_tot_outstand_demand, double a_outstand_amt, double a_late_levy, double a_addt_late_levy, double a_interest, double a_tot_outstand_demand, double balance, Object remarks, boolean delete_flag, Object created_by, Object created_postid, int unit_id, int circle_id, int division_id, Object created_time, Object unit_name, Object circle_name, Object division_name, double d_short_payment, double d_short_deduction, double a_short_payment, double a_short_deduction, Object o_tan, Object fin_year) {
        this.tds_id = tds_id;
        this.tan = tan;
        this.d_outstand_amt = d_outstand_amt;
        this.d_late_levy = d_late_levy;
        this.d_addt_late_levy = d_addt_late_levy;
        this.d_interest = d_interest;
        this.d_tot_outstand_demand = d_tot_outstand_demand;
        this.a_outstand_amt = a_outstand_amt;
        this.a_late_levy = a_late_levy;
        this.a_addt_late_levy = a_addt_late_levy;
        this.a_interest = a_interest;
        this.a_tot_outstand_demand = a_tot_outstand_demand;
        this.balance = balance;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.created_by = created_by;
        this.created_postid = created_postid;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.created_time = created_time;
        this.unit_name = unit_name;
        this.circle_name = circle_name;
        this.division_name = division_name;
        this.d_short_payment = d_short_payment;
        this.d_short_deduction = d_short_deduction;
        this.a_short_payment = a_short_payment;
        this.a_short_deduction = a_short_deduction;
        this.o_tan = o_tan;
        this.fin_year = fin_year;
    }
}
