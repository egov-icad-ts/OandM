package com.tgs.ir.entities;

public class Agreements_data {
@Column(name="ag_id")
 
 private Integer  agId;

@Column(name="tender_id")
 
 private Integer  tenderId;

@Column(name="work_id")
 
 private Integer  workId;

@Column(name="agreement_amount")
 
 private Double  agreementAmount;

@Column(name="agreement_date")
 
 private timestamp without time zone  agreementDate;

@Column(name="agreement_number")
 
 private String  agreementNumber;

@Column(name="agency_name")
 
 private String  agencyName;

@Column(name="agreed_date_of_completion")
 
 private timestamp without time zone  agreedDateOfCompletion;

@Column(name="work_completion_date")
 
 private timestamp without time zone  workCompletionDate;

@Column(name="defect_liability_date")
 
 private timestamp without time zone  defectLiabilityDate;

@Column(name="onm_completion_date")
 
 private timestamp without time zone  onmCompletionDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="created_time")
 
 private timestamp without time zone  createdTime;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="post_id")
 
 private bigint  postId;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="agree_type")
 
 private Integer  agreeType;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="go_file_path")
 
 private String  goFilePath;

@Column(name="email")
 
 private String  email;

@Column(name="contact_no")
 
 private bigint  contactNo;

@Column(name="address")
 
 private String  address;

@Column(name="is_nomination")
 
 private String  isNomination;


    public Agreements_data(int ag_id, int tender_id, int work_id, double agreement_amount, Object agreement_date, Object agreement_number, Object agency_name, Object agreed_date_of_completion, Object work_completion_date, Object defect_liability_date, Object onm_completion_date, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, int unit_id, long post_id, Object deleted_by, Object deleted_time, int agree_type, int circle_id, int division_id, int sub_division_id, Object go_file_path, Object email, long contact_no, Object address, Object is_nomination) {
        this.ag_id = ag_id;
        this.tender_id = tender_id;
        this.work_id = work_id;
        this.agreement_amount = agreement_amount;
        this.agreement_date = agreement_date;
        this.agreement_number = agreement_number;
        this.agency_name = agency_name;
        this.agreed_date_of_completion = agreed_date_of_completion;
        this.work_completion_date = work_completion_date;
        this.defect_liability_date = defect_liability_date;
        this.onm_completion_date = onm_completion_date;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.unit_id = unit_id;
        this.post_id = post_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.agree_type = agree_type;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.go_file_path = go_file_path;
        this.email = email;
        this.contact_no = contact_no;
        this.address = address;
        this.is_nomination = is_nomination;
    }
}
