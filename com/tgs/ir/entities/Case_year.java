package com.tgs.ir.entities;

public class Case_year {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="case_year")
 
 private Integer  caseYear;


    public Case_year(int slno, int case_year) {
        this.slno = slno;
        this.case_year = case_year;
    }
}
