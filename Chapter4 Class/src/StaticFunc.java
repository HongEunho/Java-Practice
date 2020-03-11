class Calc{
	public static int abs(int a) {return a>0?a:-a;}
	public static int max(int a, int b) {return (a>b)?a:b;}
	public static int min(int a, int b) {return (a>b)?b:a;}
}

public class StaticFunc {
	
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
		//이렇게 객체선언 없이 바로 쓸수 있는 이유는 세 함수 모두 static함수 이기 때문!
		//static은 객체선언 없이 사용가능!
	}

}
