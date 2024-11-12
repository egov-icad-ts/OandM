package com.tgs.ir.entities;

public class Rr_boq_items_measurements {
@Column(name="rr_work_mb_id")
 
 private Integer  rrWorkMbId;

@Column(name="rr_boq_item_id")
 
 private Integer  rrBoqItemId;

@Column(name="mb_book_number")
 
 private String  mbBookNumber;

@Column(name="page_number_from")
 
 private Integer  pageNumberFrom;

@Column(name="page_number_to")
 
 private Integer  pageNumberTo;

@Column(name="value_measurement")
 
 private Double  valueMeasurement;

@Column(name="mb_date")
 
 private timestamp without time zone  mbDate;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="submited_by")
 
 private String  submitedBy;

@Column(name="submited_date")
 
 private timestamp without time zone  submitedDate;

@Column(name="is_latest")
 
 private boolean  isLatest;

@Column(name="rr_boq_total_id")
 
 private Integer  rrBoqTotalId;


    public Rr_boq_items_measurements(int rr_work_mb_id, int rr_boq_item_id, Object mb_book_number, int page_number_from, int page_number_to, double value_measurement, Object mb_date, boolean delete_flag, Object submited_by, Object submited_date, boolean is_latest, int rr_boq_total_id) {
        this.rr_work_mb_id = rr_work_mb_id;
        this.rr_boq_item_id = rr_boq_item_id;
        this.mb_book_number = mb_book_number;
        this.page_number_from = page_number_from;
        this.page_number_to = page_number_to;
        this.value_measurement = value_measurement;
        this.mb_date = mb_date;
        this.delete_flag = delete_flag;
        this.submited_by = submited_by;
        this.submited_date = submited_date;
        this.is_latest = is_latest;
        this.rr_boq_total_id = rr_boq_total_id;
    }
}
