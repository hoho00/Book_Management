package BookManagement;

public class Book implements LateFees{
	private int number;
	private String title;
	private String author;
	
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
	
	@Override
	public boolean equals(Object book) {
		
		return this.getNumber() == ((Book)book).getNumber();
	}
	
	@Override
	public String toString() {
		return number + "  " + title + "  " + author + "  장르없음"  ;
	}
	
}
