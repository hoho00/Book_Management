package BookManagement;

import java.util.Scanner;

public class BookArrayManager extends BookArrayList{
	private BookArrayList list = new BookArrayList();
	public void BookArrayManager() {
		
	}
	
	
	public void addBook() {
		String title;
		int number; 
		String author; 
		String genre;
		Scanner input = new Scanner(System.in);
		System.out.println("책의 제목을 입력하세요 : ");
		title = input.nextLine();
		System.out.println("책의 번호를 입력하세요 : ");
		number = Integer.parseInt(input.nextLine());
		System.out.println("책의 작가를 입력하세요 : ");
		author = input.nextLine();
		
		
		while(true) {
			System.out.println("책의 장르를 입력하세요 : ");
			genre = input.nextLine();
			
			if(genre.equals("소설") || genre.equals("Novel") || genre.equals("novel")) {
				Novel newNovel = new Novel(title,number,author);
				list.getBookList().add(newNovel);
				break;
			}
			
			else if(genre.equals("시") || genre.equals("Poet") || genre.equals("poet")) {
				Poet newPoet = new Poet(title,number,author);
				list.getBookList().add(newPoet);
				break;
			}
			
			else if(genre.equals("공상과학소설") || genre.equals("공상과학") || genre.equals("SF") || genre.equals("ScienceFiction")|| genre.equals("sf") || genre.equals("sciencefiction")) {
				ScienceFiction newSF = new ScienceFiction(title,number,author);
				list.getBookList().add(newSF);
				break;
			}
			
			else {
				System.out.println("잘못된 장르입니다. 다시 입력해 주십시오.");
			}
		}
		
		
	}
	
}
