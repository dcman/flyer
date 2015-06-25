package com.fancylancy.flyergame.items;


/**
 * Created by SuckIt on 6/24/15.
 */
public class Airport {
    private String city;
    private String iata;

    public Airport(String city, String iata) {
        this.city = city;
        this.iata = iata;
    }

    public Airport() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }
}
