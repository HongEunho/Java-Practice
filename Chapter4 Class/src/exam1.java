class TV{
	String name;
	int year;
	int size;
	public TV(String name, int year, int size){
		this.name=name;
		this.year=year;
		this.size=size;
	}
	void show()
	{
		System.out.print(name+"���� ���� "+year+"���� "+size+"��ġ TV");
	}
}

public class exam1 {

	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
	}

}
