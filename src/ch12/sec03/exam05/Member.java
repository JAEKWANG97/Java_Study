package ch12.sec03.exam05;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member {
    private final String id;
    @NonNull //NonNull은 null이 아닌 다른 값으로 Setter을 통해 변경 가능함
    private String name;
    private int age;
}

