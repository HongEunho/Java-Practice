

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
		pizza.name="�ڹ�����";
		double area=pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area);
		
		Generator donut=new Generator();
		donut.radius=2;
		donut.name="�ڹٵ���";
		area=donut.getArea();
		System.out.println(donut.name+"�� ������ "+area);
	}

}
