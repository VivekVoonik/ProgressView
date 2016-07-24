package com.vivek.progressindicator;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vivek.progressindicator.progress.ProgressLayout;

public class MainActivity extends AppCompatActivity {
    private ProgressLayout mProgressLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressLayout = (ProgressLayout) findViewById(R.id.progress_layout);
        mProgressLayout.setColorSchemeResources(R.color.colorAccent, R.color.colorPrimary);
        mProgressLayout.setRefreshing(true);
        mProgressLayout.setProgressBackgroundColorSchemeColor(getResources().getColor(R.color.color_green));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgressLayout.setRefreshing(false);
            }
        }, 10000);
    }
}
