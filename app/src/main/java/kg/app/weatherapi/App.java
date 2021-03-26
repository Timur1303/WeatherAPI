package kg.app.weatherapi;

import android.app.Application;

import kg.app.weatherapi.network.WeatherService;

public class App extends Application {

    public static WeatherService service;

    @Override
    public void onCreate() {
        super.onCreate();
        service = new WeatherService();
    }
}
