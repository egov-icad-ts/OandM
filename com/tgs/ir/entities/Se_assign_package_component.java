package com.tgs.ir.entities;

public class Se_assign_package_component {
@Column(name="se_assign_package_comp_id")
 
 private Integer  seAssignPackageCompId;

@Column(name="ce_assign_se_canal_res_lift_id")
 
 private Integer  ceAssignSeCanalResLiftId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="comp_canal_res_lift_id")
 
 private Integer  compCanalResLiftId;

@Column(name="comp_parent_id")
 
 private Integer  compParentId;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;

@Column(name="created_by_user")
 
 private String  createdByUser;

@Column(name="created_by_post")
 
 private String  createdByPost;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_time")
 
 private time without time zone  createdTime;

@Column(name="fromkm")
 
 private Double  fromkm;

@Column(name="tokm")
 
 private Double  tokm;

@Column(name="ip_created")
 
 private Double  ipCreated;

@Column(name="created_timestamp")
 
 private timestamp without time zone  createdTimestamp;


    public Se_assign_package_component(int se_assign_package_comp_id, int ce_assign_se_canal_res_lift_id, int project_id, int package_id, int district_id, int comp_canal_res_lift_id, int comp_parent_id, int comp_type_id, Object created_by_user, Object created_by_post, boolean delete_flag, boolean is_latest, Object created_time, double fromkm, double tokm, double ip_created, Object created_timestamp) {
        this.se_assign_package_comp_id = se_assign_package_comp_id;
        this.ce_assign_se_canal_res_lift_id = ce_assign_se_canal_res_lift_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.district_id = district_id;
        this.comp_canal_res_lift_id = comp_canal_res_lift_id;
        this.comp_parent_id = comp_parent_id;
        this.comp_type_id = comp_type_id;
        this.created_by_user = created_by_user;
        this.created_by_post = created_by_post;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_time = created_time;
        this.fromkm = fromkm;
        this.tokm = tokm;
        this.ip_created = ip_created;
        this.created_timestamp = created_timestamp;
    }
}
