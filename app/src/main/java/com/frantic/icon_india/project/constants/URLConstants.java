package com.frantic.icon_india.project.constants;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;

/**
 * Created by logimetrix on 30/7/16.
 */
public class URLConstants {

    //public static String serverurl="http://staging.logimetrix.me/api/server-url";
   //static String domain="http://cairn.cropnet.co.in";

    //public static String domain="http://gat.cropnet.co.in";

    public static String domain ="http://efor3.com";

    public static String apiController ="/apprequest";
    public static String base_url = domain + apiController;

    public static String login = base_url + "/login";
    public static String register = base_url + "/register";

    public static String dashboard = base_url + "/getdashboarddata";
    public static String getDashboardData = base_url + "/getDashboardData";
    public static String getEmployeeList = base_url + "/getEmployeeList";
    public static String employeecompletedetails = base_url + "/getEmployee";

    public static String employeenavdata = base_url + "/getEmployeeNavbarData";

    public static String getProjectsData = base_url + "/getProject";
    public  static String getTasksData=base_url+"/getTask";
    public  static String getTodayAttendance=base_url+"/getTodayAttendance";
    public  static String getMonthlyAttendance=base_url+"/getAttendance";
    public  static String getLeaveApprovals=base_url+"/getLeaveRequests";
    public  static String getUpoatedLeaveStatus=base_url+"/updateLeaveStatus";
    public  static String getNotification=base_url+"/registerToken";
    public  static String practiseTest=base_url+"/downloadAttendance";
    public static String addtask=base_url+"/addtask";

    public static String getDeviceId(Context context) {
        String device_id = ((TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE)).getDeviceId();
        if (device_id != null)
            return device_id;
        else
            return Build.SERIAL;
    }

    public static String getImeiNo(Context con) {
        String str = null;
        try {
            String deviceId = ((TelephonyManager) con.getSystemService(Context.TELEPHONY_SERVICE)).getDeviceId();
            if (deviceId != null) {
                str = deviceId;
            } else {
                String android_id = Settings.Secure.getString(con.getContentResolver(),
                        Settings.Secure.ANDROID_ID);
                if (android_id != null)
                    str = android_id;
            }
        } catch (Exception e) {
            e.printStackTrace();
            str = "2365489563";
        }

        return str;
    }
}
