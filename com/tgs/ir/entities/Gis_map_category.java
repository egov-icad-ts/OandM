package com.tgs.ir.entities;

public class Gis_map_category {
@Column(name="category_id")
 
 private Integer  categoryId;

@Column(name="category_name")
 
 private String  categoryName;

@Column(name="category_shortcode")
 
 private String  categoryShortcode;


    public Gis_map_category(int category_id, Object category_name, Object category_shortcode) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.category_shortcode = category_shortcode;
    }
}
