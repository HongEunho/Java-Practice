import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str[]= {"����","����","��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true)
		{
			System.out.print("���� ���� ��!>>");
			String user = scanner.next();
			int n=(int)(Math.random()*3);
			
			if(user.equals("����"))
			{
				if(str[n].equals("����"))
				{
					System.out.println("�����= "+user+", ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(str[n].equals("����"))
				{
					System.out.println("�����= "+user+", ��ǻ�� = "+str[n]+", �����ϴ�.");
				}
				else if(str[n].equals("��"))
				{
					System.out.println("�����= "+user+", ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
				}
			}
			else if(user.equals("����"))
			{
				if(str[n].equals("����"))
				{
					System.out.println("�����= "+user+", ��ǻ�� = "+str[n]+", �����ϴ�.");
					
				}
				else if(str[n].equals("����"))
				{
					System.out.println("�����= "+user+", ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
				}
				else if(str[n].equals("��"))
				{
					System.out.println("�����= "+user+", ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if(user.equals("��"))
			{
				if(str[n].equals("��"))
				{
					System.out.println("�����= "+user+", ��ǻ�� = "+str[n]+", �����ϴ�.");
					
				}
				else if(str[n].equals("����"))
				{
					System.out.println("�����= "+user+", ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
				}
				else if(str[n].equals("����"))
				{
					System.out.println("�����= "+user+", ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if(user.equals("�׸�"))
			{
				System.out.println("������ �����մϴ�...");
				break;
			}
				
		}
		scanner.close();
	}

}
