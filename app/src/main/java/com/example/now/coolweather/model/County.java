package com.example.now.coolweather.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 县信息Model
 * Created by now on 16/3/10.
 */
public class County implements Parcelable {
    /**
     * 主键
     */
    private int id;

    /**
     * 县名称
     */
    private String countyName;

    /**
     * 县编号
     */
    private String countyCode;

    /**
     * 城市id
     */
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.countyName);
        dest.writeString(this.countyCode);
        dest.writeInt(this.cityId);
    }

    public County() {
    }

    protected County(Parcel in) {
        this.id = in.readInt();
        this.countyName = in.readString();
        this.countyCode = in.readString();
        this.cityId = in.readInt();
    }

    public static final Parcelable.Creator<County> CREATOR = new Parcelable.Creator<County>() {
        public County createFromParcel(Parcel source) {
            return new County(source);
        }

        public County[] newArray(int size) {
            return new County[size];
        }
    };
}
