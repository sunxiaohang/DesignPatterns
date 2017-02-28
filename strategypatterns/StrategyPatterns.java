package com.sunxiaohang.strategypatterns;
/***
 * 策略模式（StrategyPatterns）
 * 父类 Duck
 * 子类 RedHeadDuck，GreenHeadDuck
 * @author root
 * 策略模式注意点
 * 1.分析项目中变化部分与不变部分
 * 2.多用组合少用继承；用行为泪组合，而不是行为的继承，更具有弹性
 */
public class StrategyPatterns {
	public static void main(String[] args) {
		GreenHeadDuck ghd=new GreenHeadDuck();
		ghd.display();
		ghd.fly();
		ghd.swim();
		RedHeadDuck rhd=new RedHeadDuck();
		rhd.display();
		rhd.fly();
		rhd.swim();
	}
}
