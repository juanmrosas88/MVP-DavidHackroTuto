package com.jmrootkit.mvp_davidhackrotuto.Interface;

public interface LoginInteractor {

    void validarUser(String user, String pass, OnLoginFinishListener listener);

}
