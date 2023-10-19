package ch03.ChapterReviewQuestions;

public class Q3 {
    public static void main(String[] args) {

        //3. 534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 1인당 몇개를 가질 수 있고.
        // 마지막에 몇개가 남지 구하는 코드이다. 빈칸 넣기

        int pencils = 534;
        int students = 30;

        //학생 한 명이 가지는 연필 수
        int pencilsPerStudent = pencils / students;
        System.out.println("pencilsPerStudent = " + pencilsPerStudent);
        
        //남은 연필 수 
        int pecilLeft = pencils % students;
        System.out.println("pecilLeft = " + pecilLeft);
    }
}
