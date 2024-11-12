package com.tgs.ir.entities;

public class New_ce_assign_comp {
@Column(name="ce_assign_comp")
 
 private Integer  ceAssignComp;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="comp_id")
 
 private Integer  compId;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="post_id")
 
 private String  postId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="length")
 
 private Double  length;

@Column(name="from_km")
 
 private Double  fromKm;

@Column(name="to_km")
 
 private Double  toKm;


    public New_ce_assign_comp(int ce_assign_comp, int project_id, int package_id, int comp_id, int comp_type_id, int circle_id, int unit_id, Object created_by, Object post_id, boolean delete_flag, boolean is_latest, Object created_time, Object deleted_by, Object deleted_time, double length, double from_km, double to_km) {
        this.ce_assign_comp = ce_assign_comp;
        this.project_id = project_id;
        this.package_id = package_id;
        this.comp_id = comp_id;
        this.comp_type_id = comp_type_id;
        this.circle_id = circle_id;
        this.unit_id = unit_id;
        this.created_by = created_by;
        this.post_id = post_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_time = created_time;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.length = length;
        this.from_km = from_km;
        this.to_km = to_km;
    }
}
