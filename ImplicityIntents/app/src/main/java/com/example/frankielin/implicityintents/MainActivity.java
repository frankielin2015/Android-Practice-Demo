package com.example.frankielin.implicityintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mWebsiteEditText;
    private EditText mLocationEditText;
    private EditText mShareTextEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebsiteEditText = (EditText)findViewById(R.id.website_edittext);
        mLocationEditText = (EditText)findViewById(R.id.location_edittext);
        mShareTextEditText = (EditText)findViewById(R.id.share_edittext);
    }

    public void openWebsite(View view) {

        // Get the URL text from user input
        String url = mWebsiteEditText.getText().toString();

        // Parse the URI and create intent
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW,webpage);

        //There is at least one app can handle my implicity intent
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents","Can't handle this!");
        }
    }

    public void openLocation(View view) {

        // Get the location text from user input
        String loc = mLocationEditText.getText().toString();

        // Parse location and create intent
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents","Can't handle this!");
        }
    }

    public void shareText(View view) {
        String txt = mShareTextEditText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with: ")
                .setText(txt).startChooser();
    }
}
