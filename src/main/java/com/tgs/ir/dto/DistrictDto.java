package com.tgs.ir.dto;

import java.util.List;

public class DistrictDto {


    private String dcode;

    private String dname;

    private List<MandalDto> mandals;

    public DistrictDto() {
    }

    public DistrictDto(String dcode, String dname) {
        this.dcode = dcode;
        this.dname = dname;
    }

    public String getDcode() {
        return dcode;
    }

    public void setDcode(String dcode) {
        this.dcode = dcode;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<MandalDto> getMandals() {
        return mandals;
    }

    public void setMandals(List<MandalDto> mandals) {
        this.mandals = mandals;
    }
}
