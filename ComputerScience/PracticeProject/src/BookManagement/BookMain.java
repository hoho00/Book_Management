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
			System.out.println("�������� �ý��� �Դϴ�. ���ϴ� �׸��� ���ڸ� �Է��� �ֽʽÿ�.");
			System.out.println("1. å�� �߰��մϴ�.");
			System.out.println("2. å�� �˻��մϴ�.");
			System.out.println("3. å�� ����Ʈ�� �����ݴϴ�.");
			System.out.println("4. å�� ����Ʈ�� ���Ϸ� ����մϴ�.");
			System.out.println("5. å�� �����մϴ�.");
			System.out.println("6. ���α׷��� �����մϴ�.");
			
			int flag = 0;
			flag = input.nextInt();
			
			if (flag == 6) break;
			
			switch (flag) {
				
				//å�� �߰�
				case 1: {
					manager.addBook();
					break;	
				}
				
				//å�� �˻�
				case 2: {
					break;
				}
				
				//å�� ����Ʈ �����ֱ�
				case 3: {
					
					
					break;
				}
				
				//å�� ���� ���
				case 4: {
					break;
				}
				
				//å�� ����
				case 5: {
					break;
				}
				
				default: {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ֽʽÿ�.");
					break;
				}
			}
			
		}
		
		System.out.println("�̿��� �ּż� �����մϴ�.");

	}

}
