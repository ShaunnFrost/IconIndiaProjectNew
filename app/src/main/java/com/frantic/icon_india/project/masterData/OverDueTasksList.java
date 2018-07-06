package com.ankur.taskapp.manager.masterData;

/**
 * Created by Ankur_ on 1/22/2018.
 */

public class OverDueTasksList {

    private String task_id, task_name, task_discription, task_date, task_due_date, late,assigned_by,priority;
    boolean isExpend=false;



    public boolean isExpand() {
        return isExpend;}
    public void setExpand(boolean expand) {
        isExpend=expand;}
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_discription() {
        return task_discription;
    }

    public void setTask_discription(String task_discription) {
        this.task_discription = task_discription;
    }

    public String getTask_date() {
        return task_date;
    }

    public void setTask_date(String task_date) {
        this.task_date = task_date;
    }

    public String getTask_due_date() {
        return task_due_date;
    }

    public void setTask_due_date(String task_due_date) {
        this.task_due_date = task_due_date;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    public String getAssigned_by() {
        return assigned_by;
    }

    public void setAssigned_by(String assigned_by) {
        this.assigned_by = assigned_by;
    }
}
