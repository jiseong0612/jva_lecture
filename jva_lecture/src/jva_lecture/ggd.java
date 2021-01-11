package jva_lecture;

import java.util.Scanner;

public class ggd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2~에서 9사이의 숫자를 입력하세요");
		int x = sc.nextInt();
		if ((x <= 1) || (x >= 10)) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			ggd(x);
		}

		sc.close();
	}

	private static void ggd(int x) {
		for (int i = 1; i < 10; i++) {
			System.out.println(x + "X" + i + "=" + x * i);
		}

	}

}
