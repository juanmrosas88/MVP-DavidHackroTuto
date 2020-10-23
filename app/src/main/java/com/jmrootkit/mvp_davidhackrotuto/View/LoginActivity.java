package com.jmrootkit.mvp_davidhackrotuto.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.jmrootkit.mvp_davidhackrotuto.Interface.LoginPresenter;
import com.jmrootkit.mvp_davidhackrotuto.Interface.LoginView;
import com.jmrootkit.mvp_davidhackrotuto.Presenter.LoginPresenterIMPL;
import com.jmrootkit.mvp_davidhackrotuto.R;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private EditText et_user, et_pass;
    private ProgressBar progressBar;

    private LoginPresenter presenterInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_user = (EditText) findViewById(R.id.etUser);
        et_pass = (EditText) findViewById(R.id.etPass);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        presenterInterface = new LoginPresenterIMPL(this);
    }



    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setErrorUser() {
        et_user.setError("Campo Obligatorio");

    }

    @Override
    public void setErrorPassword() {
        et_pass.setError("Campo Obligatorio");

    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(LoginActivity.this,PrincipalMenu.class));

    }

    public void Validacion(View view) {

        presenterInterface.ValidarUsuario(et_user.getText().toString(), et_pass.getText().toString());
    }
}