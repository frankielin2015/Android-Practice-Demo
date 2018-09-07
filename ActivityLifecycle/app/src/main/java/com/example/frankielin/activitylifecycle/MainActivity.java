package com.example.frankielin.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate Finished",Toast.LENGTH_SHORT).show();
        Log.d("Mainactivity","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart Finished",Toast.LENGTH_SHORT).show();
        Log.d("Mainactivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume Finished",Toast.LENGTH_SHORT).show();
        Log.d("Mainactivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause Finished",Toast.LENGTH_SHORT).show();
        Log.d("Mainactivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop Finished",Toast.LENGTH_SHORT).show();
        Log.d("Mainactivity","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart Finished",Toast.LENGTH_SHORT).show();
        Log.d("Mainactivity","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy Finished",Toast.LENGTH_SHORT).show();
        Log.d("Mainactivity","onDestroy");
    }
}
