package ch05.sec07;

public class MultidimensionArrayByValueListExample {
	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores = {
			{80, 90, 96},
			{76, 88}
		};

		//배열의 길이
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);

		//첫 번째 반의 세번째 학생의 점수 읽기
		System.out.println("scores[0][2]: " + scores[0][2]);
		//두 번째 반의 두번째 학생의 점수 읽기
		System.out.println("scores[1][1]: " + scores[1][1]);

		//첫번쨰 반의 평균 점수 구하기
		int class1Sum = 0;
		for (int i = 0; i < scores.length; i++) {
			class1Sum += scores[0][i];

		}
		double class1avg = (double)class1Sum / scores[0].length;
		System.out.println("class1avg = " + class1avg);

		//두 번째 반의 평균 점수 구하기
		int class2Sum = 0;
		for (int i : scores[1]) {
			class1Sum += i;
		}
		double class2Avg = (double)class2Sum / scores[1].length;
		System.out.println("class2Avg = " + class2Avg);

		//전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for (int[] score : scores) {
			totalStudent += score.length;
			for (int i : score) {
				totalSum += i;
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("totalAvg = " + totalAvg);
	}
}
