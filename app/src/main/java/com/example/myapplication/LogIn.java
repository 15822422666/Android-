package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class LogIn extends AppCompatActivity {

    private SharedPreferences preferences;

    private SharedPreferences.Editor editor;

    private EditText accountEdit;

    private EditText passwordEdit;

    private Button login;

    private CheckBox rememberPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        accountEdit = findViewById(R.id.userAccount_edit);
        passwordEdit = findViewById(R.id.userPassword_edit);
        rememberPass = findViewById(R.id.remember_pass);
        login = findViewById(R.id.logIn_button);
        boolean isRemember = preferences.getBoolean("remember_password", false);
        if (isRemember) {
            String account = preferences.getString("account", "");
            String password = preferences.getString("password", "");
            accountEdit.setText(account);
            passwordEdit.setText(password);
            rememberPass.setChecked(true);
        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = accountEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                if (account.equals("admin") && password.equals("123456")) {
              /*      editor = preferences.edit();
                    if (rememberPass.isChecked()) {
                        editor.putBoolean("remember_password", true);
                        editor.putString("account", account);
                        editor.putString("password", password);
                    } else {
                        editor.clear();
                    }
                    editor.apply();*/
                    Intent intent = new Intent(LogIn.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LogIn.this, "账号或密码错误", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
