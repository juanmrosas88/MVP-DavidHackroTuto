package com.jmrootkit.mvp_davidhackrotuto.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jmrootkit.mvp_davidhackrotuto.Interface.LoginView;
import com.jmrootkit.mvp_davidhackrotuto.R;

public class LoginActivity extends AppCompatActivity implements LoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setErrorUser() {

    }

    @Override
    public void setErrorPassword() {

    }

    @Override
    public void navigateToHome() {

    }
}