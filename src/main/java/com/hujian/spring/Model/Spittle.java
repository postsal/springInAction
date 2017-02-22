package com.hujian.spring.Model;

import java.util.Date;

/**
 * Created by hujian on 2016/12/5.
 */
public class Spittle {
    private final long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;

    public Spittle(long id, String message, Date time) {
        this.id = id;
        this.message = message;
        this.time = time;
    }

    public Spittle(long id, String message, Date time, Double latitude, Double longitude) {
        this.id = id;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
