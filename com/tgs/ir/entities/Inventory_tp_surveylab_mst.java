package com.tgs.ir.entities;

public class Inventory_tp_surveylab_mst {
@Column(name="tp_survey_id")
 
 private Integer  tpSurveyId;

@Column(name="tp_survey_description")
 
 private String  tpSurveyDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_tp_surveylab_mst(int tp_survey_id, Object tp_survey_description, boolean delete_flag) {
        this.tp_survey_id = tp_survey_id;
        this.tp_survey_description = tp_survey_description;
        this.delete_flag = delete_flag;
    }
}
