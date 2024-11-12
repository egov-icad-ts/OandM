package com.tgs.ir.entities;

public class Respondant_advocates {
@Column(name="advocate_id")
 
 private Integer  advocateId;

@Column(name="advocate_name")
 
 private String  advocateName;


    public Respondant_advocates(int advocate_id, Object advocate_name) {
        this.advocate_id = advocate_id;
        this.advocate_name = advocate_name;
    }
}
