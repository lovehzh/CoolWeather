package com.coolweather.app.db;

import java.util.List;

import com.coolweather.app.model.City;
import com.coolweather.app.model.Country;
import com.coolweather.app.model.Province;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CoolWeatherDB {
	/**
	 * 数据库名
	 */
	public static final String DB_NAME = "cool_weather";
	
	/**
	 * 数据库版本
	 */
	public static final int VERSION = 1;
	
	private static CoolWeatherDB coolWeatherDB;
	
	private SQLiteDatabase db;
	
	
	/**
	 * 将够着方法私有化
	 * @param context
	 */
	private CoolWeatherDB(Context context) {
		CoolWeatherOpenHelper dbHelper = new CoolWeatherOpenHelper(context, DB_NAME, null, VERSION);
		db = dbHelper.getWritableDatabase();
	}
	
	/**
	 * 获取CoolWeatherDB实例
	 * @param context
	 * @return
	 */
	public synchronized static CoolWeatherDB getInstance(Context context) {
		if(coolWeatherDB == null) {
			coolWeatherDB = new CoolWeatherDB(context);
		}
		return coolWeatherDB;
	}
	
	/**
	 * 将Province实例存储到数据库
	 * @param province
	 */
	private void saveProvince(Province province) {
		
	}
	
	/**
	 * 从数据库中读取全国所有的省份信息
	 * @return
	 */
	private List<Province> loadProvinces() {
		return null;
	}
	
	/**
	 * 将City实例保存到数据库
	 * @param city
	 */
	private void save(City city) {
		
	}
	
	/**
	 * 加载省下面的所有城市的信息
	 * @param provinceId
	 * @return
	 */
	private List<City> loadCities(int provinceId) {
		return null;
	}
	
	/**
	 * 将Country 实例保存到数据库
	 * @param country
	 */
	private void saveCountry(Country country) {
		
	}
	
	/**
	 * 读取城市下所有的县信息
	 * @param cityId
	 * @return
	 */
	private List<Country> loadCountries(int cityId) {
		return null;
	}
}
