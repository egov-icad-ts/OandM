package com.tgs.ir.entities;

public class Gis_soi_sheetno {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="topo_name")
 
 private String  topoName;

@Column(name="sheet_no")
 
 private String  sheetNo;

@Column(name="category_id")
 
 private Integer  categoryId;


    public Gis_soi_sheetno(int slno, Object topo_name, Object sheet_no, int category_id) {
        this.slno = slno;
        this.topo_name = topo_name;
        this.sheet_no = sheet_no;
        this.category_id = category_id;
    }
}
