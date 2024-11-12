package com.tgs.ir.entities;

public class Inventory_tp_article_mst {
@Column(name="tp_art_id")
 
 private Integer  tpArtId;

@Column(name="article_description")
 
 private String  articleDescription;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="sub_art_table_name")
 
 private String  subArtTableName;


    public Inventory_tp_article_mst(int tp_art_id, Object article_description, boolean delete_flag, Object sub_art_table_name) {
        this.tp_art_id = tp_art_id;
        this.article_description = article_description;
        this.delete_flag = delete_flag;
        this.sub_art_table_name = sub_art_table_name;
    }
}
