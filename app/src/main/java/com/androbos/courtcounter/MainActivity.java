package com.androbos.courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                TextView scoreA = (TextView)findViewById(R.id.ScoreTeamA);
                scoreA.setText(String.valueOf(scoreTeamA));
                TextView scoreB = (TextView)findViewById(R.id.ScoreTeamB);
                scoreB.setText(String.valueOf(scoreTeamB));
            }
        });
        Button stop = (Button)findViewById(R.id.stop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("1",String.valueOf(scoreTeamA));
                intent.putExtra("2",String.valueOf(scoreTeamB));
                startActivity(intent);
            }
        });

    }
    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }
    public void tambah3PointA (View v){
        scoreTeamA = scoreTeamA+3;
        displayTeamA(scoreTeamA);
    }
    public void tambah2PointA(View v){
        scoreTeamA = scoreTeamA+2;
        displayTeamA(scoreTeamA);
    }
    public void tambah1PointA(View v){
        scoreTeamA = scoreTeamA+1;
        displayTeamA(scoreTeamA);
    }
    public void tambah3PointB (View v){
        scoreTeamB = scoreTeamB+3;
        displayTeamB(scoreTeamB);
    }
    public void tambah2PointB(View v){
        scoreTeamB = scoreTeamB+2;
        displayTeamB(scoreTeamB);
    }
    public void tambah1Pointb(View v){
        scoreTeamB = scoreTeamB+1;
        displayTeamB(scoreTeamB);
    }

    public void displayTeamA(int angka){
        TextView scoreTeamA = (TextView)findViewById(R.id.ScoreTeamA);
        scoreTeamA.setText(String.valueOf(angka));
    }
    public void displayTeamB(int angka){
        TextView scoreTeamB = (TextView)findViewById(R.id.ScoreTeamB);
        scoreTeamB.setText(String.valueOf(angka));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
