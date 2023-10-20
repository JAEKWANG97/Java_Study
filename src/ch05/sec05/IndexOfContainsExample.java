package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바프로그래밍";

        int location  = subject.indexOf("프로그래밍"); // subject에 프로그래밍이 없으면 -1 반환
        System.out.println("location = " + location);
        String subString = subject.substring(location); // True False를 반환
        System.out.println("subString = " + subString);

        location = subject.indexOf("자바");

        if(location != -1){
            System.out.println("자바와 관련 있는 책이군요!");
        } else {
            System.out.println("자바와 관련 없는 책이군요!");
        }

        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련 없는 책이군요");
        }
    }
}
