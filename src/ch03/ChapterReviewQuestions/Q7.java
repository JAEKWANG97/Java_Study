package ch03.ChapterReviewQuestions;

public class Q7 {
    public static void main(String[] args) {
        // 다음은 % 연산을 수행한 결과를 10을 더하는 코드입니다. NaN 값을 검사해서 올바른 결과가 출력될 수 있돌고 빈칸 코드를 작성해라
        double x = 5.0;
        double y = 0.0;
        double z = 5 % y;

        if (Double.isNaN(z)){
            System.out.println("0.0으로 나눌 수 없습니다.");
        }else {
            double result = z + 10;
            System.out.println("result = " + result);
        }
    }
}
