package com.example.android.intentchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class paraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para);

        Intent it = getIntent();
        Bundle extras = it.getExtras();
        String paraTxt = extras.getString(MainActivity.EXTRA_MESSAGE);
        int code = extras.getInt(MainActivity.EXTRA_CONTENT);
        TextView paraText = (TextView)findViewById(R.id.para_content);
        TextView headerText = (TextView)findViewById(R.id.para_header);

        if(code == 1){
            headerText.setText("Paragraph Content 1");
        }
        else if(code == 2){
            headerText.setText("Paragraph Content 2");
        }
        else{
            headerText.setText("Paragraph Content 3");
        }
        paraText.setText(paraTxt);
    }
}
