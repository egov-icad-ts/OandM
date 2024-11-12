package com.tgs.ir.entities;

public class Work_components {
@Column(name="work_comp_id")
 
 private Integer  workCompId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="comp_id")
 
 private Double  compId;

@Column(name="parent_comp_id")
 
 private Double  parentCompId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="submited_time")
 
 private timestamp without time zone  submitedTime;

@Column(name="submited_by")
 
 private Integer  submitedBy;

@Column(name="edit_by")
 
 private Integer  editBy;

@Column(name="edit_time")
 
 private timestamp without time zone  editTime;

@Column(name="location")
 
 private String  location;

@Column(name="chainage_from_km")
 
 private Double  chainageFromKm;

@Column(name="chainage_to_km")
 
 private Double  chainageToKm;

@Column(name="work_comp_name")
 
 private String  workCompName;

@Column(name="work_comp_nos")
 
 private Double  workCompNos;

@Column(name="postid")
 
 private Integer  postid;


    public Work_components(int work_comp_id, int project_id, int package_id, double comp_id, double parent_comp_id, boolean delete_flag, boolean edit_flag, Object submited_time, int submited_by, int edit_by, Object edit_time, Object location, double chainage_from_km, double chainage_to_km, Object work_comp_name, double work_comp_nos, int postid) {
        this.work_comp_id = work_comp_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.comp_id = comp_id;
        this.parent_comp_id = parent_comp_id;
        this.delete_flag = delete_flag;
        this.edit_flag = edit_flag;
        this.submited_time = submited_time;
        this.submited_by = submited_by;
        this.edit_by = edit_by;
        this.edit_time = edit_time;
        this.location = location;
        this.chainage_from_km = chainage_from_km;
        this.chainage_to_km = chainage_to_km;
        this.work_comp_name = work_comp_name;
        this.work_comp_nos = work_comp_nos;
        this.postid = postid;
    }
}
