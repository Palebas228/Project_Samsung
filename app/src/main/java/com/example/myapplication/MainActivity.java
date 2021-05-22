package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    MediaPlayer mpPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mpPlayer= MediaPlayer.create(this, R.raw.main);
        mpPlayer.start();
    }

    public void StartNewGame(View view) {
        Intent intent = new Intent(this, DisplayMessage_Activity.class);
        //intent.putExtra("inNew", true);
        startActivity(intent);
        mpPlayer.stop();
    }

    public void Exited(View view) {
        MainActivity.this.finish();
    }
}