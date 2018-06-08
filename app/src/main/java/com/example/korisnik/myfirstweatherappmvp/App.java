package com.example.korisnik.myfirstweatherappmvp;

import android.app.Application;

import com.example.korisnik.myfirstweatherappmvp.Interactor.ApiInteractor;
import com.example.korisnik.myfirstweatherappmvp.Interactor.ApiInteractorImplementation;
import com.example.korisnik.myfirstweatherappmvp.Networking.ApiService;
import com.example.korisnik.myfirstweatherappmvp.Networking.RetrofitUtil;

import retrofit2.Retrofit;

public class App extends Application {

    private static ApiInteractor apiInteractor;

    @Override
    public void onCreate() {
        super.onCreate();


        final Retrofit retrofit = RetrofitUtil.createRetrofit();
        final ApiService apiService = retrofit.create(ApiService.class);

        apiInteractor = new ApiInteractorImplementation(apiService);

    }

    public static ApiInteractor getApiInteractor() {
        return apiInteractor;
    }

}
