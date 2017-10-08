package com.nyctransit.morrislaw.nyctransitupdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ImageButton oneTrainButton;
    private ImageButton twoTrainButton;
    private ImageButton threeTrainButton;
    private ImageButton fourTrainButton;
    private ImageButton fiveTrainButton;
    private ImageButton sixTrainButton;
    private ImageButton sevenTrainButton;
    private ImageButton aTrainButton;
    private ImageButton bTrainButton;
    private ImageButton cTrainButton;
    private ImageButton dTrainButton;
    private ImageButton eTrainButton;
    private ImageButton fTrainButton;
    private ImageButton gTrainButton;
    private ImageButton hTrainButton;
    private ImageButton jTrainButton;
    private ImageButton lTrainButton;
    private ImageButton mTrainButton;
    private ImageButton nTrainButton;
    private ImageButton qTrainButton;
    private ImageButton rTrainButton;
    private ImageButton sTrainButton;
    private ImageButton tTrainButton;
    private ImageButton wTrainButton;
    private ImageButton zTrainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);

        // When the 1 train logo, image button is selected.
        oneTrainButton = (ImageButton) findViewById(R.id.imageButtonOne);
        oneTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the 2 train logo, image button is selected.
        twoTrainButton = (ImageButton) findViewById(R.id.imageButtonTwo);
        twoTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the 3 train logo, image button is selected.
        threeTrainButton = (ImageButton) findViewById(R.id.imageButtonThree);
        threeTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the 4 train logo, image button is selected.
        fourTrainButton = (ImageButton) findViewById(R.id.imageButtonFour);
        fourTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the 5 train logo, image button is selected.
        fiveTrainButton = (ImageButton) findViewById(R.id.imageButtonFive);
        fiveTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the 6 train logo, image button is selected.
        sixTrainButton = (ImageButton) findViewById(R.id.imageButtonSix);
        sixTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the 6 train logo, image button is selected.
        sevenTrainButton = (ImageButton) findViewById(R.id.imageButtonSeven);
        sevenTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the A train logo, image button is selected.
        aTrainButton = (ImageButton) findViewById(R.id.imageButtonA);
        aTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the C train logo, image button is selected.
        cTrainButton = (ImageButton) findViewById(R.id.imageButtonC);
        cTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the E train logo, image button is selected.
        eTrainButton = (ImageButton) findViewById(R.id.imageButtonE);
        eTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the B train logo, image button is selected.
        bTrainButton = (ImageButton) findViewById(R.id.imageButtonB);
        bTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the D train logo, image button is selected.
        dTrainButton = (ImageButton) findViewById(R.id.imageButtonD);
        dTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the F train logo, image button is selected.
        fTrainButton = (ImageButton) findViewById(R.id.imageButtonF);
        fTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the M train logo, image button is selected.
        mTrainButton = (ImageButton) findViewById(R.id.imageButtonM);
        mTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the N train logo, image button is selected.
        nTrainButton = (ImageButton) findViewById(R.id.imageButtonN);
        nTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the Q train logo, image button is selected.
        qTrainButton = (ImageButton) findViewById(R.id.imageButtonQ);
        qTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the R train logo, image button is selected.
        rTrainButton = (ImageButton) findViewById(R.id.imageButtonR);
        rTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the W train logo, image button is selected.
        wTrainButton = (ImageButton) findViewById(R.id.imageButtonW);
        wTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the J train logo, image button is selected.
        jTrainButton = (ImageButton) findViewById(R.id.imageButtonJ);
        jTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the Z train logo, image button is selected.
        zTrainButton = (ImageButton) findViewById(R.id.imageButtonZ);
        zTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the H train logo, image button is selected.
        hTrainButton = (ImageButton) findViewById(R.id.imageButtonH);
        hTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the S train logo, image button is selected.
        sTrainButton = (ImageButton) findViewById(R.id.imageButtonSBlue);
        sTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the L train logo, image button is selected.
        lTrainButton = (ImageButton) findViewById(R.id.imageButtonL);
        lTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the T train logo, image button is selected.
        tTrainButton = (ImageButton) findViewById(R.id.imageButtonT);
        tTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // When the G train logo, image button is selected.
        gTrainButton = (ImageButton) findViewById(R.id.imageButtonG);
        gTrainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TrainLineStatusActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}