package com.tgs.ir.entities;

public class River_mst {
@Column(name="river_id")
 
 private Integer  riverId;

@Column(name="river_name")
 
 private String  riverName;


    public River_mst(int river_id, Object river_name) {
        this.river_id = river_id;
        this.river_name = river_name;
    }
}
