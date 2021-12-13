package com.patentify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.content.Intent;
import android.os.Handler;
import android.text.Editable;
import android.widget.Button;
import com.google.android.material.textfield.TextInputLayout;
import android.os.Bundle;
import android.text.TextWatcher;
import android.widget.ProgressBar;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout textUsernameLayout;
    private TextInputLayout textPasswordInput;
    private Button loginAdminButton;
    private Button loginUserButton;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textUsernameLayout = findViewById(R.id.textUsernameLayout);
        textPasswordInput = findViewById(R.id.textPasswordInput);
        loginAdminButton = findViewById(R.id.loginAdminButton);
        loginUserButton = findViewById(R.id.loginUserButton);
        progressBar = findViewById(R.id.progressBar);

        textUsernameLayout
                .getEditText()
                .addTextChangedListener(createTextWatcher(textUsernameLayout));

        textPasswordInput
                .getEditText()
                .addTextChangedListener(createTextWatcher(textPasswordInput));

        loginAdminButton.setOnClickListener(v -> onLoginAdminClicked());
//        loginUserButton.setOnClickListener(v -> onLoginUserClicked());
    }

    private void onLoginAdminClicked() {
        String username = textUsernameLayout.getEditText().getText().toString();
        String password = textPasswordInput.getEditText().getText().toString();
        if (username.isEmpty()) {
            textUsernameLayout.setError("Username must not be empty");
        } else if (password.isEmpty()) {
            textPasswordInput.setError("Password must not be empty");
        } else if (!username.equals("admin") || !password.equals("admin")) {
            showErrorDialog();
        } else {
            performLogin();
        }
    }

    private TextWatcher createTextWatcher(TextInputLayout textPasswordInput) {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s,
                                          int start, int count, int after) {
                // not needed
            }

            @Override
            public void onTextChanged(CharSequence s,
                                      int start, int before, int count) {
                textPasswordInput.setError(null);
            }

            @Override
            public void afterTextChanged(Editable s) {
                // not needed
            }
        };
    }

    private void showErrorDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Login Failed")
                .setMessage("Username or password is not correct. Please try again.")
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                .show();
    }

    private void performLogin() {
        textUsernameLayout.setEnabled(false);
        textPasswordInput.setEnabled(false);
        loginAdminButton.setVisibility(View.INVISIBLE);
        loginUserButton.setVisibility(View.INVISIBLE);
        progressBar.setVisibility(View.VISIBLE);
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            startAdminMenuActivity();
            finish();
        }, 2000);

    }

    private void startAdminMenuActivity() {
        Intent intent = new Intent(this, AdminMenuActivity.class);
        startActivity(intent);
    }
}