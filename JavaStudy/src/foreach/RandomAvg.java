package foreach;

import java.util.Scanner;

public class RandomAvg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ ������ : ");
		int []arr=new int[10];
		int sum=0;
		for(int i=0;i<10;i++)
		{
			arr[i]=(int)(Math.random()*10+1);
			sum+=arr[i];
		}
		for(int i=0;i<10;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.print("����� ");
		System.out.print(sum/10.0);
	}

}
