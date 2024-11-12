package com.tgs.ir.entities;

public class Lao_survey_structures {
@Column(name="lao_survey_structures_id")
 
 private Integer  laoSurveyStructuresId;

@Column(name="dee_enter_req_id")
 
 private Integer  deeEnterReqId;

@Column(name="survey_number_id")
 
 private Integer  surveyNumberId;

@Column(name="structure_id")
 
 private Integer  structureId;

@Column(name="structue_number")
 
 private Integer  structueNumber;

@Column(name="tree_type")
 
 private String  treeType;

@Column(name="acres")
 
 private Double  acres;

@Column(name="guntas")
 
 private Double  guntas;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by_user")
 
 private String  createdByUser;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="type_id")
 
 private Integer  typeId;

@Column(name="rate_type_id")
 
 private Integer  rateTypeId;

@Column(name="rate")
 
 private Double  rate;

@Column(name="house_number")
 
 private String  houseNumber;


    public Lao_survey_structures(int lao_survey_structures_id, int dee_enter_req_id, int survey_number_id, int structure_id, int structue_number, Object tree_type, double acres, double guntas, boolean is_latest, boolean delete_flag, Object created_by_user, Object created_date, int type_id, int rate_type_id, double rate, Object house_number) {
        this.lao_survey_structures_id = lao_survey_structures_id;
        this.dee_enter_req_id = dee_enter_req_id;
        this.survey_number_id = survey_number_id;
        this.structure_id = structure_id;
        this.structue_number = structue_number;
        this.tree_type = tree_type;
        this.acres = acres;
        this.guntas = guntas;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.created_by_user = created_by_user;
        this.created_date = created_date;
        this.type_id = type_id;
        this.rate_type_id = rate_type_id;
        this.rate = rate;
        this.house_number = house_number;
    }
}
