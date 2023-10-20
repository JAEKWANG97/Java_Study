package ch05.sec09;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		//길이가 3인 배열
		int[] oldIntArray = {1, 2, 3};
		//길이가 5인 배열을 새로 생성
		int[] neweIntArray = new int[5];
		//배열 항목 복사
		for (int i = 0; i < oldIntArray.length; i++) {
			int i1 = oldIntArray[i];
			neweIntArray[i] = i1;

		}
		for (int i = 0; i < neweIntArray.length; i++) {
			int i1 = neweIntArray[i];
			System.out.println("i1 = " + i1);
		}
	}
}
