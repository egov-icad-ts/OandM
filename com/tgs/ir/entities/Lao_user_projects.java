package com.tgs.ir.entities;

public class Lao_user_projects {
@Column(name="lao_user_prj_id")
 
 private Integer  laoUserPrjId;

@Column(name="lao_user_id")
 
 private Integer  laoUserId;

@Column(name="lao_project_id")
 
 private Integer  laoProjectId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;


    public Lao_user_projects(int lao_user_prj_id, int lao_user_id, int lao_project_id, int district_id, int mandal_id, boolean delete_flag, Object created_date) {
        this.lao_user_prj_id = lao_user_prj_id;
        this.lao_user_id = lao_user_id;
        this.lao_project_id = lao_project_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.delete_flag = delete_flag;
        this.created_date = created_date;
    }
}
