package com.tgs.ir.entities;

public class Inventory_quarter_colony_details {
@Column(name="colony_id")
 
 private Integer  colonyId;

@Column(name="colony_name")
 
 private String  colonyName;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_userid")
 
 private String  createdUserid;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="post_id")
 
 private String  postId;

@Column(name="old_unit_id")
 
 private Integer  oldUnitId;

@Column(name="old_circle_id")
 
 private Integer  oldCircleId;

@Column(name="old_division_id")
 
 private Integer  oldDivisionId;

@Column(name="old_sub_division_id")
 
 private Integer  oldSubDivisionId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="is_changed")
 
 private String  isChanged;


    public Inventory_quarter_colony_details(int colony_id, Object colony_name, int district_id, int mandal_id, int village_id, boolean delete_flag, boolean is_latest, Object created_userid, Object created_timestamp, Object updated_timestamp, int project_id, Object post_id, int old_unit_id, int old_circle_id, int old_division_id, int old_sub_division_id, int unit_id, int circle_id, int division_id, int sub_division_id, Object is_changed) {
        this.colony_id = colony_id;
        this.colony_name = colony_name;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_userid = created_userid;
        this.created_timestamp = created_timestamp;
        this.updated_timestamp = updated_timestamp;
        this.project_id = project_id;
        this.post_id = post_id;
        this.old_unit_id = old_unit_id;
        this.old_circle_id = old_circle_id;
        this.old_division_id = old_division_id;
        this.old_sub_division_id = old_sub_division_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.is_changed = is_changed;
    }
}
