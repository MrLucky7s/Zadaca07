package com.example.korisnik.myfirstweatherappmvp.ui;

public interface AddLocationContract {

    interface View {

        void initFragment();

        void initToolbar();
    }

    interface Presenter {

        void setView(View addLocationView);

    }

}
