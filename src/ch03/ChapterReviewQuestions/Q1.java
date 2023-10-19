package ch03.ChapterReviewQuestions;

public class Q1 {
    // 다음 코드를 실행 했을 때 출력 결과를 작성해보세요.
    // 답은 30이라 생각 했지만 31임
    // y-- 연산자는 연산이 끝난 후 초기화됨
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println("z = " + z);
        System.out.println("y = " + y);
    }
}
