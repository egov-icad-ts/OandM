package com.tgs.ir.entities;

public class Case_priority {
@Column(name="case_priority_id")
 
 private Integer  casePriorityId;

@Column(name="case_priority")
 
 private String  casePriority;


    public Case_priority(int case_priority_id, Object case_priority) {
        this.case_priority_id = case_priority_id;
        this.case_priority = case_priority;
    }
}
