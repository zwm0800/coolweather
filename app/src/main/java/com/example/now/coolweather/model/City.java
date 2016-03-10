package com.example.now.coolweather.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 城市信息Model
 * Created by now on 16/3/10.
 */
public class City implements Parcelable {
    /**
     * 主键
     */
    private int id;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 城市编号
     */
    private String cityCode;

    /**
     * 省份id
     */
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.cityName);
        dest.writeString(this.cityCode);
        dest.writeInt(this.provinceId);
    }

    public City() {
    }

    protected City(Parcel in) {
        this.id = in.readInt();
        this.cityName = in.readString();
        this.cityCode = in.readString();
        this.provinceId = in.readInt();
    }

    public static final Parcelable.Creator<City> CREATOR = new Parcelable.Creator<City>() {
        public City createFromParcel(Parcel source) {
            return new City(source);
        }

        public City[] newArray(int size) {
            return new City[size];
        }
    };
}
