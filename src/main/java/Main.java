import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal duck = new Duck();
        Animal bird = new Bird();
        Animal cat = new Cat();
        Animal dog =  new Dog();

        List<Animal> animals = Arrays.asList(duck, bird, cat, dog);

        for(Animal a : animals) {
            System.out.println(a.makeSound());
        }

    }




}
