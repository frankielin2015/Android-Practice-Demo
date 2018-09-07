package com.example.android.intentchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.android.intentchallenge.extra.MESSAGE";
    public static final String EXTRA_CONTENT = "com.example.android.intentchallenge.extra.CONTENT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lunchParaActivity(View view) {
        Intent intent = new Intent(this,paraActivity.class);
        String content = "";
        int code = 0;
        switch (view.getId())
        {
            case R.id.text_button_one:
                //send first paragraph to second activity
                content = getString(R.string.first_para);
                code = 1;
                break;
            case R.id.text_button_two:
                //send second paragraph to second activity
                content = getString(R.string.second_para);
                code = 2;
                break;
            case R.id.text_button_three:
                //send third paragraph to second activity
                content = getString(R.string.third_para);
                code = 3;
                break;
        }

        Bundle extras = new Bundle();
        extras.putString(EXTRA_MESSAGE,content);
        extras.putInt(EXTRA_CONTENT,code);
        intent.putExtras(extras);
        startActivity(intent);
    }
}
