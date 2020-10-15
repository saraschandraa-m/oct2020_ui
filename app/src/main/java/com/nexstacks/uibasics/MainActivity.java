package com.nexstacks.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvSetupWizard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        mTvSetupWizard = findViewById(R.id.tv_setup_plan);

        mTvSetupWizard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage();
            }
        });


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                finish();
            }
        }, 3000);
    }


    private void showToastMessage(){

    }


    class Student{
        String studentName;
        String studentRollNo;

        public void setStudentDetails(){

        }

        public Student(){

        }
    }
}