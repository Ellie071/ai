package com.lec.quiz;
import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("국어 점수를 입력하세요 >");
        int kor = sc.nextInt();

        System.out.print("영어 점수를 입력하세요 >");
        int eng = sc.nextInt();

        System.out.print("수학 점수를 입력하세요 >");
        int mat = sc.nextInt();
        
        int tot = kor + eng + mat;
        double avg = (double)tot / 3;
        
        System.out.printf("국어: %d\n", kor);
        System.out.printf("영어: %d\n", eng);
        System.out.printf("수학: %d\n", mat);
        System.out.printf("총점: %d\n", tot);
		System.out.printf("평균: %.2f\n", avg);
    }
}
