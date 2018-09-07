package com.example.frankielin.shoppinglistbuilder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class item_list extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
    }

    public void returnReply(View view) {
        String item = "";
        Intent replyIntent = new Intent();
        switch (view.getId())
        {
            case R.id.cheese_bttn:
                // do something
                item = "Cheese";
                break;

            case R.id.rice_bttn:
                // do something
                item = "Rice";
                break;

            case R.id.apple_bttn:
                // do something
                item = "Apple";
                break;

            case R.id.orange_bttn:
                // do something
                item = "Orange";
                break;

            case R.id.beef_bttn:
                // do something
                item = "Beef";
                break;

            case R.id.chicken_bttn:
                // do something
                item = "Chicken";
                break;

            case R.id.oat_bttn:
                // do something
                item = "Oatmeal";
                break;

            case R.id.milk_bttn:
                // do something
                item = "Milk";
                break;

            case R.id.egg_bttn:
                // do something
                item = "Egg";
                break;

            case R.id.sushi_bttn:
                // do something
                item = "Sushi";
                break;
        }
        replyIntent.putExtra(EXTRA_REPLY,item);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}
