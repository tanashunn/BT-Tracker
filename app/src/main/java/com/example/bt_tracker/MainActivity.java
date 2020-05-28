package com.example.bt_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToLogActivity(View view) {
        Intent tolog =new Intent(this,LogActivity.class);
        startActivity(tolog);
    }

    public void gotoNormalActivity(View view) {
        Intent toNormal = new Intent(this, NormalActivity.class);
        startActivity(toNormal);
    }

    public void gotoMechanismActivity(View view) {
        Intent toMechanism = new Intent(this,MechanismActivity.class);
        startActivity(toMechanism);
    }

    public void gotoLink2(View view) {
        Intent toLink2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.healthline.com/health/how-to-break-a-fever"));

        startActivity(toLink2);
    }
}

