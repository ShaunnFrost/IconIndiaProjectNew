package com.ankur.taskapp.manager.masterData;

/**
 * Created by Ankur_ on 2/9/2018.
 */

public class UserViewDetails {
    String employee_id,employee_name,employee_image,employee_designation;

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_image() {
        return employee_image;
    }

    public void setEmployee_image(String employee_image) {
        this.employee_image = employee_image;
    }

    public String getEmployee_designation() {
        return employee_designation;
    }

    public void setEmployee_designation(String employee_designation) {
        this.employee_designation = employee_designation;
    }

    public UserViewDetails(String employee_id, String employee_name, String employee_image, String employee_designation)
    {
        this.employee_designation=employee_designation;
        this.employee_id=employee_id;
        this.employee_image=employee_image;

        this.employee_name=employee_name;
    }
}
