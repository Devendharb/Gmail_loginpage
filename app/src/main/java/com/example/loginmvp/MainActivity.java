package com.example.loginmvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainActivitycontract.View{


    MainActivitycontract.presenter presenter;
    TextView textview;
    EditText gmail,password;
    Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        presenter= new MainActivityPresenter(this);
        gmail=findViewById(R.id.gmail);
        password=findViewById(R.id.password);
        btn_login=findViewById(R.id.login);

        //btn login

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gmail1=gmail.getText().toString();
                String password1=password.getText().toString();
                        if(TextUtils.isEmpty(gmail1)||TextUtils.isEmpty(password1)){
                            onerror(" fields required");

                        }else{
                            presenter.dologin(gmail1,password1);
                        }
            }
        });
    }

    @Override
    public void onSuccess(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onerror(String mesage) {
        Toast.makeText(this,mesage,Toast.LENGTH_LONG).show();
    }
}