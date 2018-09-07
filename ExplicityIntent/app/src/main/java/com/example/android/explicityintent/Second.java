package com.example.android.explicityintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        result = (TextView)findViewById(R.id.result);

        Bundle b1 = getIntent().getExtras();
        String s1 = b1.getString("user");
        result.setText(s1);
    }
}
