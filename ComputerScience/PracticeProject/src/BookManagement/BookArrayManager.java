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
		System.out.println("å�� ������ �Է��ϼ��� : ");
		title = input.nextLine();
		System.out.println("å�� ��ȣ�� �Է��ϼ��� : ");
		number = Integer.parseInt(input.nextLine());
		System.out.println("å�� �۰��� �Է��ϼ��� : ");
		author = input.nextLine();
		
		
		while(true) {
			System.out.println("å�� �帣�� �Է��ϼ��� : ");
			genre = input.nextLine();
			
			if(genre.equals("�Ҽ�") || genre.equals("Novel") || genre.equals("novel")) {
				Novel newNovel = new Novel(title,number,author);
				list.getBookList().add(newNovel);
				break;
			}
			
			else if(genre.equals("��") || genre.equals("Poet") || genre.equals("poet")) {
				Poet newPoet = new Poet(title,number,author);
				list.getBookList().add(newPoet);
				break;
			}
			
			else if(genre.equals("������мҼ�") || genre.equals("�������") || genre.equals("SF") || genre.equals("ScienceFiction")|| genre.equals("sf") || genre.equals("sciencefiction")) {
				ScienceFiction newSF = new ScienceFiction(title,number,author);
				list.getBookList().add(newSF);
				break;
			}
			
			else {
				System.out.println("�߸��� �帣�Դϴ�. �ٽ� �Է��� �ֽʽÿ�.");
			}
		}
		
		
	}
	
}
