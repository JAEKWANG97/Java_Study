package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("홍긽동", 85));
        studentList.add(new Student("홍긽동", 92));
        studentList.add(new Student("홍긽동", 87));

        //Student를 score 스트림으로 변환

        studentList.stream().mapToInt(s -> s.getScore()).forEach(System.out::println);
    }
}
