
public class Duck extends Bird {

    public String swimm( int minutes) {
        return "I'm swimming for " + minutes + " minutes!";
    }

    @Override
    public String makeSound(){
        return "duck duck!";
    }
}
