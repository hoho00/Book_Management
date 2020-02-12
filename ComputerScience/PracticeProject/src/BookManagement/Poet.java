package BookManagement;

public class Poet extends Book{
	//private int lateFeesPerDays = 200;
	public int getLateFees(int lateDays) {
		return lateDays * POETLATEFEE;
	}
	
	@Override
	public String toString() {
		return super.getNumber() + "  " + super.getTitle() + "  " + super.getAuthor() + "  ½Ã"  ;
	}
	
	public Poet(String title, int number, String author) {
		super.setTitle(title);
		super.setNumber(number);
		super.setAuthor(author);
	}
}
