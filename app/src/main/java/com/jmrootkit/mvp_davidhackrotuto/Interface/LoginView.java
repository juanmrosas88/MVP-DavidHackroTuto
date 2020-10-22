package com.jmrootkit.mvp_davidhackrotuto.Interface;

public interface LoginView {

    void showProgress();
    void hideProgress();

    void setErrorUser();
    void setErrorPassword();

    void navigateToHome();

}
