package com.example.frankielin.shoppinglistbuilder;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView item_one;
    private TextView item_two;
    private TextView item_three;
    private TextView item_four;
    private TextView item_five;
    private TextView item_six;
    private TextView item_seven;
    private TextView item_eight;
    private TextView item_nine;
    private TextView item_ten;
    public static final int CHOOSE_FOOD_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item_one = (TextView) findViewById(R.id.txt_one);
        item_two = (TextView) findViewById(R.id.txt_two);
        item_three = (TextView) findViewById(R.id.txt_three);
        item_four = (TextView) findViewById(R.id.txt_four);
        item_five = (TextView) findViewById(R.id.txt_five);
        item_six = (TextView) findViewById(R.id.txt_six);
        item_seven = (TextView) findViewById(R.id.txt_seven);
        item_eight = (TextView) findViewById(R.id.txt_eight);
        item_nine = (TextView) findViewById(R.id.txt_nine);
        item_ten = (TextView) findViewById(R.id.txt_ten);


        if (savedInstanceState != null) {
            boolean isVisible1 = savedInstanceState.getBoolean("reply_visible_one");
            boolean isVisible2 = savedInstanceState.getBoolean("reply_visible_two");
            boolean isVisible3 = savedInstanceState.getBoolean("reply_visible_three");
            boolean isVisible4 = savedInstanceState.getBoolean("reply_visible_four");
            boolean isVisible5 = savedInstanceState.getBoolean("reply_visible_five");
            boolean isVisible6 = savedInstanceState.getBoolean("reply_visible_six");
            boolean isVisible7 = savedInstanceState.getBoolean("reply_visible_seven");
            boolean isVisible8 = savedInstanceState.getBoolean("reply_visible_eight");
            boolean isVisible9 = savedInstanceState.getBoolean("reply_visible_nine");
            boolean isVisible10 = savedInstanceState.getBoolean("reply_visible_ten");

            if (isVisible1) {
                item_one.setVisibility(View.VISIBLE);
                item_one.setText(savedInstanceState.getString("reply_text_one"));
            }

            if (isVisible2) {
                item_two.setVisibility(View.VISIBLE);
                item_two.setText(savedInstanceState.getString("reply_text_two"));
            }

            if (isVisible3) {
                item_three.setVisibility(View.VISIBLE);
                item_three.setText(savedInstanceState.getString("reply_text_three"));
            }

            if (isVisible4) {
                item_four.setVisibility(View.VISIBLE);
                item_four.setText(savedInstanceState.getString("reply_text_four"));
            }

            if (isVisible5) {
                item_five.setVisibility(View.VISIBLE);
                item_five.setText(savedInstanceState.getString("reply_text_five"));
            }

            if (isVisible6) {
                item_six.setVisibility(View.VISIBLE);
                item_six.setText(savedInstanceState.getString("reply_text_six"));
            }


            if (isVisible7) {
                item_seven.setVisibility(View.VISIBLE);
                item_seven.setText(savedInstanceState.getString("reply_text_seven"));
            }

            if (isVisible8) {
                item_eight.setVisibility(View.VISIBLE);
                item_eight.setText(savedInstanceState.getString("reply_text_eight"));
            }


            if (isVisible9) {
                item_nine.setVisibility(View.VISIBLE);
                item_nine.setText(savedInstanceState.getString("reply_text_nine"));
            }

            if (isVisible10) {
                item_ten.setVisibility(View.VISIBLE);
                item_ten.setText(savedInstanceState.getString("reply_text_ten"));
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        if (item_one.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible_one", true);
            outState.putString("reply_text_one", item_one.getText().toString());
        }

        if (item_two.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible_two", true);
            outState.putString("reply_text_two", item_two.getText().toString());
        }

        if (item_three.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible_three", true);
            outState.putString("reply_text_three", item_three.getText().toString());
        }

        if (item_four.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible_four", true);
            outState.putString("reply_text_four", item_four.getText().toString());
        }

        if (item_five.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible_five", true);
            outState.putString("reply_text_five", item_five.getText().toString());
        }

        if (item_six.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible_six", true);
            outState.putString("reply_text_six", item_six.getText().toString());
        }

        if (item_seven.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible_seven", true);
            outState.putString("reply_text_seven", item_seven.getText().toString());
        }

        if (item_eight.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible_eight", true);
            outState.putString("reply_text_eight", item_eight.getText().toString());
        }

        if (item_nine.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible_nine", true);
            outState.putString("reply_text_nine", item_nine.getText().toString());
        }

        if (item_ten.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible_ten", true);
            outState.putString("reply_text_ten", item_ten.getText().toString());
        }

    }

    public void addItems(View view) {
        Intent intent = new Intent(this, item_list.class);
        startActivityForResult(intent, CHOOSE_FOOD_REQUEST);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CHOOSE_FOOD_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(item_list.EXTRA_REPLY);
                if (item_one.getText().toString().isEmpty()) {
                    item_one.setText(reply);
                    item_one.setVisibility(View.VISIBLE);
                    return;
                }

                if (item_two.getText().toString().isEmpty()) {
                    item_two.setText(reply);
                    item_two.setVisibility(View.VISIBLE);
                    return;
                }

                if (item_three.getText().toString().isEmpty()) {
                    item_three.setText(reply);
                    item_three.setVisibility(View.VISIBLE);
                    return;
                }

                if (item_four.getText().toString().isEmpty()) {
                    item_four.setText(reply);
                    item_four.setVisibility(View.VISIBLE);
                    return;
                }

                if (item_five.getText().toString().isEmpty()) {
                    item_five.setText(reply);
                    item_five.setVisibility(View.VISIBLE);
                    return;
                }

                if (item_six.getText().toString().isEmpty()) {
                    item_six.setText(reply);
                    item_six.setVisibility(View.VISIBLE);
                    return;
                }

                if (item_seven.getText().toString().isEmpty()) {
                    item_seven.setText(reply);
                    item_seven.setVisibility(View.VISIBLE);
                    return;
                }

                if (item_eight.getText().toString().isEmpty()) {
                    item_eight.setText(reply);
                    item_eight.setVisibility(View.VISIBLE);
                    return;
                }

                if (item_nine.getText().toString().isEmpty()) {
                    item_nine.setText(reply);
                    item_nine.setVisibility(View.VISIBLE);
                    return;
                }

                if (item_ten.getText().toString().isEmpty()) {
                    item_ten.setText(reply);
                    item_ten.setVisibility(View.VISIBLE);
                    return;
                }
            }
        }
    }
}
