package com.tgs.ir.entities;

public class Unit_mst {
@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="unit_name")
 
 private String  unitName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="head_quarters_id")
 
 private Integer  headQuartersId;

@Column(name="status")
 
 private String  status;

@Column(name="unit_short_name")
 
 private String  unitShortName;


    public Unit_mst(int unit_id, Object unit_name, boolean delete_flag, int head_quarters_id, Object status, Object unit_short_name) {
        this.unit_id = unit_id;
        this.unit_name = unit_name;
        this.delete_flag = delete_flag;
        this.head_quarters_id = head_quarters_id;
        this.status = status;
        this.unit_short_name = unit_short_name;
    }
}
