package com.sunxiaohang.decoratorpatterners;

public abstract class Drink {
	public String description="";
	private float price=0f;
	public String getDescription() {
		return description+":"+getPrice();
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public abstract float cost();
}
