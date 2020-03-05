

public class Generator {
	
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Generator pizza;
		pizza = new Generator();
		pizza.radius=10;
		pizza.name="자바피자";
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Generator donut=new Generator();
		donut.radius=2;
		donut.name="자바도넛";
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}

}
