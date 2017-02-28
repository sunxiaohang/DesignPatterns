package com.sunxiaohang.decoratorpatterners;

public class Decorator extends Drink{
	private Drink Obj;
	public Decorator(Drink obj) {
		Obj = obj;
	}
	@Override
	public float cost() {
		return super.getPrice()+Obj.cost();
	}
	@Override
	public String getDescription() {
		return super.getDescription()+"&&"+Obj.getDescription();
	}
}
class Chocolate extends Decorator{
	public Chocolate(Drink obj) {
		super(obj);
		super.setDescription("Chocolate");
		super.setPrice(3.0f);
	}
}
class Milk extends Decorator{
	public Milk(Drink obj) {
		super(obj);
		super.setDescription("Milk");
		super.setPrice(2.0f);
	}
}
class Soy extends Decorator{
	public Soy(Drink obj) {
		super(obj);
		super.setDescription("Soy");
		super.setPrice(1.0f);
	}
}