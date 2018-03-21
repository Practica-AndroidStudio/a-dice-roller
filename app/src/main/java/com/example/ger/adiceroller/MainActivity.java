package com.example.ger.adiceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ger.dice.Dice;

public class MainActivity extends AppCompatActivity {

    private TextView tvDiceResult;
    private Dice d20 = new Dice(20);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDiceResult = (TextView) findViewById(R.id.tvDiceResult);
    }

    public void rollDice(View view) {
        Integer diceResult = d20.roll();
        tvDiceResult.setText(String.valueOf(diceResult));
    }
}
