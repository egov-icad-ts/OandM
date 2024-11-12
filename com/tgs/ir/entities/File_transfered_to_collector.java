package com.tgs.ir.entities;

public class File_transfered_to_collector {
@Column(name="file_id")
 
 private Integer  fileId;

@Column(name="file_number")
 
 private String  fileNumber;

@Column(name="notified_extent")
 
 private Double  notifiedExtent;

@Column(name="acquired_extent")
 
 private Double  acquiredExtent;

@Column(name="balance")
 
 private Double  balance;

@Column(name="lao_id")
 
 private Integer  laoId;

@Column(name="updated_by")
 
 private Integer  updatedBy;

@Column(name="updated_date")
 
 private timestamp without time zone  updatedDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="notified_extent_sqyd")
 
 private Double  notifiedExtentSqyd;

@Column(name="acquired_extent_sqyd")
 
 private Double  acquiredExtentSqyd;

@Column(name="balance_sqyd")
 
 private Double  balanceSqyd;


    public File_transfered_to_collector(int file_id, Object file_number, double notified_extent, double acquired_extent, double balance, int lao_id, int updated_by, Object updated_date, boolean delete_flag, double notified_extent_sqyd, double acquired_extent_sqyd, double balance_sqyd) {
        this.file_id = file_id;
        this.file_number = file_number;
        this.notified_extent = notified_extent;
        this.acquired_extent = acquired_extent;
        this.balance = balance;
        this.lao_id = lao_id;
        this.updated_by = updated_by;
        this.updated_date = updated_date;
        this.delete_flag = delete_flag;
        this.notified_extent_sqyd = notified_extent_sqyd;
        this.acquired_extent_sqyd = acquired_extent_sqyd;
        this.balance_sqyd = balance_sqyd;
    }
}
