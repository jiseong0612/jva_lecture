package noticeboard;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		Board[] list = new Board[100];
		boolean run = true;
		int i = 0;
		while (i < 100) {
			System.out.println("1.�ۼ� 2.�ҷ����� 3.����");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println();
				System.out.print("�ۼ��� > ");
				board.setwriter();
				System.out.print("���� > ");
				board.setTitle();
				System.out.print("���� > ");
				board.setArticle();

				System.out.println("-------�Խ���-------");
				System.out.println(i+1+"�� �Խñ�");
				list[i] = new Board(board.getWriter(), board.getTitle(), board.getArticle());
				list[i].infrom();
				System.out.println("-------------------");
				i++;
			} else if(choice==2) {
				System.out.println("�ҷ��� �Խñ� ��ȣ�� �Է��ϼ���");
				int num=sc.nextInt();
				System.out.println("-------�Խ���-------");
				System.out.println(num+"�� �Խñ�");
				list[num-1] = new Board(board.getWriter(), board.getTitle(), board.getArticle());
				list[num-1].infrom();
				System.out.println("-------------------");
			}
			else if(choice==3)
				System.out.println("������ �Խ�");
				System.out.println("�ý�������");
					run=false;
				

		}
	}
}
