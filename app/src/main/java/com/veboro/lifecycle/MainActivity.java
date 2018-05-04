package com.veboro.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //test

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Happy","MainActivity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Happy","MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Happy", "MainActivity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Happy","MainActivity onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Happy","mainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Happy","MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("happy","MainActivity onDestroy");
    }

    public void startEdit(View view) {
        Intent intent = new Intent(this, EditActivity.class);
        intent.putExtra("NAME","Dima");
        startActivity(intent);
    }
}
