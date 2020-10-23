package com.jmrootkit.mvp_davidhackrotuto.Interactor;

import android.os.Handler;

import com.jmrootkit.mvp_davidhackrotuto.Interface.LoginInteractor;
import com.jmrootkit.mvp_davidhackrotuto.Interface.OnLoginFinishListener;


public class LoginInteracorIMPL implements LoginInteractor {

    @Override
    public void validarUser(String user, String pass, OnLoginFinishListener listener) {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                if (user.equals("") && pass.equals("")) {
                    if (user.equals("")) {
                        listener.UsernameError();
                    }
                    if (pass.equals("")) {
                        listener.passwordError();
                    }
                } else {
                    listener.exitoOperacion();

                }
            }
        }, 2000);

    }
}
