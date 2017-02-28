package com.sunxiaohang.observerpatterns;

import java.util.ArrayList;

public class WeatherDataSt implements Subject {
	private float mTemperature;
	private float mPressure;
	private float mHumidity;
	private ArrayList<Observer> mObserver;

	public WeatherDataSt() {
		mObserver = new ArrayList<>();
	}

	public void setData(float mTemperature, float mPressure, float mHumidity) {
		this.mHumidity = mHumidity;
		this.mTemperature = mTemperature;
		this.mPressure = mPressure;
		dataChanged();
	}

	@Override
	public void registerObserver(Observer o) {
		mObserver.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if (mObserver.contains(o))
			mObserver.remove(o);
	}

	@Override
	public void notifyObserver() {
		for(int i=0;i<mObserver.size();i++){
			mObserver.get(i).update(getmTemperature(), getmPressure(), getmHumidity());
		}
	}

	public float getmTemperature() {
		return mTemperature;
	}

	public float getmPressure() {
		return mPressure;
	}

	public float getmHumidity() {
		return mHumidity;
	}

	public void dataChanged() {
		notifyObserver();
	}
}
