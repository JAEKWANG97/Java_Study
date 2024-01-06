package ch12.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");
        Student s3 = s2;

        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                System.out.println("s1 , s2  are equals ");
            } else {
                System.out.println("s1, s2 are not equals, because data is different");
            }
        } else {
            System.out.println("s1,s2 have different hashCode");
        }

        if(s3.hashCode() == s2.hashCode()){
            System.out.println("s2 , s3 have equal hashCode");
        }
    }
}
