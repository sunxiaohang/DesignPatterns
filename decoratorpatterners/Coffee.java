package com.sunxiaohang.decoratorpatterners;

public class Coffee extends Drink{
	@Override
	public float cost() {
		return super.getPrice();
	}
}
class Decaf extends Coffee{
	public Decaf(){
		super.setDescription("Decaf");
		super.setPrice(3.0f);
	}
}
class Espresso extends Coffee{
	public Espresso(){
		super.setDescription("Espresso");
		super.setPrice(4.0f);
	}
}
class LongBlack extends Coffee{
	public LongBlack(){
		super.setDescription("LongBlack");
		super.setPrice(5.0f);
	}
}
class ShortBlack extends Coffee{
	public ShortBlack(){
		super.setDescription("ShortBlack");
		super.setPrice(6.0f);
	}
}
























