package com.tgs.ir.dto;

import com.tgs.ir.entities.District;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class MandalDto {


    private String mcode;

    private String mname;

    private Boolean active;

    private DistrictDto district;

    public DistrictDto getDistrict() {
        return district;
    }

    public void setDistrict(DistrictDto district) {
        this.district = district;
    }

    public String getMcode() {
        return mcode;
    }

    public void setMcode(String mcode) {
        this.mcode = mcode;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
