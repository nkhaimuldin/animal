import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();


        DomesticAnimal domesticAnimal = new DomesticAnimal("Barsik", 3, true, "Yerzat");
        animals.add(domesticAnimal);

        Bird bird = new Bird();
        animals.add(bird);

        System.out.println(domesticAnimal);
    }
}