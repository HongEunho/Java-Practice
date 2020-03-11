class StaticSample{
	public int n;
	public void g() {
		m=20;
	}
	public void h() {
		n=30;
	}
	public static int m; //m은 스태틱변수라 다른 객체들과 공유
	public static void f() {
		m=5;
	}
}
public class StaticMember {

	public static void main(String[] args) {
		StaticSample s1, s2;
		s1=new StaticSample();
		s1.n=5;
		s1.g();
		s1.m=50;
		s2=new StaticSample();
		s2.n=8;
		s2.h();
		s2.f();
		System.out.println(s2.n);
		System.out.println(s1.m); //n은 nonstatic m은 static이므로 n은 그 객체안에서만 처리되고 m은 같은클래스 모든객체들에 의해 처리됨
	}

}
