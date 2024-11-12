package com.tgs.ir.entities;

public class O_m_fin_year_mst {
@Column(name="id")
 
 private Integer  id;

@Column(name="financial_year")
 
 private String  financialYear;

@Column(name="fin_year")
 
 private Integer  finYear;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;


    public O_m_fin_year_mst(int id, Object financial_year, int fin_year, boolean delete_flag) {
        this.id = id;
        this.financial_year = financial_year;
        this.fin_year = fin_year;
        this.delete_flag = delete_flag;
    }
}
