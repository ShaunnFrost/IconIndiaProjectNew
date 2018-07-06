package com.ankur.taskapp.manager.masterData;

/**
 * Created by Ankur_ on 3/7/2018.
 */

public class AllLeaveRequests {
    String request_id;
    String request_date;
    String start_date;
    String end_date;
    String purpose;
    String status;
    String comment;
    String type;
    String employee_name;
    String employee_id;
    String employee_image;


    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getRequest_date() {
        return request_date;
    }

    public void setRequest_date(String request_date) {
        this.request_date = request_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_image() {
        return employee_image;
    }

    public void setEmployee_image(String employee_image) {
        this.employee_image = employee_image;
    }

    public AllLeaveRequests(String request_id, String request_date, String start_date, String end_date,
                            String purpose, String status, String comment, String type,
                            String employee_name, String employee_id, String employee_image)
    {
        this.request_id=request_id;
        this.request_date=request_date;
        this.start_date=start_date;
        this.end_date=end_date;
        this.purpose=purpose;
        this.status=status;

        this.comment=comment;
        this.type=type;
        this.employee_name=employee_name;
        this.employee_id=employee_id;
        this.employee_image=employee_image;
    }
}
