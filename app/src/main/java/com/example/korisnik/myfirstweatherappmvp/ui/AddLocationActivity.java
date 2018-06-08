package com.example.korisnik.myfirstweatherappmvp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.korisnik.myfirstweatherappmvp.Presentation.AddLocationActivityPresenter;

import  com.example.korisnik.myfirstweatherappmvp.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AddLocationActivity extends AppCompatActivity implements AddLocationContract.View{

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    private AddLocationContract.Presenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_add_location);
        ButterKnife.bind(this);

        mPresenter = new AddLocationActivityPresenter();
        mPresenter.setView(this);

        initFragment();
        initToolbar();
    }

    @Override
    public void initFragment() {
        if (getSupportFragmentManager().findFragmentById(R.id.add_location_activity_frame_layout) == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.add_location_activity_frame_layout, new AddLocationFragment())
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit();
        }
    }

    @Override
    public void initToolbar() {
        if (mToolbar != null) {
            mToolbar.setTitle(R.string.add_location_activity_title);
        }
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
