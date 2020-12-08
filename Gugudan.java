package main;

import java.util.Scanner;

public class Gugudan {
	
	/**
	 * 질문 출력문(몇 단으로 할 것인지?)
	 */
	private static void printQuestion() {
		System.out.println("몇 단?");
	}
	
	/**
	 * 출력문의 단수를 묻고 저장하는 메소드
	 * @param 
	 * @return 구구단 단 입력
	 */
	private static int getDan() {
		Scanner sc = new Scanner(System.in);
	
		printQuestion();
		return sc.nextInt();
	}
	
	/**
	 * 배열생성, 구해진 단수를 통해 구구단의 값을 저장하는 메소드
	 * @param dan 구구단의 단
	 * @param result 구구단으로 저장된 메소드가 저장될 곳
	 * @return result 구구단으로 계산됨
	 */
	private static int[]getCalculate(int dan) {
		int[] result = new int[9];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = dan*(i + 1);
		}
		return result;
	}
	
	/**
	 * 구구단을 출력하는 메소드
	 * @param 
	 * @return 출력
	 */
	private static void printOutput() {
		int dan = getDan();
		int[] result = getCalculate(dan);
		System.out.println("구구단" + dan + "단");
	
	
	for(int i = 0; i < 9; i++) {
		System.out.println(dan + "*" + (i + 1) + "=" + result[i]);
		}
	}	

	public static void main(String[] args) {
		printOutput();
	}
	
	
}
