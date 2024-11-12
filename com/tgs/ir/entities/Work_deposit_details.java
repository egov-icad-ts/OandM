package com.tgs.ir.entities;

public class Work_deposit_details {
@Column(name="dp_id")
 
 private Integer  dpId;

@Column(name="pt_id")
 
 private Integer  ptId;

@Column(name="deposit_category")
 
 private Integer  depositCategory;

@Column(name="deposit_type")
 
 private Integer  depositType;

@Column(name="amount")
 
 private Double  amount;

@Column(name="bg_dd_number")
 
 private String  bgDdNumber;

@Column(name="bg_dd_date")
 
 private timestamp without time zone  bgDdDate;

@Column(name="validate_date")
 
 private timestamp without time zone  validateDate;

@Column(name="pao_deposit_date")
 
 private timestamp without time zone  paoDepositDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="post_id")
 
 private bigint  postId;

@Column(name="tn_id")
 
 private Integer  tnId;

@Column(name="ag_id")
 
 private Integer  agId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private time without time zone  deletedTime;

@Column(name="bank_details")
 
 private String  bankDetails;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Work_deposit_details(int dp_id, int pt_id, int deposit_category, int deposit_type, double amount, Object bg_dd_number, Object bg_dd_date, Object validate_date, Object pao_deposit_date, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, int unit_id, long post_id, int tn_id, int ag_id, Object deleted_by, Object deleted_time, Object bank_details, int circle_id, int division_id, int sub_division_id) {
        this.dp_id = dp_id;
        this.pt_id = pt_id;
        this.deposit_category = deposit_category;
        this.deposit_type = deposit_type;
        this.amount = amount;
        this.bg_dd_number = bg_dd_number;
        this.bg_dd_date = bg_dd_date;
        this.validate_date = validate_date;
        this.pao_deposit_date = pao_deposit_date;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.unit_id = unit_id;
        this.post_id = post_id;
        this.tn_id = tn_id;
        this.ag_id = ag_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.bank_details = bank_details;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
