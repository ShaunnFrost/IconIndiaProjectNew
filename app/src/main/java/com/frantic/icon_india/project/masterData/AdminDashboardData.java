package com.ankur.taskapp.manager.masterData;

/**
 * Created by Ankur_ on 2/16/2018.
 */

public class AdminDashboardData {
    String pending_project,running_project,complete_project,overdue_project,total_project,pending_task,overdue_task,total_task,employee_present,
            employee_on_leave,total_employee,employee_absent;
    public AdminDashboardData(String pending_project, String running_project, String complete_project, String overdue_project, String total_project,
                              String pending_task, String overdue_task, String total_task, String employee_present, String employee_on_leave,
                              String total_employee, String employee_absent)
    {
        this.pending_project=pending_project;
        this.running_project=running_project;
        this.complete_project=complete_project;
        this.overdue_project=overdue_project;
        this.total_project=total_project;
        this.pending_task=pending_task;
        this.overdue_task=overdue_task;
        this.total_task=total_task;
        this.employee_present=employee_present;
        this.employee_on_leave=employee_on_leave;
        this.total_employee=total_employee;
        this.employee_absent=employee_absent;

    }
    public String getPending_project() {
        return pending_project;
    }

    public void setPending_project(String pending_project) {
        this.pending_project = pending_project;
    }

    public String getRunning_project() {
        return running_project;
    }

    public void setRunning_project(String running_project) {
        this.running_project = running_project;
    }

    public String getComplete_project() {
        return complete_project;
    }

    public void setComplete_project(String complete_project) {
        this.complete_project = complete_project;
    }

    public String getOverdue_project() {
        return overdue_project;
    }

    public void setOverdue_project(String overdue_project) {
        this.overdue_project = overdue_project;
    }

    public String getTotal_project() {
        return total_project;
    }

    public void setTotal_project(String total_project) {
        this.total_project = total_project;
    }

    public String getPending_task() {
        return pending_task;
    }

    public void setPending_task(String pending_task) {
        this.pending_task = pending_task;
    }

    public String getOverdue_task() {
        return overdue_task;
    }

    public void setOverdue_task(String overdue_task) {
        this.overdue_task = overdue_task;
    }

    public String getTotal_task() {
        return total_task;
    }

    public void setTotal_task(String total_task) {
        this.total_task = total_task;
    }

    public String getEmployee_present() {
        return employee_present;
    }

    public void setEmployee_present(String employee_present) {
        this.employee_present = employee_present;
    }

    public String getEmployee_on_leave() {
        return employee_on_leave;
    }

    public void setEmployee_on_leave(String employee_on_leave) {
        this.employee_on_leave = employee_on_leave;
    }

    public String getTotal_employee() {
        return total_employee;
    }

    public void setTotal_employee(String total_employee) {
        this.total_employee = total_employee;
    }

    public String getEmployee_absent() {
        return employee_absent;
    }

    public void setEmployee_absent(String employee_absent) {
        this.employee_absent = employee_absent;
    }


}
