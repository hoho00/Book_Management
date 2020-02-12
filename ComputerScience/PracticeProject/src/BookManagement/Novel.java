package BookManagement;

public class Novel extends Book{

	//private int lateFeesPerDays = 300;
	public int getLateFees(int lateDays) {
		return lateDays * NOVELLATEFEE;
	}
	
	@Override
	public String toString() {
		return super.getNumber() + "  " + super.getTitle() + "  " + super.getAuthor() + "  ¼Ò¼³"  ;
	}
	
	public Novel(String title, int number, String author) {
		super.setTitle(title);
		super.setNumber(number);
		super.setAuthor(author);
	}
}
