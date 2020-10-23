package com.jmrootkit.mvp_davidhackrotuto.Presenter;

import com.jmrootkit.mvp_davidhackrotuto.Interactor.LoginInteracorIMPL;
import com.jmrootkit.mvp_davidhackrotuto.Interface.LoginInteractor;
import com.jmrootkit.mvp_davidhackrotuto.Interface.LoginPresenter;
import com.jmrootkit.mvp_davidhackrotuto.Interface.LoginView;
import com.jmrootkit.mvp_davidhackrotuto.Interface.OnLoginFinishListener;

public class LoginPresenterIMPL implements LoginPresenter, OnLoginFinishListener {
    private LoginView view;
    private LoginInteractor interactor;

    public LoginPresenterIMPL(LoginView view) {
        this.view = view;
        interactor = new LoginInteracorIMPL();
    }

    @Override
    public void ValidarUsuario(String user, String password) {
        if (view != null) {
            view.hideProgress();
        }
      //  interactor.validarUser();

    }

    @Override
    public void UsernameError() {
        if (view != null) {
            view.hideProgress();
            view.setErrorUser();
        }

    }

    @Override
    public void passwordError() {
        if (view != null) {
            view.hideProgress();
            view.setErrorPassword();
        }

    }

    @Override
    public void exitoOperacion() {
        if (view != null) {
            view.hideProgress();
            view.navigateToHome();
        }

    }
}
