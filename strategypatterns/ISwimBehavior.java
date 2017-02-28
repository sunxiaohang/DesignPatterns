package com.sunxiaohang.strategypatterns;

public interface ISwimBehavior {
	public void swim();
}
class BadSwingBehavior implements ISwimBehavior{
	@Override
	public void swim() {
		System.out.println("~~badSwiming~~");
	}
}
class GoodSwimBehavior implements ISwimBehavior{
	@Override
	public void swim() {
		System.out.println("~~goodSwiming~~");
	}
}
class NoSwimBehavior implements ISwimBehavior{
	@Override
	public void swim() {
		System.out.println("~~noSwiming~~");
	}
}