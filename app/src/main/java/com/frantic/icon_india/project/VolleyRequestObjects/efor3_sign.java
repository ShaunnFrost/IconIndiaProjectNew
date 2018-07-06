package com.frantic.icon_india.project.VolleyRequestObjects;

/**
 * Created by Harry on 7/4/2018.
 */

public class efor3_sign {
    String first_name;
    String last_name;
    String gender;
    String email;
    String mobile;
    String password;

    public efor3_sign(String first_name, String last_name,String gender, String email, String mobile, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender=gender;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String phone) {
        this.mobile = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
