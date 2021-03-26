package kg.app.weatherapi.network;

import kg.app.weatherapi.model.ResponseBody;

public interface ResponseCallback {
    void onSuccess(ResponseBody body);

    void onFailure(Throwable t);
}
