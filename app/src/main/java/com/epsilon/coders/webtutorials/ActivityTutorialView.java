package com.epsilon.coders.webtutorials;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

public class ActivityTutorialView extends AppCompatActivity {
    String tutorialName;
    WebView webView;

    @Override
    public void onBackPressed() {

        finish();
        overridePendingTransition(R.anim.slide_out_left, R.anim.slide_out_right);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String str = getIntent().getExtras().getString("listValue");
        this.webView = ((WebView) findViewById(R.id.webView));
        this.webView.getSettings().setBuiltInZoomControls(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setAllowFileAccessFromFileURLs(true);
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
        //this.webView.loadUrl("file:///android_asset/" + str);
        if (savedInstanceState != null) {
            this.tutorialName = savedInstanceState.getString("TName");
            this.webView.loadUrl("file:///android_asset/" + str);
        }
        for (; ; ) {
            FloatingActionButton localFloatingActionButton = (FloatingActionButton)findViewById(R.id.fab);
            localFloatingActionButton.bringToFront();
            localFloatingActionButton.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View paramAnonymousView)
                {
                    Intent localIntent = new Intent("android.intent.action.SEND");
                    localIntent.setType("text/plain");
                    localIntent.putExtra("android.intent.extra.SUBJECT", "Learn Web Development");
                    localIntent.putExtra("android.intent.extra.TEXT", "This Application provides an PHP, CSS, CSS3, HTML, HTML5, JavaScript, jQuery, jQueryUI, AngularJS, Bootstrap, Python, MySQL, Ajax, Developer Guide and all topics cover Interview Questions https://play.google.com/store/apps/details?id=com.epsilon.coders.webtutorials");
                    ActivityTutorialView.this.startActivity(Intent.createChooser(localIntent, "Share via"));
                }
            });

            this.webView.loadUrl("file:///android_asset/" + str);
            return;
        }


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("listValue", this.tutorialName);
    }
}
