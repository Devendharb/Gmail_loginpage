package com.example.loginmvp;

public interface MainActivitycontract {

    interface View{
        void onSuccess(String message);
        void onerror(String message);
    }

    interface presenter{
        void dologin(String Gmail, String Password);
    }
}
