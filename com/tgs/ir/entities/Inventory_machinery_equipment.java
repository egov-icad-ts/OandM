package com.tgs.ir.entities;

public class Inventory_machinery_equipment {
@Column(name="equipment_machinery_id")
 
 private Integer  equipmentMachineryId;

@Column(name="type_of_machinery")
 
 private String  typeOfMachinery;

@Column(name="specifications")
 
 private String  specifications;

@Column(name="make_and_model")
 
 private String  makeAndModel;

@Column(name="date_of_purchase_or_installation")
 
 private timestamp without time zone  dateOfPurchaseOrInstallation;

@Column(name="condition_status")
 
 private String  conditionStatus;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="created_by_user")
 
 private String  createdByUser;

@Column(name="post_id")
 
 private String  postId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="no_of_kms")
 
 private Double  noOfKms;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="year_of_purchase")
 
 private Integer  yearOfPurchase;

@Column(name="deleted_by_user")
 
 private String  deletedByUser;

@Column(name="deleted_timetamp")
 
 private timestamp without time zone  deletedTimetamp;

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

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="reason")
 
 private String  reason;


    public Inventory_machinery_equipment(int equipment_machinery_id, Object type_of_machinery, Object specifications, Object make_and_model, Object date_of_purchase_or_installation, Object condition_status, int project_id, int old_division_id, Object created_by_user, Object post_id, boolean delete_flag, Object created_time, Object updated_time, double no_of_kms, Object remarks, int old_unit_id, int old_circle_id, int old_sub_division_id, int status_id, int year_of_purchase, Object deleted_by_user, Object deleted_timetamp, int reference_appr_id, int unit_id, int circle_id, int division_id, int sub_division_id, Object updated_by, Object updated_timestamp, Object reason) {
        this.equipment_machinery_id = equipment_machinery_id;
        this.type_of_machinery = type_of_machinery;
        this.specifications = specifications;
        this.make_and_model = make_and_model;
        this.date_of_purchase_or_installation = date_of_purchase_or_installation;
        this.condition_status = condition_status;
        this.project_id = project_id;
        this.old_division_id = old_division_id;
        this.created_by_user = created_by_user;
        this.post_id = post_id;
        this.delete_flag = delete_flag;
        this.created_time = created_time;
        this.updated_time = updated_time;
        this.no_of_kms = no_of_kms;
        this.remarks = remarks;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.year_of_purchase = year_of_purchase;
        this.deleted_by_user = deleted_by_user;
        this.deleted_timetamp = deleted_timetamp;
        this.reference_appr_id = reference_appr_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.updated_by = updated_by;
        this.updated_timestamp = updated_timestamp;
        this.reason = reason;
    }
}
