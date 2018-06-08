package com.example.korisnik.myfirstweatherappmvp.Presentation;

import com.example.korisnik.myfirstweatherappmvp.ui.AddLocationFragmentContract;

public class AddLocationFragmentPresenter implements AddLocationFragmentContract.Presenter {

    private AddLocationFragmentContract.View mLocationView;


    @Override
    public void setView(AddLocationFragmentContract.View addLocationView) {
        this.mLocationView = addLocationView;
    }

    @Override
    public void postLocation(String appId, String location) {

    }
}
