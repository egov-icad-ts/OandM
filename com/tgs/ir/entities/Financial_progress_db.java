package com.tgs.ir.entities;

public class Financial_progress_db {
@Column(name="financial_progress_id")
 
 private Integer  financialProgressId;

@Column(name="project_id")
 
 private Integer  projectId;

@Column(name="package_id")
 
 private Integer  packageId;

@Column(name="agreement_id")
 
 private Integer  agreementId;

@Column(name="agency_id")
 
 private Integer  agencyId;

@Column(name="bill_year")
 
 private Integer  billYear;

@Column(name="bill_month")
 
 private Integer  billMonth;

@Column(name="bill_category_type")
 
 private Integer  billCategoryType;

@Column(name="bill_number")
 
 private Integer  billNumber;

@Column(name="bill_type")
 
 private String  billType;

@Column(name="pao_id")
 
 private Integer  paoId;

@Column(name="token_number")
 
 private String  tokenNumber;

@Column(name="token_date")
 
 private date  tokenDate;

@Column(name="cummulative_work_done")
 
 private Double  cummulativeWorkDone;

@Column(name="present_work_done")
 
 private Double  presentWorkDone;

@Column(name="gross_amount")
 
 private Double  grossAmount;

@Column(name="recoveries")
 
 private Double  recoveries;

@Column(name="net_amount")
 
 private Double  netAmount;

@Column(name="bill_status")
 
 private Integer  billStatus;

@Column(name="is_priority")
 
 private boolean  isPriority;

@Column(name="remarks")
 
 private String  remarks;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="is_rejected")
 
 private boolean  isRejected;

@Column(name="updated_by")
 
 private String  updatedBy;

@Column(name="updated_on")
 
 private timestamp without time zone  updatedOn;

@Column(name="is_edited")
 
 private boolean  isEdited;

@Column(name="total_work_done")
 
 private Double  totalWorkDone;

@Column(name="cum_gross_amount")
 
 private Double  cumGrossAmount;

@Column(name="la_extent")
 
 private Double  laExtent;


    public Financial_progress_db(int financial_progress_id, int project_id, int package_id, int agreement_id, int agency_id, int bill_year, int bill_month, int bill_category_type, int bill_number, Object bill_type, int pao_id, Object token_number, Object token_date, double cummulative_work_done, double present_work_done, double gross_amount, double recoveries, double net_amount, int bill_status, boolean is_priority, Object remarks, boolean is_latest, boolean delete_flag, boolean is_rejected, Object updated_by, Object updated_on, boolean is_edited, double total_work_done, double cum_gross_amount, double la_extent) {
        this.financial_progress_id = financial_progress_id;
        this.project_id = project_id;
        this.package_id = package_id;
        this.agreement_id = agreement_id;
        this.agency_id = agency_id;
        this.bill_year = bill_year;
        this.bill_month = bill_month;
        this.bill_category_type = bill_category_type;
        this.bill_number = bill_number;
        this.bill_type = bill_type;
        this.pao_id = pao_id;
        this.token_number = token_number;
        this.token_date = token_date;
        this.cummulative_work_done = cummulative_work_done;
        this.present_work_done = present_work_done;
        this.gross_amount = gross_amount;
        this.recoveries = recoveries;
        this.net_amount = net_amount;
        this.bill_status = bill_status;
        this.is_priority = is_priority;
        this.remarks = remarks;
        this.is_latest = is_latest;
        this.delete_flag = delete_flag;
        this.is_rejected = is_rejected;
        this.updated_by = updated_by;
        this.updated_on = updated_on;
        this.is_edited = is_edited;
        this.total_work_done = total_work_done;
        this.cum_gross_amount = cum_gross_amount;
        this.la_extent = la_extent;
    }
}
