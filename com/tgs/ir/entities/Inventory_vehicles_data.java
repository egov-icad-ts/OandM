package com.tgs.ir.entities;

public class Inventory_vehicles_data {
@Column(name="vehicle_id")
 
 private Integer  vehicleId;

@Column(name="vehicle_number")
 
 private String  vehicleNumber;

@Column(name="make_and_model")
 
 private String  makeAndModel;

@Column(name="make_id")
 
 private Integer  makeId;

@Column(name="model_id")
 
 private Integer  modelId;

@Column(name="type")
 
 private String  type;

@Column(name="chasis_no")
 
 private String  chasisNo;

@Column(name="engine_no")
 
 private String  engineNo;

@Column(name="year_of_manufacture")
 
 private Integer  yearOfManufacture;

@Column(name="no_of_kms_run")
 
 private bigint  noOfKmsRun;

@Column(name="condition_of_the_vehicle")
 
 private String  conditionOfTheVehicle;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_userid")
 
 private String  createdUserid;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="post_id")
 
 private String  postId;

@Column(name="officer_using_the_vehicle")
 
 private String  officerUsingTheVehicle;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="status_id")
 
 private Integer  statusId;

@Column(name="deleted_userid")
 
 private String  deletedUserid;

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

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="reason")
 
 private String  reason;


    public Inventory_vehicles_data(int vehicle_id, Object vehicle_number, Object make_and_model, int make_id, int model_id, Object type, Object chasis_no, Object engine_no, int year_of_manufacture, long no_of_kms_run, Object condition_of_the_vehicle, Object remarks, boolean delete_flag, boolean is_latest, Object created_userid, Object created_timestamp, boolean edit_flag, Object updated_timestamp, int project_id, int old_division_id, Object post_id, Object officer_using_the_vehicle, int old_unit_id, int old_circle_id, int old_sub_division_id, int status_id, Object deleted_userid, Object deleted_timestamp, int reference_appr_id, int unit_id, int circle_id, int division_id, int sub_division_id, Object updated_by, Object reason) {
        this.vehicle_id = vehicle_id;
        this.vehicle_number = vehicle_number;
        this.make_and_model = make_and_model;
        this.make_id = make_id;
        this.model_id = model_id;
        this.type = type;
        this.chasis_no = chasis_no;
        this.engine_no = engine_no;
        this.year_of_manufacture = year_of_manufacture;
        this.no_of_kms_run = no_of_kms_run;
        this.condition_of_the_vehicle = condition_of_the_vehicle;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_userid = created_userid;
        this.created_timestamp = created_timestamp;
        this.edit_flag = edit_flag;
        this.updated_timestamp = updated_timestamp;
        this.project_id = project_id;
        this.old_division_id = old_division_id;
        this.post_id = post_id;
        this.officer_using_the_vehicle = officer_using_the_vehicle;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_sub_division_id = old_sub_division_id;
        this.status_id = status_id;
        this.deleted_userid = deleted_userid;
        this.deleted_timestamp = deleted_timestamp;
        this.reference_appr_id = reference_appr_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.updated_by = updated_by;
        this.reason = reason;
    }
}
