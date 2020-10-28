package com.example.login_screen_data_saved;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG = "~~~~~~~~~LOGIN APP~~~~~~~~~~ :::::";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void loginButtonPressed(){

    }

    public void loginButtonPressed(View view) {

        TextView userNameTV = (TextView) findViewById(R.id.userName);
        TextView passwordTV = (TextView) findViewById(R.id.password);
        TextView phoneNumberTV = (TextView) findViewById(R.id.phoneNumber);
        CheckBox agreementTV = (CheckBox) findViewById(R.id.agreeCheckbox);
        Switch rememberMeTV = (Switch) findViewById(R.id.rememberMeSwitch);

        String uName = userNameTV.getText().toString();
        String uPassword =passwordTV.getText().toString();
        String uPhone = phoneNumberTV.getText().toString();
        boolean agree = agreementTV.isChecked();
        boolean remMe = rememberMeTV.isChecked();



        UserAccount user1 = new UserAccount(uName,uPassword ,uPhone, agree,remMe );

        Log.d(TAG, user1.toString());
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, "Saved Login Information", duration);
        toast.show();
    }
}