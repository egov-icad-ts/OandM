package com.tgs.ir.entities;

public class Month_mst {
@Column(name="month")
 
 private Integer  month;

@Column(name="month_name")
 
 private String  monthName;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Month_mst(int month, Object month_name, boolean delete_flag) {
        this.month = month;
        this.month_name = month_name;
        this.delete_flag = delete_flag;
    }
}
