package com.practice.mvppractice.activity;

import android.view.View;

/**
 * Created by hp on 12/14/2017.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.MVPView mvpView;

    MainPresenter(MainContract.MVPView view)
    {
        this.mvpView = view;
    }

    /**************************** interface methods to handle button events **********************************/
    @Override
    public void handleSignInButton(View view) {
        mvpView.launchSignInActivity();
    }

    @Override
    public void handleSignUpButton(View view) {
        mvpView.launchSignOutActivity();
    }
}
