package com.tgs.ir.entities;

public class Bill_beneficiary_data {
@Column(name="bill_beneficiary_id")
 
 private Integer  billBeneficiaryId;

@Column(name="fin_yr")
 
 private String  finYr;

@Column(name="ddo_code")
 
 private String  ddoCode;

@Column(name="pao_code")
 
 private String  paoCode;

@Column(name="dcode")
 
 private String  dcode;

@Column(name="mcode")
 
 private String  mcode;

@Column(name="vcode")
 
 private String  vcode;

@Column(name="bank_code")
 
 private String  bankCode;

@Column(name="state_code")
 
 private String  stateCode;

@Column(name="bank_ifsc")
 
 private String  bankIfsc;

@Column(name="branch")
 
 private String  branch;

@Column(name="bank_account_no")
 
 private String  bankAccountNo;

@Column(name="beneficiary_name")
 
 private String  beneficiaryName;

@Column(name="age")
 
 private String  age;

@Column(name="relation_code")
 
 private String  relationCode;

@Column(name="gaurdian_name")
 
 private String  gaurdianName;

@Column(name="beneficiary_id")
 
 private String  beneficiaryId;

@Column(name="total_amount")
 
 private String  totalAmount;

@Column(name="income_tax")
 
 private String  incomeTax;

@Column(name="net_amount")
 
 private String  netAmount;

@Column(name="refer_no")
 
 private String  referNo;

@Column(name="division_bill_number")
 
 private String  divisionBillNumber;

@Column(name="gross_amount")
 
 private String  grossAmount;

@Column(name="proc_number")
 
 private String  procNumber;

@Column(name="proc_date")
 
 private String  procDate;

@Column(name="proc_amount")
 
 private String  procAmount;

@Column(name="head_of_account")
 
 private String  headOfAccount;

@Column(name="transaction_id")
 
 private String  transactionId;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="ref_flag")
 
 private boolean  refFlag;

@Column(name="voted_charged")
 
 private String  votedCharged;

@Column(name="bill_description")
 
 private String  billDescription;

@Column(name="bill_proceeding")
 
 private String  billProceeding;

@Column(name="bill_check")
 
 private String  billCheck;

@Column(name="loc")
 
 private String  loc;

@Column(name="stamped_acquitance")
 
 private String  stampedAcquitance;


    public Bill_beneficiary_data(int bill_beneficiary_id, Object fin_yr, Object ddo_code, Object pao_code, Object dcode, Object mcode, Object vcode, Object bank_code, Object state_code, Object bank_ifsc, Object branch, Object bank_account_no, Object beneficiary_name, Object age, Object relation_code, Object gaurdian_name, Object beneficiary_id, Object total_amount, Object income_tax, Object net_amount, Object refer_no, Object division_bill_number, Object gross_amount, Object proc_number, Object proc_date, Object proc_amount, Object head_of_account, Object transaction_id, boolean delete_flag, boolean ref_flag, Object voted_charged, Object bill_description, Object bill_proceeding, Object bill_check, Object loc, Object stamped_acquitance) {
        this.bill_beneficiary_id = bill_beneficiary_id;
        this.fin_yr = fin_yr;
        this.ddo_code = ddo_code;
        this.pao_code = pao_code;
        this.dcode = dcode;
        this.mcode = mcode;
        this.vcode = vcode;
        this.bank_code = bank_code;
        this.state_code = state_code;
        this.bank_ifsc = bank_ifsc;
        this.branch = branch;
        this.bank_account_no = bank_account_no;
        this.beneficiary_name = beneficiary_name;
        this.age = age;
        this.relation_code = relation_code;
        this.gaurdian_name = gaurdian_name;
        this.beneficiary_id = beneficiary_id;
        this.total_amount = total_amount;
        this.income_tax = income_tax;
        this.net_amount = net_amount;
        this.refer_no = refer_no;
        this.division_bill_number = division_bill_number;
        this.gross_amount = gross_amount;
        this.proc_number = proc_number;
        this.proc_date = proc_date;
        this.proc_amount = proc_amount;
        this.head_of_account = head_of_account;
        this.transaction_id = transaction_id;
        this.delete_flag = delete_flag;
        this.ref_flag = ref_flag;
        this.voted_charged = voted_charged;
        this.bill_description = bill_description;
        this.bill_proceeding = bill_proceeding;
        this.bill_check = bill_check;
        this.loc = loc;
        this.stamped_acquitance = stamped_acquitance;
    }
}
