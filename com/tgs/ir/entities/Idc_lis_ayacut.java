package com.tgs.ir.entities;

public class Idc_lis_ayacut {
@Column(name="lis_ip_id")
 
 private Integer  lisIpId;

@Column(name="lis_id")
 
 private Integer  lisId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="id_ayacut")
 
 private Double  idAyacut;

@Column(name="wet_ayacut")
 
 private Double  wetAyacut;

@Column(name="created_by_userid")
 
 private String  createdByUserid;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="update_flag")
 
 private boolean  updateFlag;

@Column(name="updated_date")
 
 private timestamp without time zone  updatedDate;

@Column(name="post_id")
 
 private String  postId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="updated_by_userid")
 
 private String  updatedByUserid;


    public Idc_lis_ayacut(int lis_ip_id, int lis_id, int district_id, int mandal_id, int village_id, double id_ayacut, double wet_ayacut, Object created_by_userid, Object created_date, boolean delete_flag, boolean update_flag, Object updated_date, Object post_id, int unit_id, int circle_id, int division_id, int sub_division_id, Object deleted_by, Object deleted_time, Object updated_by_userid) {
        this.lis_ip_id = lis_ip_id;
        this.lis_id = lis_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.id_ayacut = id_ayacut;
        this.wet_ayacut = wet_ayacut;
        this.created_by_userid = created_by_userid;
        this.created_date = created_date;
        this.delete_flag = delete_flag;
        this.update_flag = update_flag;
        this.updated_date = updated_date;
        this.post_id = post_id;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.updated_by_userid = updated_by_userid;
    }
}
