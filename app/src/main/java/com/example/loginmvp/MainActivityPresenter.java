package com.example.loginmvp;

public class MainActivityPresenter implements MainActivitycontract.presenter{

    MainActivitycontract.View view;

    public MainActivityPresenter(MainActivitycontract.View view) {
        this.view = view;
    }

    @Override
    public void dologin(String Gmail, String Password) {


        if(Gmail.equals("dev.b@gmail.com") && Password.equals("12345")){
            view.onSuccess("Successful");
        }else{
            view.onerror("gmail or password invalid");
        }
    }
}
