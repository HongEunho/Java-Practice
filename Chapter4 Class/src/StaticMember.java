class StaticSample{
	public int n;
	public void g() {
		m=20;
	}
	public void h() {
		n=30;
	}
	public static int m; //m�� ����ƽ������ �ٸ� ��ü��� ����
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
		System.out.println(s1.m); //n�� nonstatic m�� static�̹Ƿ� n�� �� ��ü�ȿ����� ó���ǰ� m�� ����Ŭ���� ��簴ü�鿡 ���� ó����
	}

}
