package com.example.android.quakereport.domain;

/**
 * Created by Cookiesoft on 07/01/2018.
 */

public class Earthquake {

    private Double magnitude;
    private String place;
    private String date;

    public Earthquake(Double magnitude, String place, String date) {
        this.magnitude = magnitude;
        this.place = place;
        this.date = date;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Double magnitude) {
        this.magnitude = magnitude;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
