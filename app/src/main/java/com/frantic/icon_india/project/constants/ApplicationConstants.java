package com.frantic.icon_india.project.ui;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Logimetrix on 13-06-2017.
 */

public class ApplicationConstants {

    public static List<String> getPriorityList(){
        List<String> priortyList=new ArrayList<>();
        priortyList.add("Low");
        priortyList.add("Medium");
        priortyList.add("High");

        return priortyList;
    }

    public static List<String> getReminderList(){
        List<String> reminderList=new ArrayList<>();
        reminderList.add("Select Reminders");
        reminderList.add("Monthly");
        reminderList.add("Weekly");
        reminderList.add("Daily");

        return reminderList;
    }
    public static List<String> getFilterData(){
        List<String> filterList=new ArrayList<>();
        filterList.add("Select");
        filterList.add("Task ID");
        filterList.add("Task Type");
        filterList.add("Priority");
        filterList.add("Assignor");
        filterList.add("Reminder");
        filterList.add("Due Date");
        filterList.add("Created Date");
        return filterList;
    }
    public static String getDeviceId(Context con) {
        final String deviceId = ((TelephonyManager) con.getSystemService(con.TELEPHONY_SERVICE)).getDeviceId();
        if (deviceId != null) {
            return deviceId;
        } else {
            return android.os.Build.SERIAL;
        }
    }
    public static String formatdate(String fdate)
    {
        String datetime=null;
        DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat d= new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date convertedDate = inputFormat.parse(fdate);
            datetime = d.format(convertedDate);

        }catch (ParseException e)
        {

        }
        return  datetime;


    }
    public static String task_Id="Task ID";
    public static String task_type="Task Type";
    public static String due_date="Due Date";
    public static String assignee="Assignor";
    public static String status="Status";
    public static String priority="Priority";
    public static String select="Select";
    public static String reminder="Reminder";
    public static String createdDate="Created Date";
    public static int key1=1;
    public static int key2=2;

    public static void hideSoftKeybord(Context context)
    {
        InputMethodManager imm = (InputMethodManager)
                context.getSystemService(Context.INPUT_METHOD_SERVICE);
        if(imm != null){
            imm.toggleSoftInput(0, InputMethodManager.HIDE_IMPLICIT_ONLY);
        }

    }
    public   static void setHideSoftKeyboard(Context context,EditText editText){
        InputMethodManager imm = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }
}
