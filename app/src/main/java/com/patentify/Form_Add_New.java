package com.patentify;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

public class Form_Add_New extends AppCompatActivity {

    Spinner Status;
    RadioGroup InvoiceRecd, InvoiceFwd;
    RadioButton invRecd, invFwd;

    private Button btnProvisionalDate, btnCompleteDate, btnRequestForExamDate, btnPublicationDate,btnForm1Date,
            btnForm3Date,btnForm5Date, btnForm18Date, btnForm26Date, btnFERreceivedDate, btnFERresponseSubmittedDate,
            btnExaminationDate, btnGrantDate;
    private TextView ProvisionaldateText, CompletedateText, RequestForExamText, PublicationDateText, Form1Text,
            Form3Text, Form5Text, Form18Text, Form26Text, FERreceivedText, FERresponseSubmittedText, ExaminationText,
            GrantText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_add_new);

        EditText PAN=(EditText)findViewById(R.id.PAN);
        EditText Name=(EditText)findViewById(R.id.name);
        EditText Title=(EditText)findViewById(R.id.Title);

        RadioButton receivedYes=(RadioButton)findViewById(R.id.Received);
        RadioButton receivedNo=(RadioButton)findViewById(R.id.NotReceived);
        RadioButton forwardedYes=(RadioButton)findViewById(R.id.Forwarded);
        RadioButton forwardedNo=(RadioButton)findViewById(R.id.NotForwarded);
        InvoiceRecd = (RadioGroup) findViewById(R.id.InvoiceReceived);
        InvoiceFwd = (RadioGroup) findViewById(R.id.InvoiceForwarded);
        Button submitSave=(Button)findViewById(R.id.btnSubmit);

        submitSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pan=PAN.getText().toString();
                String name=Name.getText().toString();
                String title=Title.getText().toString();
                String Collector="";
                if (pan.isEmpty()){
                    Toast.makeText(Form_Add_New.this,"Please Enter Patent Application number",Toast.LENGTH_SHORT).show();
                }
                if (name.isEmpty()){
                    Toast.makeText(Form_Add_New.this,"Please Enter Applicant Name",Toast.LENGTH_SHORT).show();
                }
                if (title.isEmpty()){
                    Toast.makeText(Form_Add_New.this,"Please Enter Patent Title",Toast.LENGTH_SHORT).show();
                }
                Collector+=pan+"\n";
                Collector+=name+"\n";
                Collector+=title+"\n";
                Toast.makeText(Form_Add_New.this,"User Info \n:"+Collector,Toast.LENGTH_SHORT).show();
            }
        });


        btnProvisionalDate= findViewById(R.id.btnProvisionalDate);
        ProvisionaldateText= findViewById(R.id.ProvisionaldateText);

        MaterialDatePicker.Builder materialDateBuilder1 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder1.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker1 = materialDateBuilder1.build();

        btnProvisionalDate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker1.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker1.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        ProvisionaldateText.setText(materialDatePicker1.getHeaderText());

                    }
                });

        btnCompleteDate= findViewById(R.id.btnCompleteDate);
        CompletedateText= findViewById(R.id.CompletedateText);

        MaterialDatePicker.Builder materialDateBuilder2 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder2.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker2 = materialDateBuilder2.build();

        btnCompleteDate.setOnClickListener(
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

                        CompletedateText.setText(materialDatePicker2.getHeaderText());

                    }
                });

        btnRequestForExamDate= findViewById(R.id.btnRequestForExamDate);
        RequestForExamText= findViewById(R.id.RequestForExamText);

        MaterialDatePicker.Builder materialDateBuilder3 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder3.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker3 = materialDateBuilder3.build();

        btnRequestForExamDate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker3.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker3.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        RequestForExamText.setText(materialDatePicker3.getHeaderText());

                    }
                });

        btnPublicationDate= findViewById(R.id.btnPublicationDate);
        PublicationDateText= findViewById(R.id.PublicationDateText);

        MaterialDatePicker.Builder materialDateBuilder4 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder4.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker4 = materialDateBuilder4.build();

        btnPublicationDate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker4.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker4.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        PublicationDateText.setText(materialDatePicker4.getHeaderText());

                    }
                });

        btnForm1Date= findViewById(R.id.btnForm1Date);
        Form1Text= findViewById(R.id.Form1Text);

        MaterialDatePicker.Builder materialDateBuilder5 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder5.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker5 = materialDateBuilder5.build();

        btnForm1Date.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker5.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker5.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        Form1Text.setText(materialDatePicker5.getHeaderText());

                    }
                });

        btnForm3Date= findViewById(R.id.btnForm3Date);
        Form3Text= findViewById(R.id.Form3Text);

        MaterialDatePicker.Builder materialDateBuilder6 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder6.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker6 = materialDateBuilder6.build();

        btnForm3Date.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker6.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker6.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        Form3Text.setText(materialDatePicker6.getHeaderText());

                    }
                });

        btnForm5Date= findViewById(R.id.btnForm5Date);
        Form5Text= findViewById(R.id.Form5Text);

        MaterialDatePicker.Builder materialDateBuilder7 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder7.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker7 = materialDateBuilder7.build();

        btnForm5Date.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker7.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker7.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        Form5Text.setText(materialDatePicker7.getHeaderText());

                    }
                });

        btnForm18Date= findViewById(R.id.btnForm18Date);
        Form18Text= findViewById(R.id.Form18Text);

        MaterialDatePicker.Builder materialDateBuilder8 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder8.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker8 = materialDateBuilder8.build();

        btnForm18Date.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker8.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker8.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        Form18Text.setText(materialDatePicker8.getHeaderText());

                    }
                });

        btnForm26Date= findViewById(R.id.btnForm26Date);
        Form26Text= findViewById(R.id.Form26Text);

        MaterialDatePicker.Builder materialDateBuilder9 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder9.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker9 = materialDateBuilder9.build();

        btnForm26Date.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker9.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker9.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        Form26Text.setText(materialDatePicker9.getHeaderText());

                    }
                });

        btnFERreceivedDate= findViewById(R.id.btnFERreceivedDate);
        FERreceivedText= findViewById(R.id.FERreceivedText);

        MaterialDatePicker.Builder materialDateBuilder10 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder10.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker10 = materialDateBuilder10.build();

        btnFERreceivedDate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker10.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker10.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        FERreceivedText.setText(materialDatePicker10.getHeaderText());

                    }
                });

        btnFERresponseSubmittedDate=findViewById(R.id.btnFERresponseSubmittedDate);
        FERresponseSubmittedText= findViewById(R.id.FERresponseSubmittedText);

        MaterialDatePicker.Builder materialDateBuilder11 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder11.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker11 = materialDateBuilder11.build();

        btnFERresponseSubmittedDate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker11.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker11.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        FERresponseSubmittedText.setText(materialDatePicker11.getHeaderText());

                    }
                });

        btnExaminationDate= findViewById(R.id.btnExaminationDate);
        ExaminationText= findViewById(R.id.ExaminationText);

        MaterialDatePicker.Builder materialDateBuilder12 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder12.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker12 = materialDateBuilder12.build();

        btnExaminationDate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker12.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker12.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        ExaminationText.setText(materialDatePicker12.getHeaderText());

                    }
                });

        btnGrantDate=findViewById(R.id.btnGrantDate);
        GrantText= findViewById(R.id.GrantText);

        MaterialDatePicker.Builder materialDateBuilder13 = MaterialDatePicker.Builder.datePicker();
        materialDateBuilder13.setTitleText("SELECT A DATE");
        final MaterialDatePicker materialDatePicker13 = materialDateBuilder13.build();

        btnGrantDate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        materialDatePicker13.show(getSupportFragmentManager(), "MATERIAL_DATE_PICKER");
                    }
                });

        materialDatePicker13.addOnPositiveButtonClickListener(
                new MaterialPickerOnPositiveButtonClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onPositiveButtonClick(Object selection) {

                        GrantText.setText(materialDatePicker13.getHeaderText());

                    }
                });
    }
}