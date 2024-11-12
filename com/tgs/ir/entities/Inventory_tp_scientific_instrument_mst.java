package com.tgs.ir.entities;

public class Inventory_tp_scientific_instrument_mst {
@Column(name="tp_instrument_id")
 
 private Integer  tpInstrumentId;

@Column(name="tp_scientific_instrument_description")
 
 private String  tpScientificInstrumentDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Inventory_tp_scientific_instrument_mst(int tp_instrument_id, Object tp_scientific_instrument_description, boolean delete_flag) {
        this.tp_instrument_id = tp_instrument_id;
        this.tp_scientific_instrument_description = tp_scientific_instrument_description;
        this.delete_flag = delete_flag;
    }
}
