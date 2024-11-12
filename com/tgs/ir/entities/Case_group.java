package com.tgs.ir.entities;

public class Case_group {
@Column(name="case_group_id")
 
 private Integer  caseGroupId;

@Column(name="case_group")
 
 private String  caseGroup;


    public Case_group(int case_group_id, Object case_group) {
        this.case_group_id = case_group_id;
        this.case_group = case_group;
    }
}
