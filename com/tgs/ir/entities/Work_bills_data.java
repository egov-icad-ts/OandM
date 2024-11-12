package com.tgs.ir.entities;

public class Work_bills_data {
@Column(name="bill_id")
 
 private Integer  billId;

@Column(name="agree_id")
 
 private Integer  agreeId;

@Column(name="pas_id")
 
 private Integer  pasId;

@Column(name="nature_of_head")
 
 private Integer  natureOfHead;

@Column(name="bill_type")
 
 private Integer  billType;

@Column(name="bill_no")
 
 private Integer  billNo;

@Column(name="bill_pload_date")
 
 private timestamp without time zone  billPloadDate;

@Column(name="token_no")
 
 private Integer  tokenNo;

@Column(name="token_date")
 
 private timestamp without time zone  tokenDate;

@Column(name="gross_bill_amount")
 
 private Double  grossBillAmount;

@Column(name="bill_category")
 
 private Integer  billCategory;

@Column(name="budget_available")
 
 private Double  budgetAvailable;

@Column(name="head_of_account")
 
 private String  headOfAccount;

@Column(name="bill_kept_in_ripe_mode_date")
 
 private timestamp without time zone  billKeptInRipeModeDate;

@Column(name="bill_paid_amount")
 
 private Double  billPaidAmount;

@Column(name="voucher_no")
 
 private Integer  voucherNo;

@Column(name="voucher_date")
 
 private timestamp without time zone  voucherDate;

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

@Column(name="bill_status")
 
 private Integer  billStatus;

@Column(name="deleted_by")
 
 private String  deletedBy;

@Column(name="deleted_time")
 
 private timestamp without time zone  deletedTime;

@Column(name="it")
 
 private Double  it;

@Column(name="vat")
 
 private Double  vat;

@Column(name="cgst")
 
 private Double  cgst;

@Column(name="sgst")
 
 private Double  sgst;

@Column(name="sc")
 
 private Double  sc;

@Column(name="lc")
 
 private Double  lc;

@Column(name="nac")
 
 private Double  nac;

@Column(name="dbft")
 
 private Double  dbft;

@Column(name="smet")
 
 private Double  smet;

@Column(name="misc")
 
 private Double  misc;

@Column(name="otrid")
 
 private Integer  otrid;

@Column(name="otr")
 
 private Double  otr;

@Column(name="circle_id")
 
 private Integer  circleId;

@Column(name="division_id")
 
 private Integer  divisionId;

@Column(name="sub_division_id")
 
 private Integer  subDivisionId;

@Column(name="green_fund")
 
 private Double  greenFund;

@Column(name="embedded_taxes")
 
 private Double  embeddedTaxes;

@Column(name="price_variation")
 
 private Double  priceVariation;

@Column(name="gst_price_variation")
 
 private Double  gstPriceVariation;

@Column(name="total_value_of_work")
 
 private Double  totalValueOfWork;

@Column(name="withheld")
 
 private Double  withheld;

@Column(name="value_of_workdone")
 
 private Double  valueOfWorkdone;

@Column(name="ma_interest")
 
 private Double  maInterest;

@Column(name="mb_pg_no")
 
 private String  mbPgNo;


    public Work_bills_data(int bill_id, int agree_id, int pas_id, int nature_of_head, int bill_type, int bill_no, Object bill_pload_date, int token_no, Object token_date, double gross_bill_amount, int bill_category, double budget_available, Object head_of_account, Object bill_kept_in_ripe_mode_date, double bill_paid_amount, int voucher_no, Object voucher_date, Object remarks, boolean delete_flag, boolean is_latest, Object created_by, Object created_time, int unit_id, long post_id, int bill_status, Object deleted_by, Object deleted_time, double it, double vat, double cgst, double sgst, double sc, double lc, double nac, double dbft, double smet, double misc, int otrid, double otr, int circle_id, int division_id, int sub_division_id, double green_fund, double embedded_taxes, double price_variation, double gst_price_variation, double total_value_of_work, double withheld, double value_of_workdone, double ma_interest, Object mb_pg_no) {
        this.bill_id = bill_id;
        this.agree_id = agree_id;
        this.pas_id = pas_id;
        this.nature_of_head = nature_of_head;
        this.bill_type = bill_type;
        this.bill_no = bill_no;
        this.bill_pload_date = bill_pload_date;
        this.token_no = token_no;
        this.token_date = token_date;
        this.gross_bill_amount = gross_bill_amount;
        this.bill_category = bill_category;
        this.budget_available = budget_available;
        this.head_of_account = head_of_account;
        this.bill_kept_in_ripe_mode_date = bill_kept_in_ripe_mode_date;
        this.bill_paid_amount = bill_paid_amount;
        this.voucher_no = voucher_no;
        this.voucher_date = voucher_date;
        this.remarks = remarks;
        this.delete_flag = delete_flag;
        this.is_latest = is_latest;
        this.created_by = created_by;
        this.created_time = created_time;
        this.unit_id = unit_id;
        this.post_id = post_id;
        this.bill_status = bill_status;
        this.deleted_by = deleted_by;
        this.deleted_time = deleted_time;
        this.it = it;
        this.vat = vat;
        this.cgst = cgst;
        this.sgst = sgst;
        this.sc = sc;
        this.lc = lc;
        this.nac = nac;
        this.dbft = dbft;
        this.smet = smet;
        this.misc = misc;
        this.otrid = otrid;
        this.otr = otr;
        this.circle_id = circle_id;
        this.division_id = division_id;
        this.sub_division_id = sub_division_id;
        this.green_fund = green_fund;
        this.embedded_taxes = embedded_taxes;
        this.price_variation = price_variation;
        this.gst_price_variation = gst_price_variation;
        this.total_value_of_work = total_value_of_work;
        this.withheld = withheld;
        this.value_of_workdone = value_of_workdone;
        this.ma_interest = ma_interest;
        this.mb_pg_no = mb_pg_no;
    }
}
