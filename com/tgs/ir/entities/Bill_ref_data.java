package com.tgs.ir.entities;

public class Bill_ref_data {
@Column(name="ref_id")
 
 private Integer  refId;

@Column(name="division_bill_number")
 
 private Integer  divisionBillNumber;

@Column(name="gross_amount")
 
 private Double  grossAmount;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="ref_flag")
 
 private boolean  refFlag;

@Column(name="proc_id")
 
 private Integer  procId;

@Column(name="ref_status")
 
 private Integer  refStatus;

@Column(name="head_of_account")
 
 private String  headOfAccount;

@Column(name="voted_charged")
 
 private String  votedCharged;

@Column(name="bill_description")
 
 private String  billDescription;

@Column(name="bill_proceeding")
 
 private String  billProceeding;

@Column(name="bill_check")
 
 private String  billCheck;

@Column(name="loc")
 
 private String  loc;

@Column(name="stamped_acquitance")
 
 private String  stampedAcquitance;


    public Bill_ref_data(int ref_id, int division_bill_number, double gross_amount, boolean delete_flag, boolean ref_flag, int proc_id, int ref_status, Object head_of_account, Object voted_charged, Object bill_description, Object bill_proceeding, Object bill_check, Object loc, Object stamped_acquitance) {
        this.ref_id = ref_id;
        this.division_bill_number = division_bill_number;
        this.gross_amount = gross_amount;
        this.delete_flag = delete_flag;
        this.ref_flag = ref_flag;
        this.proc_id = proc_id;
        this.ref_status = ref_status;
        this.head_of_account = head_of_account;
        this.voted_charged = voted_charged;
        this.bill_description = bill_description;
        this.bill_proceeding = bill_proceeding;
        this.bill_check = bill_check;
        this.loc = loc;
        this.stamped_acquitance = stamped_acquitance;
    }
}
