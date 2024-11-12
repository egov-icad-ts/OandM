package com.tgs.ir.entities;

public class Rti_rejection_status {
@Column(name="reject_section_id")
 
 private Integer  rejectSectionId;

@Column(name="rti_rejection_section")
 
 private String  rtiRejectionSection;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public Rti_rejection_status(int reject_section_id, Object rti_rejection_section, boolean delete_flag) {
        this.reject_section_id = reject_section_id;
        this.rti_rejection_section = rti_rejection_section;
        this.delete_flag = delete_flag;
    }
}
