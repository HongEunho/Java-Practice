import java.util.Scanner;

public class multipleof3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []arr=new int[10];
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		for(int i=0;i<10;i++)
			arr[i]=scanner.nextInt();
		
		System.out.print("3�� ����� ");
		for(int i=0;i<10;i++)
		{
			if(arr[i]%3==0)
				System.out.print(arr[i]+" ");
		}
	}

}