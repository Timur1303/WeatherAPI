package kg.app.weatherapi.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;

import kg.app.weatherapi.R;
import kg.app.weatherapi.databinding.FragmentWeatherBinding;

public class WeatherFragment extends Fragment {

    protected FragmentWeatherBinding ui;
    protected WeatherViewModel vm;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ui = FragmentWeatherBinding.inflate(inflater, container, false);
        vm = new ViewModelProvider(requireActivity()).get(WeatherViewModel.class);
        return ui.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vm.getBody();
        setText();
    }

    @SuppressLint("SetTextI18n")
    private void setText() {
        vm.bodyMutableLiveData.observe(getViewLifecycleOwner(), body1 -> {
            @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd  'at' HH:mm:ss");
            ui.tvCity.setText("" + body1.getName());
            ui.tvWeather.setText("" + body1.getWeather().get(0).getDescription());
            ui.tvTemp.setText("" + body1.getMain().getTemp() + " C");
            ui.tvTemper.setText(""+ body1.getMain().getFeels_like());
            ui.tvHumPercent.setText(""+ body1.getMain().getHumidity() + "%");
            ui.tvKm.setText(""+ body1.getWind().getSpeed() + " км/ч");

        });


    }
}