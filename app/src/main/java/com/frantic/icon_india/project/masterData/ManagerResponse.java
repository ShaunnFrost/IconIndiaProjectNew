package com.ankur.taskapp.manager.masterData;

/**
 * Created by Ankur_ on 2/6/2018.
 */

public class ManagerResponse {
    String manager_id,manager_email;

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_email() {
        return manager_email;
    }

    public void setManager_email(String manager_email) {
        this.manager_email = manager_email;
    }

    public ManagerResponse(String manager_id, String manager_email)
    {
        this.manager_id=manager_id;
        this.manager_email=manager_email;

    }
}
