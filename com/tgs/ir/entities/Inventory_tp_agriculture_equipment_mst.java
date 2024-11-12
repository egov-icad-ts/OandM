package com.tgs.ir.entities;

public class Inventory_tp_agriculture_equipment_mst {
@Column(name="tp_agri_equip_id")
 
 private Integer  tpAgriEquipId;

@Column(name="tp_agriculture_equipment_description")
 
 private String  tpAgricultureEquipmentDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_tp_agriculture_equipment_mst(int tp_agri_equip_id, Object tp_agriculture_equipment_description, boolean delete_flag) {
        this.tp_agri_equip_id = tp_agri_equip_id;
        this.tp_agriculture_equipment_description = tp_agriculture_equipment_description;
        this.delete_flag = delete_flag;
    }
}
