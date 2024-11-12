package com.tgs.ir.entities;

public class Infra_proforma1_basic_data {
@Column(name="infra_basic_id")
 
 private Integer  infraBasicId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="rr_id")
 
 private Integer  rrId;

@Column(name="notification_of_affected_path")
 
 private String  notificationOfAffectedPath;

@Column(name="notification_of_affected_go_no")
 
 private String  notificationOfAffectedGoNo;

@Column(name="notification_of_affected_go_date")
 
 private timestamp without time zone  notificationOfAffectedGoDate;

@Column(name="admin_sanction_go_no")
 
 private String  adminSanctionGoNo;

@Column(name="admin_sanction_go_date")
 
 private timestamp without time zone  adminSanctionGoDate;

@Column(name="admin_sanction_go_path")
 
 private String  adminSanctionGoPath;

@Column(name="gazette_no")
 
 private String  gazetteNo;

@Column(name="gazette_date")
 
 private timestamp without time zone  gazetteDate;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="created_by_userid")
 
 private Integer  createdByUserid;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;


    public Infra_proforma1_basic_data(int infra_basic_id, int project_id, int district_id, int mandal_id, int village_id, int rr_id, Object notification_of_affected_path, Object notification_of_affected_go_no, Object notification_of_affected_go_date, Object admin_sanction_go_no, Object admin_sanction_go_date, Object admin_sanction_go_path, Object gazette_no, Object gazette_date, Object created_by_username, int created_by_userid, Object created_date, boolean delete_flag, boolean is_latest) {
        this.infra_basic_id = infra_basic_id;
        this.project_id = project_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.rr_id = rr_id;
        this.notification_of_affected_path = notification_of_affected_path;
        this.notification_of_affected_go_no = notification_of_affected_go_no;
        this.notification_of_affected_go_date = notification_of_affected_go_date;
        this.admin_sanction_go_no = admin_sanction_go_no;
        this.admin_sanction_go_date = admin_sanction_go_date;
        this.admin_sanction_go_path = admin_sanction_go_path;
        this.gazette_no = gazette_no;
        this.gazette_date = gazette_date;
        this.created_by_username = created_by_username;
        this.created_by_userid = created_by_userid;
        this.created_date = created_date;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
    }
}
