package com.tgs.ir.entities;

public class Case_category {
@Column(name="case_category_id")
 
 private Integer  caseCategoryId;

@Column(name="case_category")
 
 private String  caseCategory;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Case_category(int case_category_id, Object case_category, boolean delete_flag) {
        this.case_category_id = case_category_id;
        this.case_category = case_category;
        this.delete_flag = delete_flag;
    }
}
