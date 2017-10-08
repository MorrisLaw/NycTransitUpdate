package com.nyctransit.morrislaw.nyctransitupdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class TrainLineStatusActivity extends AppCompatActivity {

    private ImageButton prevPageImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_line_status);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        prevPageImageButton = (ImageButton) findViewById(R.id.imageButtonPrevPage);
        prevPageImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrainLineStatusActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
