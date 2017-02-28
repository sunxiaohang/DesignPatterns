package com.sunxiaohang.observerpatterns;

public class ForecastConditions implements Observer{
	private float mTemperature;
	private float mPressure;
	private float mHumidity;
	@Override
	public void update(float mTemperature, float mPressure, float mHumidity) {
		this.mHumidity=mHumidity;
		this.mTemperature=mTemperature;
		this.mPressure=mPressure;
		display();
	}
	public void display(){
		System.out.println("***Today mTemperature***"+mTemperature);
		System.out.println("***Today mPressure***"+mPressure);
		System.out.println("***Today mHumidity***"+mHumidity);
	}
}
