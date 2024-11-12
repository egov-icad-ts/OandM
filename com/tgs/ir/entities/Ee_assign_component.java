package com.tgs.ir.entities;

public class Ee_assign_component {
@Column(name="ee_assign_comp_id")
 
 private Integer  eeAssignCompId;

@Column(name="se_assign_package_comp_id")
 
 private Integer  seAssignPackageCompId;

@Column(name="comp_canal_res_lift_id")
 
 private Integer  compCanalResLiftId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="subdivision_post")
 
 private Integer  subdivisionPost;

@Column(name="section_post")
 
 private Integer  sectionPost;

@Column(name="section_id")
 
 private Integer  sectionId;

@Column(name="designation")
 
 private Integer  designation;

@Column(name="revision_component")
 
 private Integer  revisionComponent;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="created_by_postid")
 
 private bigint  createdByPostid;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="comp_type_id")
 
 private Integer  compTypeId;

@Column(name="fromkm")
 
 private Double  fromkm;

@Column(name="tokm")
 
 private Double  tokm;


    public Ee_assign_component(int ee_assign_comp_id, int se_assign_package_comp_id, int comp_canal_res_lift_id, int project_id, int package_id, int circle_id, int division_id, int sub_division_id, int subdivision_post, int section_post, int section_id, int designation, int revision_component, boolean delete_flag, boolean is_latest, Object created_by_username, long created_by_postid, Object submited_date, int district_id, int comp_type_id, double fromkm, double tokm) {
        this.ee_assign_comp_id = ee_assign_comp_id;
        this.se_assign_package_comp_id = se_assign_package_comp_id;
        this.comp_canal_res_lift_id = comp_canal_res_lift_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.subdivision_post = subdivision_post;
        this.section_post = section_post;
        this.section_id = section_id;
        this.designation = designation;
        this.revision_component = revision_component;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_username = created_by_username;
        this.created_by_postid = created_by_postid;
        this.submited_date = submited_date;
        this.district_id = district_id;
        this.comp_type_id = comp_type_id;
        this.fromkm = fromkm;
        this.tokm = tokm;
    }
}
