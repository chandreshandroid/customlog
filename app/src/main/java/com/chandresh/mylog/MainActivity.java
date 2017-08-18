package com.chandresh.mylog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chandresh.customlog.customLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customLog.d("TestLog","StartActivity");
    }
}
