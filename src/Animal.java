public class Animal {
    private static int id;
    private int id_gen;
    private String name;
    private int age;
    private boolean gender;

    public Animal(){
        id_gen = id++;
    }

    public Animal(String name, int age, boolean gender) {
        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId_gen() {
        return id_gen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println("Animal eats unknown food");
    }

    public void makeSound(){
        System.out.println("Animal make unknown sound");
    }


    @Override
    public String toString() {
        return "ID: " + id_gen +
                "\nName: " + name +
                "\nAge: " + age +
                "\nGender: " + (gender ? "male" : "female");
    }
}
