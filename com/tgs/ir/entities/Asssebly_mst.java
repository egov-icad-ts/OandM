package com.tgs.ir.entities;

public class Asssebly_mst {
@Column(name="assembly_id")
 
 private Integer  assemblyId;

@Column(name="assembly_name")
 
 private String  assemblyName;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Asssebly_mst(int assembly_id, Object assembly_name, int district_id, int mandal_id, boolean delete_flag, boolean is_latest) {
        this.assembly_id = assembly_id;
        this.assembly_name = assembly_name;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
    }
}
