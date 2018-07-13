package com.frantic.icon_india.project.ui;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.frantic.icon_india.project.R;
import com.frantic.icon_india.project.VolleyRequestObjects.efor3_sign;
import com.frantic.icon_india.project.constants.URLConstants;
import com.frantic.icon_india.project.interfacehelper.VolleyResponse;
import com.frantic.icon_india.project.masterData.LoginRequest;
import com.frantic.icon_india.project.network.InternetConnection;
import com.frantic.icon_india.project.network.Network;
import com.frantic.icon_india.project.sharedprefrences.SharedPrefrences;
import com.frantic.icon_india.project.validations.Validation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.List;

import butterknife.ButterKnife;
import dmax.dialog.SpotsDialog;

public class LoginActivity extends Activity {

    SharedPrefrences sharedPref;
    Network network;

    private SpotsDialog alertDialog;

    private Snackbar snackbar;
    //private CoordinatorLayout coordinatorLayout1;
    private ImageView imglogin;
    private Button btnLogin;
    private EditText et_emailId;
    private EditText et_pass;
    private TextView tv_forget;
    private TextView btn_linkSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setTitle("Sign In");
        setContentView(R.layout.sign_in);
        sharedPref = SharedPrefrences.getsharedprefInstance(this);

        alertDialog = new SpotsDialog(this);
        network = Network.getInstance(this);
        //coordinatorLayout1 = findViewById(R.id.main_content);
        //getLoginImage();
//        tv_forget = (TextView) findViewById(R.id.tv_forget);
        et_emailId = (EditText) findViewById(R.id.input_email);
        et_pass = (EditText) findViewById(R.id.input_password);
        //TextView forgetpass = findViewById(R.id.linkforgetpass);
        /*btn_linkSignUp = findViewById(R.id.linksignup);
        btn_linkSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignUp.class));
            }
        });
        forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(LoginActivity.this, ForgetPassword.class));
            }
        });*/
//        signup = (TextView) findViewById(R.id.signup);
//        signup.setOnClickListener(this);
        network = Network.getInstance(this);
        alertDialog = new SpotsDialog(this);
        //imglogin = findViewById(R.id.bg_login);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginapp();
            }
        });
    }

   /* private void getLoginImage() {
        if (InternetConnection.isConnected(this)) {

            network.requestWithJsonObject(URLConstants.loginImage, new ImageRequest("2"), splash_response);

        } else {

            snackbar = Snackbar
                    .make(coordinatorLayout1, "There was something wrong. Check internet connection", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Retry", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            getLoginImage();
                        }
                    });
            snackbar.setActionTextColor(Color.RED);

            // Changing action button text color
            View sbView = snackbar.getView();
            TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
            textView.setTextColor(Color.YELLOW);
            snackbar.show();

        }
    }*/


    /*VolleyResponse splash_response = new VolleyResponse() {
        @Override
        public void onResponse(JSONObject obj) throws Exception {
            try {
                if (obj.has("img") && !obj.isNull("img")) {
//                    Type token = new TypeToken<List<Splash>>() {
//                    }.getType();
//                    splashList = new Gson().fromJson(obj.getJSONArray("img").toString(), token);
                    Glide.with(getApplicationContext()).load(obj.get("img")).into(imglogin);
                    // Toast.makeText(SplashScreen.this, obj.getString("response_string").toString(), Toast.LENGTH_SHORT).show();
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }

                } else
                    Toast.makeText(LoginActivity.this, obj.getString("response_string").toString(), Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };*/

    private void loginapp() {
        alertDialog.show();
        network.requestWithJsonObject(URLConstants.login, new LoginRequest(et_emailId.getText().toString(), et_pass.getText().toString()),
                loginResponse);

    }


    VolleyResponse loginResponse = new VolleyResponse() {
        @Override
        public void onResponse(JSONObject obj) throws Exception {
            if (obj.getString("error_code").equals("1")) {
                /*Gson gson = new Gson();
                UserDataObject userDataObject = gson.fromJson(obj.getJSONObject("data").toString(), UserDataObject.class);
                if (userDataObject != null)*/
                /*if (obj.has("data") && !obj.isNull("data")) {
                    Type token = new TypeToken<List<UserDataObject>>() {
                    }.getType();
                    List<UserDataObject> userDataObject = new Gson().fromJson(obj.getJSONArray("data").toString(), token);

                    sharedPref.setUserDetail(obj.getJSONArray("data").toString());
                    sharedPref.setLoggedIn(true);
                    if (alertDialog.isShowing())
                        alertDialog.dismiss();
                    finish();
                    startActivity(new Intent(LoginActivity.this, WelcomeActivity.class));

                    Log.w("Login Response", obj.toString());
                    //Toast.makeText(LoginActivity.this, obj.getString("response_string").toString(), Toast.LENGTH_LONG).show();
                }*/

                    sharedPref.setUserDetail(obj.getJSONObject("userinfo").toString());
                    sharedPref.setLoggedIn(true);
                    startActivity(new Intent(LoginActivity.this,WelcomeActivity.class));



            } else

            {
                Toast.makeText(LoginActivity.this, obj.getString("response_string").toString(), Toast.LENGTH_LONG).show();
                alertDialog.dismiss();

            }
        }
    };


}
