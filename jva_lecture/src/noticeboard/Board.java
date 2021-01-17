package noticeboard;

import java.util.Scanner;

public class Board {
	Scanner sc= new Scanner(System.in);
	private String writer = "";
	private String title = "";
	private String article = "";
	private int count=0;;

	public Board(String writer, String title, String article) {
			this.writer=writer;
			this.title=title;
			this.article=article;
	 }
	public Board() {
	}
	public String getArticle() {
		return this.article;
	}

	public String setArticle() {
		String article=sc.next();
		this.article = article;
		System.out.println(this.article);
		return article;
	}

	public void setwriter() {
		String writer=sc.next();
		this.writer = writer;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setTitle() {
		String title=sc.next();
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}
	
	public void infrom() {
		System.out.println("작성자:"+writer);
		System.out.println(" 제목:"+title);
		System.out.println(" 내용:"+article);
	}
}
