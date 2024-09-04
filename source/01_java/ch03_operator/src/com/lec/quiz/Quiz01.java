package com.lec.quiz;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >");
		int su = sc.nextInt();
		String result = (su%2 == 0) ? "짝수입니다":"홀수입니다";
		System.out.println("입력하신 수, " + su + "는 " + result);
		System.out.printf("입력하신 수, %d는 %s", su, result);
		sc.close();
	}
}
