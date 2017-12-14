package com.practice.mvppractice.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.practice.mvppractice.R;
import com.practice.mvppractice.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity implements MainContract.MVPView{

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding = DataBindingUtil.setContentView(this,R.layout.main_activity);
        presenter = new MainPresenter(this);
        // passing presenter to layout file
        binding.setPresenter(presenter);
    }

    /******************** interface methods to launch new views ******************************/
    @Override
    public void launchSignInActivity() {
        Toast.makeText(this,"Taking User to SignIn Screen",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void launchSignOutActivity() {
        Toast.makeText(this,"Taking User to SignUp Screen",Toast.LENGTH_SHORT).show();
    }
}
