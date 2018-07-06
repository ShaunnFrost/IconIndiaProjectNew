package com.frantic.icon_india.project.utills;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 21-Jan-17.
 */

public class IsEmptyString {

    public static boolean isEmpty(String text){
        if(text==null || text.trim().isEmpty() || text.trim().equals(""))
            return true;
        else return false;
    }
    public static boolean isEmpty(View view){
        String text=null;
        if(view instanceof TextView)
            text=((TextView)view).getText().toString();
        else if(view instanceof EditText)
            text=((EditText)view).getText().toString();
        if(text==null || text.trim().isEmpty())
            return true;
        else return false;
    }
}
