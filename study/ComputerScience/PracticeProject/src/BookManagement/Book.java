package BookManagement;

public class Book extends Object{
	
	private int number; 
	private String title;
	private String author;
	
	@Override
	//number �� �����ϸ� ���� ���� å(class)�� �����Ѵ�.
	public boolean equals(Object obj) {
		return this.number == ((Book)obj).number;
	}
	
	//getter and setter
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
