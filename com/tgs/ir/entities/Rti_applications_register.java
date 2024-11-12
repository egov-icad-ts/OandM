package com.tgs.ir.entities;

public class Rti_applications_register {
@Column(name="application_id")
 
 private Integer  applicationId;

@Column(name="application_date")
 
 private timestamp without time zone  applicationDate;

@Column(name="applicant_name")
 
 private String  applicantName;

@Column(name="applicant_addrs")
 
 private String  applicantAddrs;

@Column(name="pio_receipt_date")
 
 private timestamp without time zone  pioReceiptDate;

@Column(name="applicant_category")
 
 private String  applicantCategory;

@Column(name="desc_info_req")
 
 private String  descInfoReq;

@Column(name="third_party")
 
 private String  thirdParty;

@Column(name="application_fee")
 
 private Integer  applicationFee;

@Column(name="charges_collected")
 
 private double precision  chargesCollected;

@Column(name="tot_amt")
 
 private double precision  totAmt;

@Column(name="is_transferred")
 
 private String  isTransferred;

@Column(name="trans_date")
 
 private timestamp without time zone  transDate;

@Column(name="trans_name")
 
 private String  transName;

@Column(name="deemed_pio")
 
 private String  deemedPio;

@Column(name="info_part_full")
 
 private String  infoPartFull;

@Column(name="rejection_date")
 
 private timestamp without time zone  rejectionDate;

@Column(name="rejected_section_id")
 
 private Integer  rejectedSectionId;

@Column(name="deemed_refusal")
 
 private String  deemedRefusal;

@Column(name="appeal_made")
 
 private String  appealMade;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_by")
 
 private String  createdBy;

@Column(name="create_date")
 
 private timestamp without time zone  createDate;

@Column(name="unit_id")
 
 private Integer  unitId;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="subdivision_id")
 
 private Integer  subdivisionId;

@Column(name="designation_id")
 
 private Integer  designationId;

@Column(name="update_by")
 
 private String  updateBy;

@Column(name="update_date")
 
 private timestamp without time zone  updateDate;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_date")
 
 private timestamp without time zone  deletedDate;

@Column(name="info_furnished_date")
 
 private timestamp without time zone  infoFurnishedDate;

@Column(name="info_part_date")
 
 private timestamp without time zone  infoPartDate;

@Column(name="info_full_date")
 
 private timestamp without time zone  infoFullDate;

@Column(name="created_postid")
 
 private String  createdPostid;

@Column(name="application_num")
 
 private String  applicationNum;

@Column(name="trans_mode")
 
 private String  transMode;

@Column(name="trans_amt")
 
 private Integer  transAmt;

@Column(name="refused_date")
 
 private timestamp without time zone  refusedDate;


    public Rti_applications_register(int application_id, Object application_date, Object applicant_name, Object applicant_addrs, Object pio_receipt_date, Object applicant_category, Object desc_info_req, Object third_party, int application_fee, Object charges_collected, Object tot_amt, Object is_transferred, Object trans_date, Object trans_name, Object deemed_pio, Object info_part_full, Object rejection_date, int rejected_section_id, Object deemed_refusal, Object appeal_made, Object remarks, boolean is_latest, boolean delete_flag, Object created_by, Object create_date, int unit_id, int circle_id, int division_id, int subdivision_id, int designation_id, Object update_by, Object update_date, Object deleted_by, Object deleted_date, Object info_furnished_date, Object info_part_date, Object info_full_date, Object created_postid, Object application_num, Object trans_mode, int trans_amt, Object refused_date) {
        this.application_id = application_id;
        this.application_date = application_date;
        this.applicant_name = applicant_name;
        this.applicant_addrs = applicant_addrs;
        this.pio_receipt_date = pio_receipt_date;
        this.applicant_category = applicant_category;
        this.desc_info_req = desc_info_req;
        this.third_party = third_party;
        this.application_fee = application_fee;
        this.charges_collected = charges_collected;
        this.tot_amt = tot_amt;
        this.is_transferred = is_transferred;
        this.trans_date = trans_date;
        this.trans_name = trans_name;
        this.deemed_pio = deemed_pio;
        this.info_part_full = info_part_full;
        this.rejection_date = rejection_date;
        this.rejected_section_id = rejected_section_id;
        this.deemed_refusal = deemed_refusal;
        this.appeal_made = appeal_made;
        this.remarks = remarks;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.created_by = created_by;
        this.create_date = create_date;
        this.unit_id = unit_id;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.subdivision_id = subdivision_id;
        this.designation_id = designation_id;
        this.update_by = update_by;
        this.update_date = update_date;
        this.deleted_by = deleted_by;
        this.deleted_date = deleted_date;
        this.info_furnished_date = info_furnished_date;
        this.info_part_date = info_part_date;
        this.info_full_date = info_full_date;
        this.created_postid = created_postid;
        this.application_num = application_num;
        this.trans_mode = trans_mode;
        this.trans_amt = trans_amt;
        this.refused_date = refused_date;
    }
}
