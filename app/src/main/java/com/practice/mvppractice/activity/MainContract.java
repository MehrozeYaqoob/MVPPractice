package com.practice.mvppractice.activity;

import android.view.View;

/**
 * Created by hp on 12/14/2017.
 */

public interface MainContract  {

    interface MVPView{
        // lets specify the behavior of Main Activity
        void launchSignInActivity();
        void launchSignOutActivity();
    }
    interface Presenter{

        //  events clicks are handled by presenter class
        void handleSignInButton(View view);
        void handleSignUpButton(View view);
    }
}
