import java.util.Scanner;

public class doublefor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String s = scanner.next();
		char c = s.charAt(0);
		
		for(int i=0;i<=c-'a';i++)
		{
			for(char k='a';k<=c-i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
