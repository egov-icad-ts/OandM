package com.tgs.ir.entities;

public class Rate_mst {
@Column(name="rate_id")
 
 private Integer  rateId;

@Column(name="rate")
 
 private Double  rate;

@Column(name="type_id")
 
 private Integer  typeId;

@Column(name="la_structure_id")
 
 private Integer  laStructureId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="year")
 
 private String  year;


    public Rate_mst(int rate_id, double rate, int type_id, int la_structure_id, boolean delete_flag, boolean is_latest, Object year) {
        this.rate_id = rate_id;
        this.rate = rate;
        this.type_id = type_id;
        this.la_structure_id = la_structure_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.year = year;
    }
}
