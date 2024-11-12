package com.tgs.ir.entities;

public class Surveynumber_structures {
@Column(name="survey_no_struct_id")
 
 private Integer  surveyNoStructId;

@Column(name="dee_enter_req_id")
 
 private Integer  deeEnterReqId;

@Column(name="la_structure_id")
 
 private Integer  laStructureId;

@Column(name="la_structure_area_acres")
 
 private Double  laStructureAreaAcres;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by_post")
 
 private bigint  createdByPost;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="created_user_name")
 
 private String  createdUserName;

@Column(name="subdivision_id")
 
 private Integer  subdivisionId;


    public Surveynumber_structures(int survey_no_struct_id, int dee_enter_req_id, int la_structure_id, double la_structure_area_acres, boolean delete_flag, long created_by_post, Object created_date, Object created_user_name, int subdivision_id) {
        this.survey_no_struct_id = survey_no_struct_id;
        this.dee_enter_req_id = dee_enter_req_id;
        this.la_structure_id = la_structure_id;
        this.la_structure_area_acres = la_structure_area_acres;
        this.delete_flag = delete_flag;
        this.created_by_post = created_by_post;
        this.created_date = created_date;
        this.created_user_name = created_user_name;
        this.subdivision_id = subdivision_id;
    }
}
