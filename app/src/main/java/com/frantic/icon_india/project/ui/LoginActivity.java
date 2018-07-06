package com.frantic.icon_india.project.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.frantic.icon_india.project.R;

public class LoginActivity extends Activity {

    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        btn = (Button) findViewById(R.id.btn_login);
        tv = (TextView)findViewById(R.id.forgotpassword);
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,
                        LoginActivity.class);
                startActivity(intent);
            }
        });
        tv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,
                        ForgotPasswordActivity.class);
                startActivity(i);
            }
        });
    }

}
