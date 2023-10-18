package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        String str  =  "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        str = "번호\t이름\t직업";
        System.out.println(str);

        System.out.println("나는\n");
        System.out.println("자바를\n");
        System.out.println("배웁니다.");
        System.out.println("나는");
        System.out.println("자바를");
        System.out.println("배웁니다.");

        // java 13 부터는 다음과 같은 텍스트 블록 문법을 제공함


        String str2 = """
                asdasdasd
                asdfasdfasdf
                asdfasdfasdf
                """;

        System.out.println(str2);
    }
}
