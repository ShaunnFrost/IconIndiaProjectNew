package com.frantic.icon_india.project.ui;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.frantic.icon_india.project.R;
import com.frantic.icon_india.project.constants.URLConstants;
import com.frantic.icon_india.project.VolleyRequestObjects.efor3_sign;
import com.frantic.icon_india.project.interfacehelper.VolleyResponse;
import com.frantic.icon_india.project.network.InternetConnection;
import com.frantic.icon_india.project.network.Network;
import com.frantic.icon_india.project.sharedprefrences.SharedPrefrences;
import com.frantic.icon_india.project.validations.Validation;

import org.json.JSONObject;

import java.util.Calendar;

import butterknife.ButterKnife;
import dmax.dialog.SpotsDialog;

import static com.frantic.icon_india.project.network.Network.network;

public class SignUpActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button btn;
    TextView tv;
    private Button btn_done;
    Network network;
    SharedPrefrences sharedPrefrences;
    private static Button date;
    private static TextView set_date;
    private static final int Date_id = 0;
    private EditText first_name;
    private EditText last_name;
    private EditText email;
    private EditText mobile;
    private EditText password;
    android.app.AlertDialog alertDialog;
    private Intent intent;
    private RadioButton F;
    private RadioButton M;
    private RadioGroup radiosex;
    private RadioButton gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        ButterKnife.bind(this);
        alertDialog = new SpotsDialog(this);
        network = new Network(this);
        sharedPrefrences = SharedPrefrences.getsharedprefInstance(this);
        first_name = (EditText) findViewById(R.id.input_first_name);
        last_name = (EditText) findViewById(R.id.input_last_name);
        email = (EditText) findViewById(R.id.input_email);
        mobile = (EditText) findViewById(R.id.input_phone);
        password = (EditText) findViewById(R.id.input_password);
        radiosex= (RadioGroup) findViewById(R.id.sex);
        F = (RadioButton) findViewById(R.id.radioFemale);
        M = (RadioButton) findViewById(R.id.radioMale);


        date = (Button) findViewById(R.id.selectdate);
        set_date = (TextView) findViewById(R.id.set_date);
        date.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // Show Date dialog
                showDialog(Date_id);
            }
        });
        btn_done = (Button) findViewById(R.id.btn_done);

        tv = (TextView) findViewById(R.id.login);
        tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this,
                        LoginActivity.class);
                startActivity(intent);

            }
        });
        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkdata();
//                Intent i=new Intent(SignUpActivity.this,SignUpActivity.class);
//                startActivity(i);
            }
        });
    }
    private void checkdata() {
        if (Validation.isBlankField(first_name, "Name cannot be empty")) {
            if (Validation.isNameValidation(last_name, "Name length must be greater than 3")) {
                {
                    if (Validation.isBlankField(email, "Email cannot be empty")) {
                        if (Validation.isPhoneValidation(mobile, "Mobile number length must be <=10")) {

                                if (Validation.isBlankField(password, " cannot be empty")) {
                                    if (radiosex.getCheckedRadioButtonId() != -1) {

                                    if (InternetConnection.isConnected(SignUpActivity.this)) {
                                        registerData();

                                    } else
                                        Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();

                                }else
                                        Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                                } else
                                    Toast.makeText(this, "Please select age", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }}

    private void registerData() {

        alertDialog.show();
        int selected = radiosex.getCheckedRadioButtonId();
        gender= (RadioButton) findViewById(selected);
        network.requestWithJsonObject(URLConstants.register, new efor3_sign(first_name.getText().toString(),last_name.getText().toString(),
                gender.getText().toString(),email.getText().toString(),mobile.getText().toString(),password.getText().toString()), registerResponse);
    }


    VolleyResponse registerResponse = new VolleyResponse() {
        @Override
        public void onResponse(JSONObject obj) throws Exception {
            if(alertDialog.isShowing())
                alertDialog.dismiss();

            if (obj.getString("error_code").equals("1")) {

                sharedPrefrences.setUserDetail(obj.getJSONObject("userinfo").toString());
                sharedPrefrences.setLoggedIn(true);
                intent = new Intent(SignUpActivity.this,MainActivity.class);
                startActivity(intent);

            }
            else
            {
                Toast.makeText(SignUpActivity.this, obj.getString("response_string").toString(), Toast.LENGTH_LONG).show();
            }
        }
    };

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }



    protected Dialog onCreateDialog(int id) {

        // Get the calander
        Calendar c = Calendar.getInstance();

        // From calander get the year, month, day, hour, minute
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        switch (id) {
            case Date_id:
                // Open the datepicker dialog
                return new DatePickerDialog(SignUpActivity.this, date_listener, year,
                        month, day);
        }
        return null;
    }


    // Date picker dialog
    DatePickerDialog.OnDateSetListener date_listener = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int month, int day) {
            // store the data in one string and set it to text
            String date1 = String.valueOf(month) + "/" + String.valueOf(day)
                    + "/" + String.valueOf(year);
            set_date.setText(date1);
        }
    };
}
