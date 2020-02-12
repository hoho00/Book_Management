package BookManagement;

public class ScienceFiction extends Book{
	//private int lateFeesPerDays = 600;
	public int getLateFees(int lateDays) {
		return lateDays * SFLATEFEE;
	}
	
	@Override
	public String toString() {
		return super.getNumber() + "  " + super.getTitle() + "  " + super.getAuthor() + "  SF"  ;
	}
	
	public ScienceFiction(String title, int number, String author) {
		super.setTitle(title);
		super.setNumber(number);
		super.setAuthor(author);
	}
}
