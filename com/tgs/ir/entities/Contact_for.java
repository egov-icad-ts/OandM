package com.tgs.ir.entities;

public class Contact_for {
@Column(name="contact_for_id")
 
 private Integer  contactForId;

@Column(name="contact_type")
 
 private String  contactType;


    public Contact_for(int contact_for_id, Object contact_type) {
        this.contact_for_id = contact_for_id;
        this.contact_type = contact_type;
    }
}
