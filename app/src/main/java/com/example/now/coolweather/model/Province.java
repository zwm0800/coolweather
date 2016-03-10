package com.example.now.coolweather.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 省份信息Model
 * Created by now on 16/3/10.
 */
public class Province implements Parcelable {
    /**
     * 主键
     */
    private int id;

    /**
     * 省份名称
     */
    private String provinceName;

    /**
     * 省份编号
     */
    private String provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.provinceName);
        dest.writeString(this.provinceCode);
    }

    public Province() {
    }

    protected Province(Parcel in) {
        this.id = in.readInt();
        this.provinceName = in.readString();
        this.provinceCode = in.readString();
    }

    public static final Parcelable.Creator<Province> CREATOR = new Parcelable.Creator<Province>() {
        public Province createFromParcel(Parcel source) {
            return new Province(source);
        }

        public Province[] newArray(int size) {
            return new Province[size];
        }
    };
}

