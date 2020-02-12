package BookManagement;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookArrayManager manager = new BookArrayManager();
		
		while(true) {
			int inputNumber;
			String inputTitle;
			String inputauthor;
			System.out.println("도서관리 시스템 입니다. 원하는 항목의 숫자를 입력해 주십시오.");
			System.out.println("1. 책을 추가합니다.");
			System.out.println("2. 책을 검색합니다.");
			System.out.println("3. 책의 리스트를 보여줍니다.");
			System.out.println("4. 책의 리스트를 파일로 출력합니다.");
			System.out.println("5. 책을 정렬합니다.");
			System.out.println("6. 프로그램을 종료합니다.");
			
			int flag = 0;
			flag = input.nextInt();
			
			if (flag == 6) break;
			
			switch (flag) {
				
				//책의 추가
				case 1: {
					manager.addBook();
					break;	
				}
				
				//책의 검색
				case 2: {
					break;
				}
				
				//책의 리스트 보여주기
				case 3: {
					
					
					break;
				}
				
				//책의 파일 출력
				case 4: {
					break;
				}
				
				//책의 정렬
				case 5: {
					break;
				}
				
				default: {
					System.out.println("잘못된 입력입니다. 다시 입력해 주십시오.");
					break;
				}
			}
			
		}
		
		System.out.println("이용해 주셔서 감사합니다.");

	}

}
