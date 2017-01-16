import org.junit.Assert;
import org.junit.Test;

public class testAnimals {

     @Test
     public void testCat() {
         Cat cat = new Cat();
         Assert.assertEquals("meeeaaaaooowww!", cat.makeSound());
     }

     @Test
     public void testDuck() {
         Duck duck = new Duck();
         Assert.assertEquals("duck duck!", duck.makeSound());
     }

     @Test public void testDuckSwimm(){
         Duck duck = new Duck();
         Assert.assertEquals("I'm swimming for " + 10 +  " minutes!", duck.swimm(10));
     }

    @Test
    public void testBird() {
        Bird bird = new Bird();
        Assert.assertEquals("tweet tweet", bird.makeSound());

    }

    @Test public void testBirdFly(){
        Bird bird = new Bird();
        Assert.assertEquals("I'm flying for " + 10 +  " minutes!", bird.fly(10));
    }

    @Test
     public void testDog() {
         Dog dog = new Dog();
         Assert.assertEquals("woof woof", dog.makeSound());
     }


}
