package com.example.korisnik.myfirstweatherappmvp.Interactor;

import com.example.korisnik.myfirstweatherappmvp.Model.WeatherResponse;

import retrofit2.Callback;

public interface ApiInteractor {

    void getWeather(Callback<WeatherResponse> callback, String appId, String cityToDisplay);
}
