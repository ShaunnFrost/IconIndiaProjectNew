package com.frantic.icon_india.project.sharedprefrences;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by logimetrix on 8/7/16.
 */
public class SharedPrefrences {

    private static SharedPrefrences gardenSharedPrfs;
    private SharedPreferences appSharedPrefs;
    private SharedPreferences.Editor prefsEditor;

    private static final String sharedprfstag="cairn_prfs";
    private static final String prf_login_status="loginstatus";
    private static final String prf_loginid="loginid";
    private static final String prf_imei_no="imei";
    private static final String prf_user_detail="userdetail";
    private static final String offline_timestamp="2016-09-22 07:00:00";



    private SharedPrefrences(Context context) {
        this.appSharedPrefs = context.getSharedPreferences(sharedprfstag, Context.MODE_PRIVATE);
        this.prefsEditor = appSharedPrefs.edit();
    }

    public static SharedPrefrences getsharedprefInstance(Context con) {
        if (gardenSharedPrfs == null)
            gardenSharedPrfs = new SharedPrefrences(con);
        return gardenSharedPrfs;
    }

    public SharedPreferences getAppSharedPrefs() {
        return appSharedPrefs;
    }

    public void setAppSharedPrefs(SharedPreferences appSharedPrefs) {
        this.appSharedPrefs = appSharedPrefs;
    }

    public SharedPreferences.Editor getPrefsEditor() {
        return prefsEditor;
    }

    public void Commit() {
        prefsEditor.commit();
    }

    public void setBaseURL(String url) {
        this.prefsEditor = appSharedPrefs.edit();
        prefsEditor.putString("base_url", url);
        prefsEditor.commit();
    }

    public String getBaseURL() {
        return appSharedPrefs.getString("base_url", "http://pmms.logimetrix.me/api");
    }

    public void setLoggedIn(boolean status){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putBoolean("isLoggedIn",status);
        prefsEditor.commit();
    }

    public boolean isLoggedIn(){
        return appSharedPrefs.getBoolean("isLoggedIn",false);
    }

    public void setUserDetail(String selfDetails){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putString("user_details",selfDetails);
        prefsEditor.commit();
    }

    /*public List<UserDataObject> getUserDetail(){
        String userData=appSharedPrefs.getString("user_details","");
        Type token=new TypeToken<List<UserDataObject>>(){}.getType();
        List<UserDataObject> userDataObj=new Gson().fromJson(userData,token);
        return userDataObj;
    }
*/
    public void setTaskType(String selfDetails){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putString("task_type",selfDetails);
        prefsEditor.commit();
    }

   /* public List<TaskType> getTaskType(){
        String userData=appSharedPrefs.getString("task_type","");
        Type token=new TypeToken<List<TaskType>>(){}.getType();
        List<TaskType> userDataObject=new Gson().fromJson(userData,token);
        return userDataObject;
    }
*/
    public void setUserList(String selfDetails){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putString("user_list",selfDetails);
        prefsEditor.commit();
    }

   /* public List<MyProjectsData> getUserList(){
        String userData=appSharedPrefs.getString("user_list","");
        Type token=new TypeToken<List<MyProjectsData>>(){}.getType();
        List<MyProjectsData> userDataObject=new Gson().fromJson(userData,token);
        return userDataObject;
    }*/

    public void setdepartmentId(String deptId){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putString("dept_Id",deptId);
        prefsEditor.commit();
    }
    public String getdepartmentId(){
        return  appSharedPrefs.getString("dept_Id","");
    }

    public void setsbuId(String sbuId){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putString("sbu_Id",sbuId);
        prefsEditor.commit();
    }
    public String getsbuId(){
        return  appSharedPrefs.getString("sbu_Id","");
    }

    public void setLocId(String locId){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putString("loc_Id",locId);
        prefsEditor.commit();
    }
    public String getLocId(){
        return  appSharedPrefs.getString("loc_Id","");
    }

    public void setTaskId(String locId){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putString("task_Id",locId);
        prefsEditor.commit();
    }
    public String getTaskId(){
        return  appSharedPrefs.getString("task_Id","");
    }


    public void setSpinnerStatus(boolean status){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putBoolean("isSet",status);
        prefsEditor.commit();
    }
    public boolean getSpinnerStatus()
    {
        return appSharedPrefs.getBoolean("isSet",false);
    }



    public void setFCMDeviceId(String fcmDeviceId) {
        this.prefsEditor = appSharedPrefs.edit();
        prefsEditor.putString("fcmDeviceId", fcmDeviceId);
        prefsEditor.commit();
    }

    public String getFCMDeviceId() {

        return appSharedPrefs.getString("fcmDeviceId", "");
    }

 /*   public void setNotificationObject(MyTasksData notificationObject){
        this.prefsEditor = appSharedPrefs.edit();
        prefsEditor.putString("noti_object", new Gson().toJson(notificationObject));
        prefsEditor.commit();
    }

    public MyTasksData getNotificationObject(){
        MyTasksData notificationsObject=new Gson().fromJson(appSharedPrefs.getString("noti_object", ""),MyTasksData.class);
        return notificationsObject;
    }*/

    public void setRole(boolean  role){
        this.prefsEditor = appSharedPrefs.edit();
        prefsEditor.putBoolean("super_user", role);
        prefsEditor.commit();
    }

    public boolean isSuperUser(){
        return appSharedPrefs.getBoolean("super_user", false);
    }


    public void setNoti(String noti){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putString("noti",noti);
        prefsEditor.commit();
    }
    public String getNoti(){
        return  appSharedPrefs.getString("noti","");
    }


    public void setUpcommingStatus(boolean status){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putBoolean("up_com",status);
        prefsEditor.commit();
    }
    public boolean getUpcommingStatusStatus()
    {
        return appSharedPrefs.getBoolean("up_com",false);
    }
    public void setOverDueStatus(boolean status){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putBoolean("over_due",status);
        prefsEditor.commit();
    }
    public boolean getOverDueStatus()
    {
        return appSharedPrefs.getBoolean("over_due",false);
    }
    public void setPendingStatus(boolean status){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putBoolean("pending",status);
        prefsEditor.commit();
    }
    public boolean getPendingStatus()
    {
        return appSharedPrefs.getBoolean("pending",false);
    }

    public String getAdminMasterData(){

        return  appSharedPrefs.getString("loc_Id","");
    }

    public void setAdminMasterData(String masterid){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putString("loc_Id",masterid);
        prefsEditor.commit();
    }
    public String getUserMasterData(){

        return  appSharedPrefs.getString("loc_Id","");
    }

    public void setUserMasterData(String userid){
        this.prefsEditor=appSharedPrefs.edit();
        prefsEditor.putString("loc_Id",userid);
        prefsEditor.commit();
    }
}


