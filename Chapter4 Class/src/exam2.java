import java.util.Scanner;

class Grade{
	int math, science, english, avg;
	public Grade(int math, int science, int english) {
		this.math=math;
		this.science=science;
		this.english=english;
	}
	public int average() {
		avg=(math+science+english)/3;
		return avg;
	}
}

public class exam2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� "+me.average());
		
		scanner.close();
	}

}
