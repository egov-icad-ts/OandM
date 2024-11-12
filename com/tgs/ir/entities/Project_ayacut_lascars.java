package com.tgs.ir.entities;

public class Project_ayacut_lascars {
@Column(name="als_id")
 
 private Integer  alsId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="contemplated")
 
 private Double  contemplated;

@Column(name="created")
 
 private Double  created;

@Column(name="irrigated")
 
 private Double  irrigated;

@Column(name="total_lascars")
 
 private Integer  totalLascars;

@Column(name="req_lascars")
 
 private Integer  reqLascars;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;

@Column(name="updated_timestamp")
 
 private timestamp without time zone  updatedTimestamp;

@Column(name="deleted_timestamp")
 
 private timestamp without time zone  deletedTimestamp;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="district_name")
 
 private String  districtName;

@Column(name="mandal_name")
 
 private String  mandalName;

@Column(name="village_name")
 
 private String  villageName;


    public Project_ayacut_lascars(int als_id, int project_id, int district_id, int mandal_id, int village_id, double contemplated, double created, double irrigated, int total_lascars, int req_lascars, Object remarks, boolean delete_flag, boolean is_latest, Object created_by, Object updated_by, Object deleted_by, Object created_timestamp, Object updated_timestamp, Object deleted_timestamp, int unit_id, int circle_id, int division_id, Object district_name, Object mandal_name, Object village_name) {
        this.als_id = als_id;
        this.project_id = project_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.contemplated = contemplated;
        this.created = created;
        this.irrigated = irrigated;
        this.total_lascars = total_lascars;
        this.req_lascars = req_lascars;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.updated_by = updated_by;
        this.deleted_by = deleted_by;
        this.created_timestamp = created_timestamp;
        this.updated_timestamp = updated_timestamp;
        this.deleted_timestamp = deleted_timestamp;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.district_name = district_name;
        this.mandal_name = mandal_name;
        this.village_name = village_name;
    }
}
