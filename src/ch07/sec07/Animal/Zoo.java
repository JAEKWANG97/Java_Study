package ch07.sec07.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Bird());
        zoo.add(new Fish());
        zoo.add(new Bird());
        // 업 캐스팅

        for (Animal animal : zoo) {
            animal.eat();
        }

        for (Animal animal : zoo) {
            if(animal instanceof Bird){
                Bird bird = (Bird) animal; // 다운 캐스팅\
                bird.fly();
            }
        }

    }
}
