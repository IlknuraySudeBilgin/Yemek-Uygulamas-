package com.example.yemeksiparisokulprojesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class YiyecekCesitleriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yiyecek_cesitleri);




        //logout icin gerekli kodu yazalım
        CardView cikis=findViewById(R.id.cardvLogout);
        cikis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(YiyecekCesitleriActivity.this,LoginActivity.class);
            }
        });


        CardView burger=findViewById(R.id.cardvBurger);
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YiyecekCesitleriActivity.this,BurgerActivity.class));
            }
        });


        CardView pizza=findViewById(R.id.cardvPizza);
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YiyecekCesitleriActivity.this,PizzaActivity.class));
            }
        });

        CardView doner=findViewById(R.id.cardvDoner);
        doner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YiyecekCesitleriActivity.this,DonerActivity.class));
            }
        });

        CardView kebap=findViewById(R.id.cardvKebap);
        kebap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YiyecekCesitleriActivity.this,KebapActivity2.class));
            }
        });

        CardView tatli=findViewById(R.id.cardvTatli);
        tatli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YiyecekCesitleriActivity.this,TatliActivity.class));
            }
        });

        CardView icecek=findViewById(R.id.cardvIcecek);
        icecek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YiyecekCesitleriActivity.this,IcecekActivity.class));
            }
        });



    }
}