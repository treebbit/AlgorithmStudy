/**
 * 날짜: 2021.08.01
 * 이름: 임채은
 * 문제 URL: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWl0ZQ8qn7UDFAXz&categoryId=AWl0ZQ8qn7UDFAXz&categoryType=CODE&problemTitle=7272&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1&&&&&&&&&
 * 문제 푸는데 걸린 시간 : 시간 못잼... 약 30분~1시간정도 걸린듯...
 * 시간 : 220ms
 * 메모리 : 17632KB
 */

package swea.p7272;

import java.util.Scanner;

public class Main {
	final String[] HOLE_ONE = {"A", "D", "O", "P", "Q", "R"};    // 구멍 1개 문자
	final String[] HOLE_TWO = {"B"};    // 구명 2개 문자
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] a = "ㅁㄴㅇㄹㄴㅇ".split("");
		
		// 입력
		int t = scan.nextInt();
		String str = scan.nextLine();
		String[] tests = new String[t];
		for(int i=0; i<t; i++) {
			tests[i] = scan.nextLine();
		}
		
		// 문자열 같은지 확인하기
		for(int i=0; i<t; i++) {
			for(int j=0; j<str.length(); j++) {
				if(tests[i].charAt(j)){
					
				}
			}
		}
	}

}
