package kg.app.weatherapi.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import kg.app.weatherapi.App;
import kg.app.weatherapi.model.ResponseBody;
import kg.app.weatherapi.network.ResponseCallback;

public class WeatherViewModel extends ViewModel {

    protected MutableLiveData<ResponseBody> bodyMutableLiveData = new MutableLiveData<>();

    public void getBody() {
        App.service.getResponse("Bishkek", "4bbf5a1ed98cd9f688ebb3651474cdd2", "metric", new ResponseCallback() {

            @Override
            public void onSuccess(ResponseBody body) {
                if (body != null) {
                    bodyMutableLiveData.setValue(body);
                }
            }

            @Override
            public void onFailure(Throwable t) {
            }

        });
    }

}
