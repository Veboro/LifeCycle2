package com.veboro.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edit;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        edit = findViewById(R.id.edit);
        button = findViewById(R.id.button);

        Log.d("Happy", "EditActivity onCreate");

        Intent intent = getIntent();
        String userName = intent.getStringExtra();

        if(userName != null){
            edit.setText(userName);
        }

        button.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Happy", "EditActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Happy", "EditActivity onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Happy", "EditActivity onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Happy", "EditActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Happy", "EditActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("happy", "EditActivity onDestroy");
    }

    @Override
    public void onClick(View view) {
        String name = edit.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("NAME",name);
        setResult(RESULT_OK, intent);
        onBackPressed();
    }
}
