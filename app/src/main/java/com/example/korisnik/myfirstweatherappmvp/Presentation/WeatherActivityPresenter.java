package com.example.korisnik.myfirstweatherappmvp.Presentation;

import com.example.korisnik.myfirstweatherappmvp.ui.WeatherContract;

public class WeatherActivityPresenter implements WeatherContract.Presenter {

    private WeatherContract.View mWeatherView;


    @Override
    public void setView(WeatherContract.View weatherView) {
        this.mWeatherView = weatherView;
    }
}
