package com.biginsect.broadcastbestpractice;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by administration on 2016/7/30.
 */
public class LoginActivity extends BaseActivity {

    private EditText acountEdit;
    private EditText passwordEdit;
    private Button button_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        acountEdit = (EditText)findViewById(R.id.account);
        passwordEdit = (EditText)findViewById(R.id.password);
        button_login = (Button)findViewById(R.id.button_login);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account = acountEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                //帐号admin 密码123
                if (account.equals("admin") && password.equals("123")){
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(LoginActivity.this,"account or password is inavalid",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
