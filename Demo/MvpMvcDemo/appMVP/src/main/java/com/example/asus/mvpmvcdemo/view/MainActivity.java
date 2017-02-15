package com.example.asus.mvpmvcdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.asus.mvpmvcdemo.R;
import com.example.asus.mvpmvcdemo.model.User;
import com.example.asus.mvpmvcdemo.presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements ILoginView{

    private EditText userName;
    private EditText password;
    private Button btnLogin;
    private Button btnClear;

    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.user_name);
        password = (EditText) findViewById(R.id.password);

        userName.setInputType(InputType.TYPE_NULL);
        password.setInputType(InputType.TYPE_NULL);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnClear = (Button) findViewById(R.id.btnClear);

        loginPresenter = new LoginPresenter(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.login();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public String getUserName() {
        return userName.getText()+"";
    }

    @Override
    public String getPassword() {
        return password.getText()+"";
    }

    @Override
    public void showSuccess(User user) {
        Toast.makeText(this,user.getUserName()+",login success",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFaileError() {
        Toast.makeText(this,"login faile",Toast.LENGTH_SHORT).show();
    }
}
