import java.util.Scanner;

class Song{
	String title, artist, country;
	int year;
	public Song() {
		
	}
	public Song(String title, String artist, String country, int year)
	{
		this.title=title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
	public void show() {
		System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
}
public class exam3 {

	public static void main(String[] args) {
		Song mySong = new Song("Dancing Queen","ABBA","������",1978);
		mySong.show();
	}

}
