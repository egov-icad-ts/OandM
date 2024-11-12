package com.tgs.ir.entities;

public class Canal_structures {
@Column(name="slno")
 
 private Integer  slno;

@Column(name="description")
 
 private String  description;

@Column(name="structure_type")
 
 private String  structureType;


    public Canal_structures(int slno, Object description, Object structure_type) {
        this.slno = slno;
        this.description = description;
        this.structure_type = structure_type;
    }
}
