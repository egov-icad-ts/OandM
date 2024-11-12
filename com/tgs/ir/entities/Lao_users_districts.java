package com.tgs.ir.entities;

public class Lao_users_districts {
@Column(name="id")
 
 private Integer  id;

@Column(name="lao_user_id")
 
 private Integer  laoUserId;

@Column(name="lao_description")
 
 private String  laoDescription;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_date")
 
 private date  createdDate;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="parent_id")
 
 private Integer  parentId;


    public Lao_users_districts(int id, int lao_user_id, Object lao_description, int district_id, boolean delete_flag, Object created_date, Object created_by, int parent_id) {
        this.id = id;
        this.lao_user_id = lao_user_id;
        this.lao_description = lao_description;
        this.district_id = district_id;
        this.delete_flag = delete_flag;
        this.created_date = created_date;
        this.created_by = created_by;
        this.parent_id = parent_id;
    }
}
