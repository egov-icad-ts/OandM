package com.tgs.ir.entities;

public class Project_mst {
@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="project_name")
 
 private String  projectName;

@Column(name="project_parent_id")
 
 private Integer  projectParentId;

@Column(name="project_code")
 
 private String  projectCode;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_epc")
 
 private boolean  isEpc;

@Column(name="project_old_name")
 
 private String  projectOldName;

@Column(name="project_old_id")
 
 private Integer  projectOldId;

@Column(name="project_type_id")
 
 private Integer  projectTypeId;

@Column(name="project_status_id")
 
 private Integer  projectStatusId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="project_name")
 
 private String  projectName;

@Column(name="project_parent_id")
 
 private Integer  projectParentId;

@Column(name="project_code")
 
 private String  projectCode;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_epc")
 
 private boolean  isEpc;

@Column(name="project_old_name")
 
 private String  projectOldName;

@Column(name="project_old_id")
 
 private Integer  projectOldId;

@Column(name="project_type_id")
 
 private Integer  projectTypeId;

@Column(name="project_status_id")
 
 private Integer  projectStatusId;

@Column(name="is_preplanned")
 
 private boolean  isPreplanned;

@Column(name="proj_jal_id")
 
 private Integer  projJalId;

@Column(name="show_db")
 
 private boolean  showDb;


    public Project_mst(int project_id, Object project_name, int project_parent_id, Object project_code, boolean delete_flag, boolean is_epc, Object project_old_name, int project_old_id, int project_type_id, int project_status_id, int project_id, Object project_name, int project_parent_id, Object project_code, boolean delete_flag, boolean is_epc, Object project_old_name, int project_old_id, int project_type_id, int project_status_id, boolean is_preplanned, int proj_jal_id, boolean show_db) {
        this.project_id = project_id;
        this.project_name = project_name;
        this.project_parent_id = project_parent_id;
        this.project_code = project_code;
        this.delete_flag = delete_flag;
        this.is_epc = is_epc;
        this.project_old_name = project_old_name;
        this.project_old_id = project_old_id;
        this.project_type_id = project_type_id;
        this.project_status_id = project_status_id;
        this.project_id = project_id;
        this.project_name = project_name;
        this.project_parent_id = project_parent_id;
        this.project_code = project_code;
        this.delete_flag = delete_flag;
        this.is_epc = is_epc;
        this.project_old_name = project_old_name;
        this.project_old_id = project_old_id;
        this.project_type_id = project_type_id;
        this.project_status_id = project_status_id;
        this.is_preplanned = is_preplanned;
        this.proj_jal_id = proj_jal_id;
        this.show_db = show_db;
    }
}
