package com.frantic.icon_india.project.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.frantic.icon_india.project.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password);
        btn = (Button) findViewById(R.id.btn_reset_password);
        tv = (TextView) findViewById(R.id.link_sign_in);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPasswordActivity.this,
                        PasswordResetConrfm.class);
                startActivity(intent);

            }
        });
        tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//				finish();

            }
        });
    }
}
