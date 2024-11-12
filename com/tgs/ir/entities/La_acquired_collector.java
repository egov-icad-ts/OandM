package com.tgs.ir.entities;

public class La_acquired_collector {
@Column(name="la_acquired_coll_id")
 
 private Integer  laAcquiredCollId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="district_id")
 
 private Integer  districtId;

@Column(name="mandal_id")
 
 private Integer  mandalId;

@Column(name="village_id")
 
 private Integer  villageId;

@Column(name="survey_number")
 
 private String  surveyNumber;

@Column(name="file_no")
 
 private String  fileNo;

@Column(name="sdc_file_no")
 
 private String  sdcFileNo;

@Column(name="proceeding_no")
 
 private String  proceedingNo;

@Column(name="award_no")
 
 private String  awardNo;

@Column(name="proceeding_date")
 
 private timestamp without time zone  proceedingDate;

@Column(name="award_date")
 
 private timestamp without time zone  awardDate;

@Column(name="la_act")
 
 private String  laAct;

@Column(name="proceeding_doc_path")
 
 private String  proceedingDocPath;

@Column(name="award_doc_path")
 
 private String  awardDocPath;

@Column(name="extent_acquired_acres")
 
 private Integer  extentAcquiredAcres;

@Column(name="extent_acquired_guntas")
 
 private Double  extentAcquiredGuntas;

@Column(name="compensation_paid")
 
 private Double  compensationPaid;

@Column(name="compensation_paid_date")
 
 private timestamp without time zone  compensationPaidDate;

@Column(name="acquiantance_path")
 
 private String  acquiantancePath;

@Column(name="tippon_map_path")
 
 private String  tipponMapPath;

@Column(name="podi_map_path")
 
 private String  podiMapPath;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by_username")
 
 private String  createdByUsername;

@Column(name="created_by_userid")
 
 private Integer  createdByUserid;

@Column(name="created_date")
 
 private timestamp without time zone  createdDate;

@Column(name="awarde_name")
 
 private String  awardeName;

@Column(name="aquired_area")
 
 private Double  aquiredArea;

@Column(name="house_number")
 
 private String  houseNumber;

@Column(name="la_act_id")
 
 private Integer  laActId;

@Column(name="sdc_user_id")
 
 private Integer  sdcUserId;

@Column(name="payment_paid_status")
 
 private String  paymentPaidStatus;

@Column(name="updated_user_id")
 
 private Integer  updatedUserId;

@Column(name="updated_time")
 
 private timestamp without time zone  updatedTime;

@Column(name="go_payment_status")
 
 private String  goPaymentStatus;


    public La_acquired_collector(int la_acquired_coll_id, int project_id, int district_id, int mandal_id, int village_id, Object survey_number, Object file_no, Object sdc_file_no, Object proceeding_no, Object award_no, Object proceeding_date, Object award_date, Object la_act, Object proceeding_doc_path, Object award_doc_path, int extent_acquired_acres, double extent_acquired_guntas, double compensation_paid, Object compensation_paid_date, Object acquiantance_path, Object tippon_map_path, Object podi_map_path, boolean delete_flag, boolean is_latest, Object created_by_username, int created_by_userid, Object created_date, Object awarde_name, double aquired_area, Object house_number, int la_act_id, int sdc_user_id, Object payment_paid_status, int updated_user_id, Object updated_time, Object go_payment_status) {
        this.la_acquired_coll_id = la_acquired_coll_id;
        this.project_id = project_id;
        this.district_id = district_id;
        this.mandal_id = mandal_id;
        this.village_id = village_id;
        this.survey_number = survey_number;
        this.file_no = file_no;
        this.sdc_file_no = sdc_file_no;
        this.proceeding_no = proceeding_no;
        this.award_no = award_no;
        this.proceeding_date = proceeding_date;
        this.award_date = award_date;
        this.la_act = la_act;
        this.proceeding_doc_path = proceeding_doc_path;
        this.award_doc_path = award_doc_path;
        this.extent_acquired_acres = extent_acquired_acres;
        this.extent_acquired_guntas = extent_acquired_guntas;
        this.compensation_paid = compensation_paid;
        this.compensation_paid_date = compensation_paid_date;
        this.acquiantance_path = acquiantance_path;
        this.tippon_map_path = tippon_map_path;
        this.podi_map_path = podi_map_path;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by_username = created_by_username;
        this.created_by_userid = created_by_userid;
        this.created_date = created_date;
        this.awarde_name = awarde_name;
        this.aquired_area = aquired_area;
        this.house_number = house_number;
        this.la_act_id = la_act_id;
        this.sdc_user_id = sdc_user_id;
        this.payment_paid_status = payment_paid_status;
        this.updated_user_id = updated_user_id;
        this.updated_time = updated_time;
        this.go_payment_status = go_payment_status;
    }
}
