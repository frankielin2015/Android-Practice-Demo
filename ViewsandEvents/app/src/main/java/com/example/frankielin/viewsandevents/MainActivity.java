package com.example.frankielin.viewsandevents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Get reference of my views
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView)findViewById(R.id.t1);
        b1 = (Button)findViewById(R.id.b1);

        b1.setOnClickListener(this);

    }

    //handle event via event listener
    @Override
    public void onClick(View v) {
        t1.setText("You clicked Button 1!");
    }

    //handle event via XML
    // doSomething can be found in active_main.xml
    public void doSomething(View v) {
        t1.setText("You clicked Button 2!");

    }
}
