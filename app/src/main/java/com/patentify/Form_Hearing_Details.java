package com.patentify;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class Form_Hearing_Details extends AppCompatActivity {

    TextView switchPopUp;
    Button SubmitSave;

    private Button pick_date_btn;
    private TextView picked_date_text;

    SwitchMaterial Status1;
    SwitchMaterial Status2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_hearing_details);

        pick_date_btn= findViewById(R.id.btPickDate);
        picked_date_text= findViewById(R.id.dateText);

        MaterialDatePicker.Builder materialDateBuilder = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker = materialDateBuilder.build();

        pick_date_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        picked_date_text.setText(materialDatePicker.getHeaderText());

                    }
                });

        SubmitSave=findViewById(R.id.btnSubmit);
        switchPopUp = (TextView) findViewById(R.id.switch1_popup);
        Status1 = findViewById(R.id.switch1);
        Status2 = findViewById(R.id.switch2);

        Status1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Form_Hearing_Details.this);
                    builder.setCancelable(true);
                    builder.setTitle("Status changed!");
                    builder.setMessage("Hearing status will be set as DATE RECEIVED if you select OK.");

                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();

                        }
                    });
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switchPopUp.setVisibility(View.VISIBLE);
                        }
                    });

                    builder.show();
                }
                if(!isChecked){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Form_Hearing_Details.this);
                    builder.setCancelable(true);
                    builder.setTitle("Status changed!");
                    builder.setMessage("Hearing status will be set as DATE NOT RECEIVED if you select OK.");

                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
//                            switchPopUp.setVisibility(View.INVISIBLE);
                        }
                    });
                    builder.show();
                }
            }
        });

        Status2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Form_Hearing_Details.this);
                    builder.setCancelable(true);
                    builder.setTitle("Status changed!");
                    builder.setMessage("Hearing status will be set as HEARING DONE if you select OK.");

                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();

                        }
                    });
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switchPopUp.setVisibility(View.VISIBLE);
                        }
                    });

                    builder.show();
                }
                if(!isChecked){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Form_Hearing_Details.this);
                    builder.setCancelable(true);
                    builder.setTitle("Status changed!");
                    builder.setMessage("Hearing status will be set as HEARING NOT DONE if you select OK.");

                    builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
//                            switchPopUp.setVisibility(View.INVISIBLE);
                        }
                    });
                    builder.show();
                }
            }
        });


        SubmitSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Form_Hearing_Details.this,"Details Saved!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}