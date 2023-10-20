package ch05.exam;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		/*1. 참조 타입에 대하나 설명으로 틀린 것은 무엇?
		 * --> 4번 참조 타입은 null 값으로 초기화 할수 없다
		 * 2. 자바에서 메모리 사용에 대한 설명으로 틀린 것은 무엇입니까?
		 * --> 3번 참조되지 않는 객체는 프로그램에서 직접 소멸 코드를 작성하는 것이좋다.
		 * 3. String Type에 대한 설명으로 틀린것은?
		 * --> 2번 타입의 문자열 비교는 == 를 사용해야한다.
		 * 4. 배열을 생성하는 방법으로 틀린것은?
		 * --> 2번
		 * 5. 배열의 기본 초기값에 대한 설명으로 틀린 것은?
		 * --> 3번 boolean 타입 배열 항목의 기본 초기값은 true이다.
		 * 6. 다음은 배열 길이를 출력하는 코드이다. 실행 결과는?
		 * --> 3, 5
		 * 7. 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해봐라*/
		// int[] array = {1, 5, 3, 8, 2};
		// int max = Integer.MIN_VALUE;
		// for (int i : array) {
		// 	if(max < i){
		// 		max = i;
		// 	}
		// }
		// System.out.println("max = " + max);
		/*8. 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요*/
		/*int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		int sum = 0;
		double avg = 0;
		int len = 0;
		for (int[] ints : array) {
			len += ints.length;
			for (int anInt : ints) {
				sum+=anInt;
			}
		}
		avg = (double) sum / len;
		System.out.println("avg = " + avg);*/

		/*학생들의 점수를 분석하는 프로그램을 만드려고 합니다.
		 * 키보드로부터 학생 수와 각 학생들의 점수 입력 받고
		 * while문과 scanner의 nextline메소드를 이용해서
		 * 최고 점수 및 평균 점수를 출력하는 코드를 작성 */
		Scanner sc = new Scanner(System.in);
		int totalStudent = Integer.MIN_VALUE;
		int[] scores = new int[0];
		int maxScore = 0;
		int sum = 0;
		analyzingStudent:
		while (true) {

			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			int input = sc.nextInt();
			switch (input) {
				case 1:
					System.out.print("학생수> ");
					totalStudent = sc.nextInt();
					scores = new int[totalStudent];
					break;
				case 2:
					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]> ");
						int num = sc.nextInt();
						scores[i] = num;
						sum += num;
						if (maxScore < num) {
							maxScore = num;
						}
					}
					break;
				case 3:
					for (int i = 0; i < scores.length; i++) {
						System.out.println("score[" + i + "]: " + scores[i]);
					}
					break;
				case 4:
					System.out.println("최고점수: " + maxScore);
					double avg = (double)sum / totalStudent;
					System.out.println("평균점수: " + avg);
					break;
				default:
					System.out.println("프로그램 종료");
					break analyzingStudent;
			}
		}

	}
}
