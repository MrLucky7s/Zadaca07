package com.example.korisnik.myfirstweatherappmvp.Presentation;

import android.content.Context;
import android.widget.Toast;

import com.example.korisnik.myfirstweatherappmvp.Constants;
import com.example.korisnik.myfirstweatherappmvp.Interactor.ApiInteractor;
import com.example.korisnik.myfirstweatherappmvp.Model.WeatherResponse;
import com.example.korisnik.myfirstweatherappmvp.ui.WeatherFragmentContract;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherFragmentPresenter implements WeatherFragmentContract.Presenter {

    private final ApiInteractor mApiInteractor;

    private WeatherFragmentContract.View mWeatherView;

    public WeatherFragmentPresenter(ApiInteractor apiInteractor) {
        this.mApiInteractor = apiInteractor;
    }


    @Override
    public void setView(WeatherFragmentContract.View weatherView) {
        this.mWeatherView = weatherView;
    }

    @Override
    public void getWeather(String appId, String cityToDisplay) {
        mApiInteractor.getWeather(getWeatherCallback(), Constants.APP_ID, cityToDisplay);
    }

    private Callback<WeatherResponse> getWeatherCallback() {
        return new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    WeatherResponse data = response.body();

                    mWeatherView.showWeather(data);
                }
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
            }
        };
    }
}

