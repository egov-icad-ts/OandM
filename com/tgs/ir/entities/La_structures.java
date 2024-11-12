package com.tgs.ir.entities;

public class La_structures {
@Column(name="id")
 
 private Integer  id;

@Column(name="structure_name")
 
 private String  structureName;


    public La_structures(int id, Object structure_name) {
        this.id = id;
        this.structure_name = structure_name;
    }
}
