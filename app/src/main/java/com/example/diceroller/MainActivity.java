package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice; //The dice image in xml as variable
    private Random rng = new Random(); //Random number generator

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        final ImageView imageViewDice2 = findViewById(R.id.image_view_dice2);
        final ImageView imageViewDice3 = findViewById(R.id.image_view_dice3);
        final Button btnRoll = findViewById(R.id.btn_Roll);
        final Button btnRoll2 = findViewById(R.id.btn_Roll2);
        final Button btnRoll3 = findViewById(R.id.btn_Roll3);

        imageViewDice2.setVisibility(View.INVISIBLE);
        imageViewDice3.setVisibility(View.INVISIBLE);

        btnRoll3.setVisibility(View.INVISIBLE);

        btnRoll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        try{
                        Thread.sleep(2000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } //Delay 2 seconds


                        rollDice(); //RNG Dice roller from a separate method

                    }
                }
        );

        btnRoll2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imageViewDice.setVisibility(View.INVISIBLE);
                        imageViewDice2.setVisibility(View.VISIBLE);
                        imageViewDice3.setVisibility(View.VISIBLE);

                        btnRoll2.setVisibility(View.INVISIBLE);
                        btnRoll3.setVisibility(View.VISIBLE);
                    }
                }
        );

        btnRoll3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imageViewDice.setVisibility(View.VISIBLE);
                        imageViewDice2.setVisibility(View.INVISIBLE);
                        imageViewDice3.setVisibility(View.INVISIBLE);

                        btnRoll2.setVisibility(View.VISIBLE);
                        btnRoll3.setVisibility(View.INVISIBLE);
                    }
                }
        );

    }

    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;
        //random number selected according to dice number

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                break;

        }
    }
}
