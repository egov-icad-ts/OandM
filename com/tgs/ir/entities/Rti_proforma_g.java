package com.tgs.ir.entities;

public class Rti_proforma_g {
@Column(name="pro_g_id")
 
 private Integer  proGId;

@Column(name="appeal_no")
 
 private String  appealNo;

@Column(name="appeal_date")
 
 private timestamp without time zone  appealDate;

@Column(name="name_of_appellant")
 
 private String  nameOfAppellant;

@Column(name="appellant_address")
 
 private String  appellantAddress;

@Column(name="appeal_receipt_date")
 
 private timestamp without time zone  appealReceiptDate;

@Column(name="pio_name")
 
 private String  pioName;

@Column(name="pio_designation")
 
 private String  pioDesignation;

@Column(name="application_no")
 
 private String  applicationNo;

@Column(name="application_date")
 
 private timestamp without time zone  applicationDate;

@Column(name="name_of_appellate")
 
 private String  nameOfAppellate;

@Column(name="appellate_address")
 
 private String  appellateAddress;

@Column(name="appellate_1st_desicion_date")
 
 private timestamp without time zone  appellate1stDesicionDate;

@Column(name="appellate_1st_desicion_allow_rejec")
 
 private Integer  appellate1stDesicionAllowRejec;

@Column(name="appellate_1st_desicion_rej_section")
 
 private Integer  appellate1stDesicionRejSection;

@Column(name="charges_collect_forfurnish")
 
 private Integer  chargesCollectForfurnish;

@Column(name="second_appeal_made_19_3")
 
 private String  secondAppealMade193;

@Column(name="second_appeal_notice_num")
 
 private String  secondAppealNoticeNum;

@Column(name="second_appeal_notice_date")
 
 private timestamp without time zone  secondAppealNoticeDate;

@Column(name="second_appeal_hearing_date")
 
 private timestamp without time zone  secondAppealHearingDate;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="post_id")
 
 private bigint  postId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="edited_by")
 
 private String  editedBy;

@Column(name="edited_time")
 
 private timestamp without time zone  editedTime;

@Column(name="application_fee")
 
 private Integer  applicationFee;


    public Rti_proforma_g(int pro_g_id, Object appeal_no, Object appeal_date, Object name_of_appellant, Object appellant_address, Object appeal_receipt_date, Object pio_name, Object pio_designation, Object application_no, Object application_date, Object name_of_appellate, Object appellate_address, Object appellate_1st_desicion_date, int appellate_1st_desicion_allow_rejec, int appellate_1st_desicion_rej_section, int charges_collect_forfurnish, Object second_appeal_made_19_3, Object second_appeal_notice_num, Object second_appeal_notice_date, Object second_appeal_hearing_date, Object remarks, int unit_id, int circle_id, int division_id, int sub_division_id, long post_id, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, Object deleted_by, Object deleted_time, Object edited_by, Object edited_time, int application_fee) {
        this.pro_g_id = pro_g_id;
        this.appeal_no = appeal_no;
        this.appeal_date = appeal_date;
        this.name_of_appellant = name_of_appellant;
        this.appellant_address = appellant_address;
        this.appeal_receipt_date = appeal_receipt_date;
        this.pio_name = pio_name;
        this.pio_designation = pio_designation;
        this.application_no = application_no;
        this.application_date = application_date;
        this.name_of_appellate = name_of_appellate;
        this.appellate_address = appellate_address;
        this.appellate_1st_desicion_date = appellate_1st_desicion_date;
        this.appellate_1st_desicion_allow_rejec = appellate_1st_desicion_allow_rejec;
        this.appellate_1st_desicion_rej_section = appellate_1st_desicion_rej_section;
        this.charges_collect_forfurnish = charges_collect_forfurnish;
        this.second_appeal_made_19_3 = second_appeal_made_19_3;
        this.second_appeal_notice_num = second_appeal_notice_num;
        this.second_appeal_notice_date = second_appeal_notice_date;
        this.second_appeal_hearing_date = second_appeal_hearing_date;
        this.remarks = remarks;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.post_id = post_id;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.edited_by = edited_by;
        this.edited_time = edited_time;
        this.application_fee = application_fee;
    }
}
