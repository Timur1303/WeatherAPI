package kg.app.weatherapi.network;

import kg.app.weatherapi.model.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {

    @GET("data/2.5/weather")
    Call<ResponseBody> getResponse(@Query("q") String q,
                                   @Query("appid") String apid,
                                   @Query("units") String units);

}
