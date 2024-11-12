package com.tgs.ir.entities;

public class Gadget_data {
@Column(name="ga_id")
 
 private Integer  gaId;

@Column(name="category_id")
 
 private Integer  categoryId;

@Column(name="sub_category")
 
 private String  subCategory;

@Column(name="make_id")
 
 private Integer  makeId;

@Column(name="model")
 
 private String  model;

@Column(name="year")
 
 private Integer  year;

@Column(name="processor")
 
 private String  processor;

@Column(name="clock_speed")
 
 private String  clockSpeed;

@Column(name="ram")
 
 private String  ram;

@Column(name="xerox_type")
 
 private String  xeroxType;

@Column(name="condition")
 
 private String  condition;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="created_post_id")
 
 private String  createdPostId;

@Column(name="created_username")
 
 private String  createdUsername;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="make")
 
 private String  make;


    public Gadget_data(int ga_id, int category_id, Object sub_category, int make_id, Object model, int year, Object processor, Object clock_speed, Object ram, Object xerox_type, Object condition, Object remarks, int unit_id, int circle_id, int division_id, Object created_post_id, Object created_username, boolean delete_flag, Object deleted_by, Object deleted_time, Object created_time, Object make) {
        this.ga_id = ga_id;
        this.category_id = category_id;
        this.sub_category = sub_category;
        this.make_id = make_id;
        this.model = model;
        this.year = year;
        this.processor = processor;
        this.clock_speed = clock_speed;
        this.ram = ram;
        this.xerox_type = xerox_type;
        this.condition = condition;
        this.remarks = remarks;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.created_post_id = created_post_id;
        this.created_username = created_username;
        this.delete_flag = delete_flag;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.created_time = created_time;
        this.make = make;
    }
}
