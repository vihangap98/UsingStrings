package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TvMsg2 = findViewById(R.id.textView);
        TvMsg2.setText(R.string.Msg2);


        Log.i("Lifecycle","Oncreate() invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle","Onstart() invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle","Onrestart() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","Onresume() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","Onpause() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","Onstop() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","Ondestroy() invoked");
    }
}