package com.patentify;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class CheckApplicationNum extends AppCompatActivity {
    private Button proceed;
    private TextInputLayout pat_appl_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_application_num);

        pat_appl_no=findViewById(R.id.ApplNoLayout);
        proceed= findViewById(R.id.proceedButton);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String appl_no_string = pat_appl_no.getEditText().getText().toString();
                if (appl_no_string.isEmpty()){
                    pat_appl_no.setError("Field must not be empty");
                }
                else if (!appl_no_string.equals("1001") ) {
                    showErrorDialog();
                }
                else{
                    proceedToUpdateMenu(appl_no_string);
                }


            }
        });


    }

    private void proceedToUpdateMenu(String appl_no_string){
        long appl_no =Long.parseLong(appl_no_string);
        // if appl_no is present in database then proceed to show edit options
        if (appl_no== 1001){
            Intent intent = new Intent(CheckApplicationNum.this, UpdateMenuActivity.class);
            intent.putExtra("extra", appl_no_string);
            startActivity(intent);
            finish();
        }
    }

    private void showErrorDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Record Not Found!")
                .setMessage("The application number was not found. Please try again.")
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                .show();
    }
}