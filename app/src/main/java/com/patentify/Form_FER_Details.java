package com.patentify;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class Form_FER_Details extends AppCompatActivity {

    TextView switchPopUp;
    Button SubmitSave;

    private Button req_date_pick_btn, res_date_pick_btn;
    private TextView req_date_picked_text, res_date_picked_text;

    SwitchMaterial Status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_fer_details);

        req_date_pick_btn= findViewById(R.id.btPickDateRequest);
        res_date_pick_btn= findViewById(R.id.btPickDateResponse);

        req_date_picked_text= findViewById(R.id.dateTextRequest);
        res_date_picked_text= findViewById(R.id.dateTextResponse);

        MaterialDatePicker.Builder materialDateBuilder = MaterialDatePicker.Builder.datePicker();
        MaterialDatePicker.Builder materialDateBuilder2 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder.setTitleText("SELECT A DATE");
        materialDateBuilder2.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker = materialDateBuilder.build();
        final MaterialDatePicker materialDatePicker2 = materialDateBuilder.build();

        req_date_pick_btn.setOnClickListener(
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

                        req_date_picked_text.setText(materialDatePicker.getHeaderText());

                    }
                });

        res_date_pick_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker2.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker2.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        res_date_picked_text.setText(materialDatePicker2.getHeaderText());

                    }
                });

        SubmitSave=findViewById(R.id.btnSubmit);
        switchPopUp = (TextView) findViewById(R.id.switch1_popup);
        Status = (SwitchMaterial) findViewById(R.id.switch1);
        Status.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Form_FER_Details.this);
                    builder.setCancelable(true);
                    builder.setTitle("Status changed!");
                    builder.setMessage("FER status will be set as RECEIVED if you select OK.");

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
                    AlertDialog.Builder builder = new AlertDialog.Builder(Form_FER_Details.this);
                    builder.setCancelable(true);
                    builder.setTitle("Status changed!");
                    builder.setMessage("FER status will be set as NOT RECEIVED if you select OK.");

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
                Toast.makeText(Form_FER_Details.this,"Details Saved!",Toast.LENGTH_SHORT).show();
            }
        });
    }



}