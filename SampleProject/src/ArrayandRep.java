import java.util.Scanner;

public class ArrayandRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String course[] = {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[] = {95,88,76,62,55};
		
		
		
		while(true)
		{
			int i=0;
			String name;
			System.out.print("���� �̸�>>");
			name = scanner.next();
			if(name.equals("�׸�"))
				break;
			for(i=0;i<course.length;i++)
			{
				if(course[i].equals(name))
				{
					int n=score[i];
					System.out.println(name+"�� ������ "+score[i]);
					break;
				}
			}
			if(i==course.length)
				System.out.println("���� �����Դϴ�.");
		}
		scanner.close();
	}

}
