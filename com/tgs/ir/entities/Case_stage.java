package com.tgs.ir.entities;

public class Case_stage {
@Column(name="case_stage_id")
 
 private Integer  caseStageId;

@Column(name="case_stage")
 
 private String  caseStage;


    public Case_stage(int case_stage_id, Object case_stage) {
        this.case_stage_id = case_stage_id;
        this.case_stage = case_stage;
    }
}
