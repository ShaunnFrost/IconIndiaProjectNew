package com.ankur.taskapp.manager.masterData;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DESIGNER-PC1 on 7/10/2017.
 */

public class ReportOptions {
    private String id,user_id;
    private List<department> department;
    private List<location> location;
    private List<task_type> task_type;
    private List<sbu> sbu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public List<ReportOptions.department> getDepartment() {
        return department;
    }

    public void setDepartment(List<ReportOptions.department> department) {
        this.department = department;
    }

    public List<ReportOptions.location> getLocation() {
        return location;
    }

    public void setLocation(List<ReportOptions.location> location) {
        this.location = location;
    }

    public List<ReportOptions.task_type> getTask_type() {
        return task_type;
    }

    public void setTask_type(List<ReportOptions.task_type> task_type) {
        this.task_type = task_type;
    }

    public List<ReportOptions.sbu> getSbu() {
        return sbu;
    }

    public void setSbu(List<ReportOptions.sbu> sbu) {
        this.sbu = sbu;
    }


    public static class department implements Serializable
    {
        private String id,department;
        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
    public static class location implements Serializable
    {
        private String id,location;

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
    public static class  task_type implements Serializable{
        private String id,task;

        public String getTask() {
            return task;
        }

        public void setTask(String task) {
            this.task = task;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
    public static class sbu implements Serializable{
        private String id,name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
