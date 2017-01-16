
public class Bird implements Animal {

    @Override
    public String makeSound() {
        return "tweet tweet";
    }

    public String fly(int minutes) {
        return "I'm flying for " + minutes + " minutes!";
    }

}
