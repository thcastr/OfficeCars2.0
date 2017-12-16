package com.example.thayn.officecars;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.*;
import android.view.View;

public class SplashScreen extends AppCompatActivity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        IniciaSplashScreen();
    }

    public void IniciaSplashScreen(){

        setContentView(R.layout.activity_splash_screen);

        new Thread(new Runnable() {

            @Override
            public void run() {

                counter ++;

                try{
                    while (counter == 1 || counter <= 4){

                        Thread.sleep(900);
                        counter++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (counter == 5){

                    Intent intent = new Intent(SplashScreen.this, Login.class);
                    startActivity(intent);

                    counter++;
                }

            }
        }).start();
    }
}
