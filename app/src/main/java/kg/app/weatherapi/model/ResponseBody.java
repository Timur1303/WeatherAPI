package kg.app.weatherapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

    public class ResponseBody {
        public Coords getCoords() {
            return coords;
        }

        public void setCoords(Coords coords) {
            this.coords = coords;
        }

        public ArrayList<Weather> getWeather() {
            return weather;
        }

        public void setWeather(ArrayList<Weather> weather) {
            this.weather = weather;
        }

        public String getBase() {
            return base;
        }

        public void setBase(String base) {
            this.base = base;
        }

        public Main getMain() {
            return main;
        }

        public void setMain(Main main) {
            this.main = main;
        }

        public Integer getVisibility() {
            return visibility;
        }

        public void setVisibility(Integer visibility) {
            this.visibility = visibility;
        }

        public Wind getWind() {
            return wind;
        }

        public void setWind(Wind wind) {
            this.wind = wind;
        }

        public Clouds getClouds() {
            return clouds;
        }

        public void setClouds(Clouds clouds) {
            this.clouds = clouds;
        }

        public Integer getDt() {
            return dt;
        }

        public void setDt(Integer dt) {
            this.dt = dt;
        }

        public Sys getSys() {
            return sys;
        }

        public void setSys(Sys sys) {
            this.sys = sys;
        }

        public Integer getTimezone() {
            return timezone;
        }

        public void setTimezone(Integer timezone) {
            this.timezone = timezone;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @SerializedName("coord")
        @Expose
        private Coords coords;

        @SerializedName("weather")
        @Expose
        private ArrayList<Weather> weather;

        @SerializedName("base")
        @Expose
        private String base;

        @SerializedName("main")
        @Expose
        private Main main;

        @SerializedName("visibility")
        @Expose
        private Integer visibility;

        @SerializedName("wind")
        @Expose
        private Wind wind;

        @SerializedName("clouds")
        @Expose
        private Clouds clouds;

        @SerializedName("dt")
        @Expose
        private Integer dt;

        @SerializedName("sys")
        @Expose
        private Sys sys;

        @SerializedName("timezone")
        @Expose
        private Integer timezone;

        @SerializedName("id")
        @Expose
        private Integer id;

        @SerializedName("name")
        @Expose
        private String name;
}
