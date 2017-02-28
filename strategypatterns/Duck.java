package com.sunxiaohang.strategypatterns;
/***
 * Duck的抽象类
 * @author root
 *
 */
public abstract class Duck {
	protected IFlyBehavior flyBehavior;
	protected ISwimBehavior swimBehavior;
	public Duck(){
		
	}
	public void fly(){
		flyBehavior.fly();
	}
	public void swim(){
		swimBehavior.swim();
	}
	public abstract void display();
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setSwimBehavior(ISwimBehavior swimBehavior) {
		this.swimBehavior = swimBehavior;
	}
}
/***
 * 继承Duck的GreenHeadDuck类
 * @author root
 *
 */
class GreenHeadDuck extends Duck{
	public GreenHeadDuck() {
		swimBehavior=new GoodSwimBehavior();
		flyBehavior=new BadFlyBehavior();
	}
	@Override
	public void display() {
		System.out.println("~~GreenHeadDuck~~");
	}
}
/***
 * 继承Duck的RedHeadDuck类
 * @author root
 *
 */
class RedHeadDuck extends Duck{
	public RedHeadDuck() {
		flyBehavior=new GoodFlyBehavior();
		swimBehavior=new BadSwingBehavior();
	}
	@Override
	public void display() {
		System.out.println("~~RedHeadDuck~~");
	}
}
