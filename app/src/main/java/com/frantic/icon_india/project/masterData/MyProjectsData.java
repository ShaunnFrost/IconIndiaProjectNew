package com.ankur.taskapp.manager.masterData;

import java.util.List;

/**
 * Created by Logimetrix on 13-06-2017.
 */

public class MyProjectsData {



ProjectsData project;

List<TeamData> team;
boolean isExpand=false;

    public static class TeamData
    {
        String employee_id;
        String employee_name;

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

    public boolean isExpand() {
        return isExpand;
    }

    public void setExpand(boolean expand) {

        isExpand = expand;
    }

    public ProjectsData getProject() {
        return project;
    }

    public void setProject(ProjectsData project) {
        this.project = project;
    }

    public List<TeamData> getTeam() {
        return team;
    }

    public void setTeam(List<TeamData> team) {
        this.team = team;
    }

    public static class ProjectsData
    {
        String project_id;
        String project_name;
        String startdate;
        String enddate;
        String cost_of_project;
        String manager;
        String managerid;
        String field_of_project;
        String add_date;
        String approve_comment;
        String document;
        String reference;

        public String getProject_id() {
            return project_id;
        }

        public void setProject_id(String project_id) {
            this.project_id = project_id;
        }

        public String getProject_name() {
            return project_name;
        }

        public void setProject_name(String project_name) {
            this.project_name = project_name;
        }

        public String getStartdate() {
            return startdate;
        }

        public void setStartdate(String startdate) {
            this.startdate = startdate;
        }

        public String getEnddate() {
            return enddate;
        }

        public void setEnddate(String enddate) {
            this.enddate = enddate;
        }

        public String getCost_of_project() {
            return cost_of_project;
        }

        public void setCost_of_project(String cost_of_project) {
            this.cost_of_project = cost_of_project;
        }

        public String getManager() {
            return manager;
        }

        public void setManager(String manager) {
            this.manager = manager;
        }

        public String getManagerid() {
            return managerid;
        }

        public void setManagerid(String managerid) {
            this.managerid = managerid;
        }

        public String getField_of_project() {
            return field_of_project;
        }

        public void setField_of_project(String field_of_project) {
            this.field_of_project = field_of_project;
        }

        public String getAdd_date() {
            return add_date;
        }

        public void setAdd_date(String add_date) {
            this.add_date = add_date;
        }

        public String getApprove_comment() {
            return approve_comment;
        }

        public void setApprove_comment(String approve_comment) {
            this.approve_comment = approve_comment;
        }

        public String getDocument() {
            return document;
        }

        public void setDocument(String document) {
            this.document = document;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }


    }
}
