package com.cse.cse_project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Fix for the NullPointerException crash
        if (findViewById(R.id.main) != null) {
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        // Initialize UI Elements
        EditText emailField = findViewById(R.id.etAdminEmail);
        EditText passwordField = findViewById(R.id.etAdminPassword);
        Button signInBtn = findViewById(R.id.btnAdminSignIn);

        signInBtn.setOnClickListener(v -> {
            String email = emailField.getText().toString();
            if (email.isEmpty()) {
                Toast.makeText(this, "Please enter your ID", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Welcome, Admin " + email, Toast.LENGTH_SHORT).show();
            }
        });
    }
}