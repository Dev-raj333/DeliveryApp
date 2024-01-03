package com.example.deliveryapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.deliveryapp.R;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        loginBtn = findViewById(R.id.loginButton);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isInputValid()){
                    String uName = username.getText().toString();
                    String pass = password.getText().toString();
                    loginPerformed(uName,pass);
                }else{
                    Toast.makeText(LoginActivity.this,"Fill all the field", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private boolean isInputValid(){
        return !username.getText().toString().trim().isEmpty() && !password.getText().toString().trim().isEmpty();
    }
    private void loginPerformed(String username, String password){
        if(username.equals("admin") && password.equals("123456")){
            Toast.makeText(this,"Successfully Logged in", Toast.LENGTH_SHORT ).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Password or username incorrect", Toast.LENGTH_SHORT).show();
        }
    }
}