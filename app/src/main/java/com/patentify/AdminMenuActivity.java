package com.patentify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AdminMenuActivity extends AppCompatActivity {

    Button update_app_button;
    Button add_app_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);

        update_app_button= findViewById(R.id.update_application);
        update_app_button.setOnClickListener(v -> onUpdateAppClicked());

        add_app_button= findViewById(R.id.add_application);
        add_app_button.setOnClickListener(v -> onAddAppClicked());
    }
    private void onUpdateAppClicked(){
        Intent intent = new Intent(AdminMenuActivity.this, CheckApplicationNum.class);
        startActivity(intent);
    }

    private void onAddAppClicked(){
        Intent intent = new Intent(AdminMenuActivity.this, Form_Add_New.class);
        startActivity(intent);
    }
}