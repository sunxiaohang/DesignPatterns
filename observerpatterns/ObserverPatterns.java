package com.sunxiaohang.observerpatterns;
/***
 * 观察者模式
 * @author root
 * 对象之间多对一依赖的一种设计方式,
 * 被依赖的对象为Subject，依赖的对象为Observer
 * Subject通知Observer变化
 */
public class ObserverPatterns {
	public static void main(String[] args) {
		CurrentConditions currentConditions=new CurrentConditions();
		ForecastConditions forecastConditions=new ForecastConditions();
		WeatherDataSt weatherDataSt=new WeatherDataSt();
		weatherDataSt.registerObserver(currentConditions);
		weatherDataSt.registerObserver(forecastConditions);
		//模拟数据变化
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i==7)weatherDataSt.removeObserver(forecastConditions);
			weatherDataSt.setData(12*i, 12-i, 2+i);
		}
	}
}
