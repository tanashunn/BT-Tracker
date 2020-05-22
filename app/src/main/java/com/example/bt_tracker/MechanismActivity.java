package com.example.bt_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import static android.content.Intent.ACTION_VIEW;

public class MechanismActivity extends AppCompatActivity {

    private Object Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanism);
    }

    public void goToLink1(View view) {
        Intent toLink1 = new Intent(Intent,ACTION_VIEW, Uri.parse("https://science.howstuffworks.com/life/cellular-microscopic/question45.htm"));

        startActivity(toLink1);
    }
}
