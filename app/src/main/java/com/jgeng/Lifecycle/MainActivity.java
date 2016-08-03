package com.jgeng.Lifecycle;

import android.graphics.Bitmap;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileOutputStream;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Lifecycle Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "onCreate Start");
        super.onCreate(savedInstanceState);
        Log.e(TAG, "before setContentView");
        setContentView(R.layout.activity_main);
        Log.e(TAG, "after setContentView");
        Log.e(TAG, "onCreate end");
    }

    @Override
    public void onAttachFragment (Fragment childFragment) {
        Log.e(TAG, "onAttachFragment Start");
        Log.e(TAG, "onAttachFragment end");
    }

    @Override
    public void onStart() {
        Log.e(TAG, "onStart {");
        super.onStart();
        Log.e(TAG, "onStart }");
    }

    @Override
    public void onResume() {
        Log.e(TAG, "onResume {");
        View v= findViewById(R.id.text_view);
        Log.e(TAG, "view " + v.getMeasuredHeight() + " " + v.getMeasuredWidth());
        super.onResume();
        Log.e(TAG, "onResume }");
    }

    @Override
    public void onPause() {
        Log.e(TAG, "onPause {");
        View v= findViewById(R.id.text_view);
        Log.e(TAG, "view " + v.getMeasuredHeight() + " " + v.getMeasuredWidth());
        super.onPause();
        Log.e(TAG, "onPause }");
    }

    @Override
    public void onStop() {
        Log.e(TAG, "onStop {");
        super.onStop();
        Log.e(TAG, "onStop }");
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "onDestroy {");
        super.onDestroy();
        Log.e(TAG, "onDestroy }");
    }

    @Override
    public void onWindowFocusChanged(boolean focus) {
        Log.e(TAG, "onWindowFocusChanged {");
        super.onWindowFocusChanged(focus);
        View v= findViewById(R.id.text_view);
        Log.e(TAG, "view " + v.getMeasuredHeight() + " " + v.getMeasuredWidth());
        Log.e(TAG, "onWindowFocusChanged }");
    }
}
