package com.sunxiaohang.strategypatterns;

public interface IFlyBehavior {
	public void fly();
}
class BadFlyBehavior implements IFlyBehavior{
	@Override
	public void fly() {
		System.out.println("~~badFlying~~");
	}
}
class GoodFlyBehavior implements IFlyBehavior{
	@Override
	public void fly() {
		System.out.println("~~goodFlying~~");
	}
}
class NoFlyBehavior implements IFlyBehavior{
	@Override
	public void fly() {
		System.out.println("~~noFlying");
	}
}