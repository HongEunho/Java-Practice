import java.util.Scanner;

class Book{
	String title, author;
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
}
public class ObjectArray {

	public static void main(String[] args) {
		Book [] book = new Book[2];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<book.length;i++)
		{
			System.out.print("Á¦¸ñ>>");
			String title=scanner.nextLine();//next´Â ºóÄ­x nextlineÀº ºóÄ­Æ÷ÇÔ ÀÐÀ½ CÀÇ gets¿Í À¯»ç.
			System.out.print("ÀúÀÚ>>");
			String author = scanner.nextLine();
			book[i]=new Book(title,author);
		}
		
		for(int i=0;i<book.length;i++)
			System.out.print("(" + book[i].title +", "+book[i].author+")");
		scanner.close();
	}

}
