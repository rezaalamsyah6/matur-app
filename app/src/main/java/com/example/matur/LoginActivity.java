package com.example.matur;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;



import androidx.appcompat.app.AppCompatActivity;



public class LoginActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    EditText edtNim;
    EditText edtPassword;
    Button btnLogin;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtNim = findViewById(R.id.edt_nim);
        edtPassword = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
        btnLogin.setOnLongClickListener(this);
    }

    @Override
    public boolean onLongClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        return true;
    }

    @Override
    public void onClick(View v) {

    }
}
