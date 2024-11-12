package com.tgs.ir.entities;

public class Bank_mst {
@Column(name="bank_id")
 
 private Integer  bankId;

@Column(name="bank_code")
 
 private String  bankCode;

@Column(name="bank_name")
 
 private String  bankName;


    public Bank_mst(int bank_id, Object bank_code, Object bank_name) {
        this.bank_id = bank_id;
        this.bank_code = bank_code;
        this.bank_name = bank_name;
    }
}
