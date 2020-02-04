package BookManagement;

public class Novel extends Book {
	public int getLateFees(int lateDays) {
		int lateFees;
		int fee = 300;
		lateFees = lateDays * fee; 
		return lateFees;
	}
}
