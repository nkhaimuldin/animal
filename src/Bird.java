public class Bird extends Animal {
    private String something;


    public Bird() {
        super();
    }

    public Bird(String name, int age, boolean gender, String something) {
        super(name, age, gender);
        this.something = something;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "something='" + something + '\'' +
                '}';
    }
}
