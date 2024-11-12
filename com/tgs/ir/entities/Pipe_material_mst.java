package com.tgs.ir.entities;

public class Pipe_material_mst {
@Column(name="pipe_material_id")
 
 private Integer  pipeMaterialId;

@Column(name="pipe_material")
 
 private String  pipeMaterial;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Pipe_material_mst(int pipe_material_id, Object pipe_material, boolean delete_flag) {
        this.pipe_material_id = pipe_material_id;
        this.pipe_material = pipe_material;
        this.delete_flag = delete_flag;
    }
}
