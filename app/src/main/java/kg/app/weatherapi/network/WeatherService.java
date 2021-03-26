package kg.app.weatherapi.network;

import kg.app.weatherapi.model.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherService {
    protected final String BASE_URL = "https://api.openweathermap.org/";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    WeatherApi service = retrofit.create(WeatherApi.class);

    public void getResponse(String q, String apid, String units, ResponseCallback callback) {
        Call<ResponseBody> call = service.getResponse(q, apid, units);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful() && response.body() != null) {
                    callback.onSuccess(response.body());
                }

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                callback.onFailure(t);
            }
        });
    }
}
