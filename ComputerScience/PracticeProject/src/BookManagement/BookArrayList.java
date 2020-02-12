package BookManagement;

import java.util.ArrayList;

public class BookArrayList {
	private ArrayList<Object> BookList;
	public void BookArrayList(){
		BookList = new ArrayList();
	}
	
	public boolean isEmpty() {
		return BookList.isEmpty();
	}

	public ArrayList<Object> getBookList() {
		return BookList;
	}
	public void add(Novel novel) {
		
	}
}
