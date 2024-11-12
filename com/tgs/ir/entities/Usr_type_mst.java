package com.tgs.ir.entities;

public class Usr_type_mst {
@Column(name="usr_type_id")
 
 private Integer  usrTypeId;

@Column(name="usr_type")
 
 private String  usrType;


    public Usr_type_mst(int usr_type_id, Object usr_type) {
        this.usr_type_id = usr_type_id;
        this.usr_type = usr_type;
    }
}
