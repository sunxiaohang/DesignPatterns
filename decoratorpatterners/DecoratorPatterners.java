package com.sunxiaohang.decoratorpatterners;
/***
 * 装饰者模式
 * 严格遵循开放闭合原则
 * 防止类爆炸
 * java内置装饰者模式（文件流）
 * @author root
 *
 */
public class DecoratorPatterners {
	public static void main(String[] args) {
		Drink order=new Decaf();
		System.out.println("order1 price:"+order.cost());
		System.out.println("order1 desc:"+order.getDescription());
		
		System.out.println("***********************");
		order=new LongBlack();
		order=new Milk(order);
		order=new Chocolate(order);
		order=new Chocolate(order);
		
		System.out.println("order2 price:"+order.cost());
		System.out.println("order2 desc:"+order.getDescription());
	}
}
