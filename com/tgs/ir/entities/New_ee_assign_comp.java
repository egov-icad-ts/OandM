package com.tgs.ir.entities;

public class New_ee_assign_comp {
@Column(name="ee_re_assign_id")
 
 private Integer  eeReAssignId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="comp_id")
 
 private Integer  compId;

@Column(name="from_km")
 
 private Double  fromKm;

@Column(name="to_km")
 
 private Double  toKm;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;

@Column(name="se_assign_id")
 
 private Integer  seAssignId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="post_id")
 
 private String  postId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;


    public New_ee_assign_comp(int ee_re_assign_id, int project_id, int package_id, int comp_id, double from_km, double to_km, int comp_type_id, int se_assign_id, int unit_id, int circle_id, int division_id, int sub_division_id, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, Object post_id, Object deleted_by, Object deleted_time) {
        this.ee_re_assign_id = ee_re_assign_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.comp_id = comp_id;
        this.from_km = from_km;
        this.to_km = to_km;
        this.comp_type_id = comp_type_id;
        this.se_assign_id = se_assign_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.post_id = post_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
    }
}
