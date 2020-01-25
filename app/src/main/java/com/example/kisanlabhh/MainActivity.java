package com.example.kisanlabhh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_fruits,btn_veg,btn_pulses,btn_grains,btn_mushrooms,btn_flowers,btn_dairy,btn_spices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_fruits=(Button)findViewById(R.id.buttonFruits);
        btn_veg=(Button)findViewById(R.id.buttonProfile);
        btn_pulses=(Button)findViewById(R.id.buttonPulses);
        btn_grains=(Button)findViewById(R.id.buttonGrains);
        btn_mushrooms=(Button)findViewById(R.id.buttonMushroom);
        btn_flowers=(Button)findViewById(R.id.buttonFlower);
        btn_dairy=(Button)findViewById(R.id.buttonDairy);
        btn_spices=(Button)findViewById(R.id.buttonSpice);



        btn_fruits.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View view) {

                Toast.makeText(MainActivity.this, "fruits category", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        btn_veg.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View view) {

                Toast.makeText(MainActivity.this, "vegetables category", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        btn_pulses.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View view) {

                Toast.makeText(MainActivity.this, "pulses category", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        btn_grains.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View view) {

                Toast.makeText(MainActivity.this, "grains category", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        btn_flowers.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View view) {

                Toast.makeText(MainActivity.this, "flowers category", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        btn_mushrooms.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View view) {

                Toast.makeText(MainActivity.this, "mushrooms category", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        btn_spices.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View view) {

                Toast.makeText(MainActivity.this, "spicess category", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        btn_dairy.setOnContextClickListener(new View.OnContextClickListener() {
            @Override
            public boolean onContextClick(View view) {

                Toast.makeText(MainActivity.this, "dairy category", Toast.LENGTH_SHORT).show();
                return true;
            }
        });



    }
}
