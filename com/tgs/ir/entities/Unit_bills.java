package com.tgs.ir.entities;

public class Unit_bills {
@Column(name="bill_id")
 
 private Integer  billId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="pao")
 
 private String  pao;

@Column(name="bill_type")
 
 private String  billType;

@Column(name="ddo_code")
 
 private String  ddoCode;

@Column(name="division_name")
 
 private String  divisionName;

@Column(name="urn")
 
 private String  urn;

@Column(name="token_no")
 
 private String  tokenNo;

@Column(name="token_date")
 
 private String  tokenDate;

@Column(name="head_of_account")
 
 private String  headOfAccount;

@Column(name="gross_amount")
 
 private Double  grossAmount;

@Column(name="net_amount")
 
 private Double  netAmount;

@Column(name="work_name")
 
 private String  workName;

@Column(name="new_pao")
 
 private String  newPao;

@Column(name="new_ddo_code")
 
 private String  newDdoCode;

@Column(name="new_ddo_name")
 
 private String  newDdoName;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;


    public Unit_bills(int bill_id, int unit_id, Object pao, Object bill_type, Object ddo_code, Object division_name, Object urn, Object token_no, Object token_date, Object head_of_account, double gross_amount, double net_amount, Object work_name, Object new_pao, Object new_ddo_code, Object new_ddo_name, Object created_by, int old_unit_id, boolean delete_flag, Object created_date) {
        this.bill_id = bill_id;
        this.unit_id = unit_id;
        this.pao = pao;
        this.bill_type = bill_type;
        this.ddo_code = ddo_code;
        this.division_name = division_name;
        this.urn = urn;
        this.token_no = token_no;
        this.token_date = token_date;
        this.head_of_account = head_of_account;
        this.gross_amount = gross_amount;
        this.net_amount = net_amount;
        this.work_name = work_name;
        this.new_pao = new_pao;
        this.new_ddo_code = new_ddo_code;
        this.new_ddo_name = new_ddo_name;
        this.created_by = created_by;
        this.old_unit_id = old_unit_id;
        this.delete_flag = delete_flag;
        this.created_date = created_date;
    }
}
