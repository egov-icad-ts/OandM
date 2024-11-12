package com.tgs.ir.entities;

public class Tools_plant_data {
@Column(name="tp_id")
 
 private Integer  tpId;

@Column(name="airtcle")
 
 private Integer  airtcle;

@Column(name="sub_article_id")
 
 private String  subArticleId;

@Column(name="specification")
 
 private String  specification;

@Column(name="make_model_no")
 
 private String  makeModelNo;

@Column(name="year")
 
 private Integer  year;

@Column(name="condition")
 
 private String  condition;

@Column(name="opening_quantity")
 
 private Integer  openingQuantity;

@Column(name="total_reciept")
 
 private Integer  totalReciept;

@Column(name="closing_balance")
 
 private Integer  closingBalance;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="post_id")
 
 private String  postId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="deleted_by_username")
 
 private String  deletedByUsername;

@Column(name="deleted_timestamp")
 
 private timestamp without time zone  deletedTimestamp;

@Column(name="reference_appr_id")
 
 private Integer  referenceApprId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="reason")
 
 private String  reason;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="up_year")
 
 private Integer  upYear;


    public Tools_plant_data(int tp_id, int airtcle, Object sub_article_id, Object specification, Object make_model_no, int year, Object condition, int opening_quantity, int total_reciept, int closing_balance, Object created_by_username, Object post_id, boolean delete_flag, boolean is_latest, Object created_timestamp, int project_id, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int status_id, Object deleted_by_username, Object deleted_timestamp, int reference_appr_id, int unit_id, int circle_id, int division_id, int sub_division_id, Object reason, Object updated_by, Object updated_time, int up_year) {
        this.tp_id = tp_id;
        this.airtcle = airtcle;
        this.sub_article_id = sub_article_id;
        this.specification = specification;
        this.make_model_no = make_model_no;
        this.year = year;
        this.condition = condition;
        this.opening_quantity = opening_quantity;
        this.total_reciept = total_reciept;
        this.closing_balance = closing_balance;
        this.created_by_username = created_by_username;
        this.post_id = post_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_timestamp = created_timestamp;
        this.project_id = project_id;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.deleted_by_username = deleted_by_username;
        this.deleted_timestamp = deleted_timestamp;
        this.reference_appr_id = reference_appr_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.reason = reason;
        this.updated_by = updated_by;
        this.updated_time = updated_time;
        this.up_year = up_year;
    }
}
