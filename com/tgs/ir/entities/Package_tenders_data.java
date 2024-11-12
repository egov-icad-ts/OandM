package com.tgs.ir.entities;

public class Package_tenders_data {
@Column(name="pt_id")
 
 private Integer  ptId;

@Column(name="pas_id")
 
 private Integer  pasId;

@Column(name="admin_sanction_type")
 
 private Integer  adminSanctionType;

@Column(name="pts_id")
 
 private Integer  ptsId;

@Column(name="tender_status")
 
 private Integer  tenderStatus;

@Column(name="tender_ecv_amount")
 
 private Double  tenderEcvAmount;

@Column(name="tender_calling_date")
 
 private timestamp without time zone  tenderCallingDate;

@Column(name="tech_bid_open_date")
 
 private timestamp without time zone  techBidOpenDate;

@Column(name="price_bid_open_date")
 
 private timestamp without time zone  priceBidOpenDate;

@Column(name="tender_amount")
 
 private Double  tenderAmount;

@Column(name="tender_percentage")
 
 private String  tenderPercentage;

@Column(name="tender_validity_date")
 
 private timestamp without time zone  tenderValidityDate;

@Column(name="extension_of_validity_date")
 
 private timestamp without time zone  extensionOfValidityDate;

@Column(name="accepted_tender_amount")
 
 private Double  acceptedTenderAmount;

@Column(name="remarks")
 
 private String  remarks;

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

@Column(name="tender_notice_no")
 
 private String  tenderNoticeNo;

@Column(name="tender_cancelling_date")
 
 private timestamp without time zone  tenderCancellingDate;

@Column(name="cancelling_reason")
 
 private String  cancellingReason;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;


    public Package_tenders_data(int pt_id, int pas_id, int admin_sanction_type, int pts_id, int tender_status, double tender_ecv_amount, Object tender_calling_date, Object tech_bid_open_date, Object price_bid_open_date, double tender_amount, Object tender_percentage, Object tender_validity_date, Object extension_of_validity_date, double accepted_tender_amount, Object remarks, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, int unit_id, long post_id, Object deleted_by, Object deleted_time, Object tender_notice_no, Object tender_cancelling_date, Object cancelling_reason, int circle_id, int division_id, int sub_division_id) {
        this.pt_id = pt_id;
        this.pas_id = pas_id;
        this.admin_sanction_type = admin_sanction_type;
        this.pts_id = pts_id;
        this.tender_status = tender_status;
        this.tender_ecv_amount = tender_ecv_amount;
        this.tender_calling_date = tender_calling_date;
        this.tech_bid_open_date = tech_bid_open_date;
        this.price_bid_open_date = price_bid_open_date;
        this.tender_amount = tender_amount;
        this.tender_percentage = tender_percentage;
        this.tender_validity_date = tender_validity_date;
        this.extension_of_validity_date = extension_of_validity_date;
        this.accepted_tender_amount = accepted_tender_amount;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.unit_id = unit_id;
        this.post_id = post_id;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.tender_notice_no = tender_notice_no;
        this.tender_cancelling_date = tender_cancelling_date;
        this.cancelling_reason = cancelling_reason;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
    }
}
