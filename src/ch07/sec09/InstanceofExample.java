package ch07.sec09;

public class InstanceofExample {
    //main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        //person이 참조하는 객체가 Student타입인지 확인
        //person이 참조한느 객체가 Student 타입일 경우
        // student 변수에 대입(타입 변환 발생)
        if (person instanceof Student student) {
            System.out.println("student.studentNo + student.name = " + student.studentNo + student.name);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        personInfo(new Student("김길동", 10));
    }
}
