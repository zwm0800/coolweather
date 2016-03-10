package com.example.now.coolweather.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 酷欧天气数据库链接工具类
 * Created by now on 16/3/10.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    /**
     * 上下文
     */
    private Context mContext;

    /**
     * 创建省份表
     */
    public static final String CREATE_PROVINCE = "create table province ("
            + "id integer primary key autoincrement,"
            + "province_name text,"
            + "province_code text)";

    /**
     * 创建城市表
     */
    public static final String CREATE_CITY = "create table city("
            + "id integer primary key autoincrement,"
            + "city_name text,"
            + "city_code text,"
            + "province_id integer)";

    /**
     * 创建县表
     */
    public static final String CREATE_COUNTY = "create table county("
            + "id integer primary key autoincrement,"
            + "county_name text,"
            + "county_code text,"
            + "city_id integer)";

    /**
     * 构造方法
     *
     * @param context 上下文
     * @param name    数据库名称
     * @param factory 迭代工厂
     * @param version 版本号
     */
    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // 创建省份信息表
        db.execSQL(CREATE_PROVINCE);
        // 创建城市信息表
        db.execSQL(CREATE_CITY);
        // 创建县信息表
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
