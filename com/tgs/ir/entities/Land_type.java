package com.tgs.ir.entities;

public class Land_type {
@Column(name="govt_patta")
 
 private Integer  govtPatta;

@Column(name="type")
 
 private String  type;


    public Land_type(int govt_patta, Object type) {
        this.govt_patta = govt_patta;
        this.type = type;
    }
}
