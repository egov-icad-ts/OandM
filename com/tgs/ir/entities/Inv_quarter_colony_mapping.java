package com.tgs.ir.entities;

public class Inv_quarter_colony_mapping {
@Column(name="colony_id")
 
 private Integer  colonyId;

@Column(name="modified_id")
 
 private Integer  modifiedId;


    public Inv_quarter_colony_mapping(int colony_id, int modified_id) {
        this.colony_id = colony_id;
        this.modified_id = modified_id;
    }
}
