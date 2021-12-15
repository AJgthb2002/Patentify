package com.patentify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class UpdateMenuActivity extends AppCompatActivity {
    androidx.cardview.widget.CardView cd1, cd2, cd3, cd4, cd5;
    TextView textApplicationNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_menu);

        String appl_no = getIntent().getStringExtra("extra");
        textApplicationNum= findViewById(R.id.textApplicationNum);
        textApplicationNum.setText("Application no. "+appl_no);

        cd1 = findViewById(R.id.card1);
        cd2 = findViewById(R.id.card2);
        cd3 = findViewById(R.id.card3);
        cd4 = findViewById(R.id.card4);
        cd5 = findViewById(R.id.card5);

        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"card1 clicked",Toast.LENGTH_SHORT).show();
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"card2 clicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(UpdateMenuActivity.this, Form_Publication_Details.class);
                startActivity(intent);
            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"card3 clicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(UpdateMenuActivity.this, Form_FER_Details.class);
                startActivity(intent);
            }
        });

        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"card4 clicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(UpdateMenuActivity.this, Form_Hearing_Details.class);
                startActivity(intent);
            }
        });

        cd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"card5 clicked",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(UpdateMenuActivity.this, Form_Grant_details.class);
                startActivity(intent);
            }
        });


    }


}