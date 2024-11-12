package com.tgs.ir.entities;

public class Case_type {
@Column(name="case_type_id")
 
 private Integer  caseTypeId;

@Column(name="case_type")
 
 private String  caseType;


    public Case_type(int case_type_id, Object case_type) {
        this.case_type_id = case_type_id;
        this.case_type = case_type;
    }
}
