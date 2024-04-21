package Ch05;

class Circle22 {
	private int radius;
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public static final double PI = 3.14;
	public Circle22(int radius) {
		this.radius = radius;
	}
	public double area() {
		return radius * radius * PI;
	}
}

class Pizza extends Circle22 {
	private String topping;
	public Pizza(String topping, int radius) {
		super(radius);
		this.topping = topping;	
	}
	public void print() {
		System.out.println("토핑 : " + topping);
		System.out.println("피자 반지름 : " + getRadius());
		System.out.println("피자 크기 : " + area());
	}
}

public class PizzaTest { // 김종현
	public static void main(String[] args) {
		Pizza p = new Pizza("파인애플", 10);
		p.print();
	}
}
