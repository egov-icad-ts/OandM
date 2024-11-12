package com.tgs.ir.entities;

public class Non_contract_items {
@Column(name="non_contract_items_id")
 
 private Integer  nonContractItemsId;

@Column(name="non_contract_items")
 
 private String  nonContractItems;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="default_percentage")
 
 private Double  defaultPercentage;

@Column(name="percentage_flag")
 
 private boolean  percentageFlag;


    public Non_contract_items(int non_contract_items_id, Object non_contract_items, boolean delete_flag, double default_percentage, boolean percentage_flag) {
        this.non_contract_items_id = non_contract_items_id;
        this.non_contract_items = non_contract_items;
        this.delete_flag = delete_flag;
        this.default_percentage = default_percentage;
        this.percentage_flag = percentage_flag;
    }
}
