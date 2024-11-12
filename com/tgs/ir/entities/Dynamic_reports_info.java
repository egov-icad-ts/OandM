package com.tgs.ir.entities;

public class Dynamic_reports_info {
@Column(name="report_id")
 
 private Integer  reportId;

@Column(name="report_name")
 
 private String  reportName;

@Column(name="report_url")
 
 private String  reportUrl;

@Column(name="report_query")
 
 private String  reportQuery;

@Column(name="delete_flag")
 
 private boolean  deleteFlag;

@Column(name="created_on")
 
 private timestamp without time zone  createdOn;

@Column(name="parameters_required")
 
 private boolean  parametersRequired;

@Column(name="parameters")
 
 private String  parameters;

@Column(name="is_total_required_for_column")
 
 private String  isTotalRequiredForColumn;

@Column(name="added_by")
 
 private String  addedBy;


    public Dynamic_reports_info(int report_id, Object report_name, Object report_url, Object report_query, boolean delete_flag, Object created_on, boolean parameters_required, Object parameters, Object is_total_required_for_column, Object added_by) {
        this.report_id = report_id;
        this.report_name = report_name;
        this.report_url = report_url;
        this.report_query = report_query;
        this.delete_flag = delete_flag;
        this.created_on = created_on;
        this.parameters_required = parameters_required;
        this.parameters = parameters;
        this.is_total_required_for_column = is_total_required_for_column;
        this.added_by = added_by;
    }
}
