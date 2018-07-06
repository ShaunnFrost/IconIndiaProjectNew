package com.ankur.taskapp.manager.masterData;

/**
 * Created by Ankur_ on 1/22/2018.
 */

public class OverDueProjectsList {

    String project_id;
    String project_name;
    String startdate;
    String enddate;
    String project_manager;
    String team_member;
    String reference;
    String field_of_project;
    String late;
    String attachment;
boolean isExpend=false;


    public String getAttachment() {
        return attachment;
    }
    public boolean isExpand() {
        return isExpend;}
    public void setExpand(boolean expand) {
        isExpend=expand;}

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

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

    public String getProject_manager() {
        return project_manager;
    }

    public void setProject_manager(String project_manager) {
        this.project_manager = project_manager;
    }

    public String getTeam_member() {
        return team_member;
    }

    public void setTeam_member(String team_member) {
        this.team_member = team_member;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getField_of_project() {
        return field_of_project;
    }

    public void setField_of_project(String field_of_project) {
        this.field_of_project = field_of_project;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }
}
