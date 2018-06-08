package com.example.korisnik.myfirstweatherappmvp.Presentation;

import com.example.korisnik.myfirstweatherappmvp.ui.AddLocationContract;

public class AddLocationActivityPresenter implements AddLocationContract.Presenter{

    private AddLocationContract.View mLocationView;

    @Override
    public void setView(AddLocationContract.View addLocationView) {
        this.mLocationView = addLocationView;
    }
}
