package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice; //The dice image in xml as variable
    private ImageView imageViewDice2;
    private ImageView imageViewDice3;


    private Random rng = new Random(); //Random number generator

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice2 = findViewById(R.id.image_view_dice2);
        imageViewDice3 = findViewById(R.id.image_view_dice3);

        final Button btnRoll = findViewById(R.id.btn_Roll);
        final Button btnRoll2 = findViewById(R.id.btn_Roll2);

        final Button btnRoll_2 = findViewById(R.id.btn_Roll_2);
        final Button btnRoll_3 = findViewById(R.id.btn_Roll_3);

        imageViewDice2.setVisibility(View.INVISIBLE);
        imageViewDice3.setVisibility(View.INVISIBLE);

        btnRoll.setVisibility(View.VISIBLE);
        btnRoll2.setVisibility(View.GONE);

        btnRoll_3.setVisibility(View.INVISIBLE);

        Timer timer = new Timer(true);


        btnRoll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        rollDice(); //RNG Dice roller from a separate method
                        btnRoll.setEnabled(false);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                btnRoll.setEnabled(true);
                            }
                        },2000);

                    }
                }

        );


        btnRoll2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {




                        rollDice2(); //RNG Dice roller from a separate method
                        rollDice3(); //RNG DICE roller from a separate method
                        btnRoll2.setEnabled(false);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                btnRoll2.setEnabled(true);
                            }
                        },2000);

                    }
                }
        );

        btnRoll_2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imageViewDice.setVisibility(View.INVISIBLE);
                        imageViewDice2.setVisibility(View.VISIBLE);
                        imageViewDice3.setVisibility(View.VISIBLE);

                        btnRoll_2.setVisibility(View.INVISIBLE);
                        btnRoll_3.setVisibility(View.VISIBLE);

                        btnRoll.setVisibility(View.GONE);
                        btnRoll2.setVisibility(View.VISIBLE);


                    }
                }
        );

        btnRoll_3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imageViewDice.setVisibility(View.VISIBLE);
                        imageViewDice2.setVisibility(View.INVISIBLE);
                        imageViewDice3.setVisibility(View.INVISIBLE);

                        btnRoll_2.setVisibility(View.VISIBLE);
                        btnRoll_3.setVisibility(View.INVISIBLE);

                        btnRoll.setVisibility(View.VISIBLE);
                        btnRoll2.setVisibility(View.GONE);
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

    private void rollDice2() {
        int randomNumber2 = rng.nextInt(6) + 1;

        switch (randomNumber2) {
            case 1:
                imageViewDice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice2.setImageResource(R.drawable.dice6);
                break;

        }
    }

    private void rollDice3() {
        int randomNumber3 = rng.nextInt(6) + 1;

        switch (randomNumber3) {
            case 1:
                imageViewDice3.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice3.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice3.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice3.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice3.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice3.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
