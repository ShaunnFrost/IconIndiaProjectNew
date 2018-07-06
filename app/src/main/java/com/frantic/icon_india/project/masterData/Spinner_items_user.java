package com.ankur.taskapp.manager.masterData;

/**
 * Created by Ankur_ on 3/23/2018.
 */

public class Spinner_items_user {
    String employee_id,employee_name;
    public Spinner_items_user(String employee_id, String employee_name)
    {
        this.employee_id=employee_id;

        this.employee_name=employee_name;
    }
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


}
