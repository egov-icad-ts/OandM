package com.tgs.ir.entities;

public class Project_ayacut {
@Column(name="p_ayacutid")
 
 private Integer  pAyacutid;

@Column(name="projectid")
 
 private Integer  projectid;

@Column(name="pack_id")
 
 private Integer  packId;

@Column(name="ayacut_created")
 
 private Double  ayacutCreated;

@Column(name="stabilized_ayacut")
 
 private Double  stabilizedAyacut;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="userid")
 
 private Integer  userid;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="const_id")
 
 private Integer  constId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="user_name")
 
 private String  userName;

@Column(name="create_time")
 
 private timestamp without time zone  createTime;

@Column(name="edit_time")
 
 private timestamp without time zone  editTime;

@Column(name="edit_by")
 
 private Integer  editBy;

@Column(name="edit_user")
 
 private String  editUser;

@Column(name="edit_flag")
 
 private boolean  editFlag;

@Column(name="edit_number")
 
 private Integer  editNumber;

@Column(name="const_dist_map_id")
 
 private Integer  constDistMapId;

@Column(name="irrigated_ayacut")
 
 private Double  irrigatedAyacut;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="subdivision_id")
 
 private Integer  subdivisionId;

@Column(name="contemplated_ayacut")
 
 private Double  contemplatedAyacut;

@Column(name="delete_user_name")
 
 private String  deleteUserName;

@Column(name="delete_time")
 
 private timestamp without time zone  deleteTime;

@Column(name="old_p_ayacut_id")
 
 private Integer  oldPAyacutId;

@Column(name="jur_status")
 
 private boolean  jurStatus;


    public Project_ayacut(int p_ayacutid, int projectid, int pack_id, double ayacut_created, double stabilized_ayacut, boolean delete_flag, boolean is_latest, int userid, Object remarks, int district_id, int const_id, int mandal_id, int village_id, int unit_id, Object user_name, Object create_time, Object edit_time, int edit_by, Object edit_user, boolean edit_flag, int edit_number, int const_dist_map_id, double irrigated_ayacut, int circle_id, int division_id, int subdivision_id, double contemplated_ayacut, Object delete_user_name, Object delete_time, int old_p_ayacut_id, boolean jur_status) {
        this.p_ayacutid = p_ayacutid;
        this.projectid = projectid;
        this.pack_id = pack_id;
        this.ayacut_created = ayacut_created;
        this.stabilized_ayacut = stabilized_ayacut;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.userid = userid;
        this.remarks = remarks;
        this.district_id = district_id;
        this.const_id = const_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.unit_id = unit_id;
        this.user_name = user_name;
        this.create_time = create_time;
        this.edit_time = edit_time;
        this.edit_by = edit_by;
        this.edit_user = edit_user;
        this.edit_flag = edit_flag;
        this.edit_number = edit_number;
        this.const_dist_map_id = const_dist_map_id;
        this.irrigated_ayacut = irrigated_ayacut;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.subdivision_id = subdivision_id;
        this.contemplated_ayacut = contemplated_ayacut;
        this.delete_user_name = delete_user_name;
        this.delete_time = delete_time;
        this.old_p_ayacut_id = old_p_ayacut_id;
        this.jur_status = jur_status;
    }
}
