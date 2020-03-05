package com.example.sayali.farmerauction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class AdminCategoryActivity extends AppCompatActivity {

    ImageView cereals ,vegetables;
    ImageView fruits,pulses;
    ImageView spices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        cereals=findViewById(R.id.cereals);
        vegetables=findViewById(R.id.vegetables);
        fruits=findViewById(R.id.fruits);
        pulses=findViewById(R.id.pulses);
        spices=findViewById(R.id.spices);

        cereals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(AdminCategoryActivity.this,AdminAddNPActivity.class);
                a.putExtra("category","cereals");
                startActivity(a);
            }
        });
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(AdminCategoryActivity.this,AdminAddNPActivity.class);
                a.putExtra("category","vegetables");
                startActivity(a);
            }
        });
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(AdminCategoryActivity.this,AdminAddNPActivity.class);
                a.putExtra("category","fruits");
                startActivity(a);
            }
        });
        pulses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(AdminCategoryActivity.this,AdminAddNPActivity.class);
                a.putExtra("category","pulses");
                startActivity(a);
            }
        });
        spices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(AdminCategoryActivity.this,AdminAddNPActivity.class);
                a.putExtra("category","spices");
                startActivity(a);
            }
        });
    }
}


