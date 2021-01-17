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
			System.out.println("1.작성 2.불러오기 3.삭제");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println();
				System.out.print("작성자 > ");
				board.setwriter();
				System.out.print("제목 > ");
				board.setTitle();
				System.out.print("내용 > ");
				board.setArticle();

				System.out.println("-------게시판-------");
				System.out.println(i+1+"번 게시글");
				list[i] = new Board(board.getWriter(), board.getTitle(), board.getArticle());
				list[i].infrom();
				System.out.println("-------------------");
				i++;
			} else if(choice==2) {
				System.out.println("불러올 게시글 번호를 입력하세요");
				int num=sc.nextInt();
				System.out.println("-------게시판-------");
				System.out.println(num+"번 게시글");
				list[num-1] = new Board(board.getWriter(), board.getTitle(), board.getArticle());
				list[num-1].infrom();
				System.out.println("-------------------");
			}
			else if(choice==3)
				System.out.println("삭제할 게시");
				System.out.println("시스템종료");
					run=false;
				

		}
	}
}
