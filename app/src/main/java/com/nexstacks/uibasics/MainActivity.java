package com.nexstacks.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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