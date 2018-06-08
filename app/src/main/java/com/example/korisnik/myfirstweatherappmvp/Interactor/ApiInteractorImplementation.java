package com.example.korisnik.myfirstweatherappmvp.Interactor;

import com.example.korisnik.myfirstweatherappmvp.Model.WeatherResponse;
import com.example.korisnik.myfirstweatherappmvp.Networking.ApiService;

import retrofit2.Callback;

public class ApiInteractorImplementation implements ApiInteractor {

    private final ApiService apiService;

    public ApiInteractorImplementation(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public void getWeather(Callback<WeatherResponse> callback, String appId, String cityToDisplay) {
        apiService.getWeather(appId, cityToDisplay).enqueue(callback);
    }
}
