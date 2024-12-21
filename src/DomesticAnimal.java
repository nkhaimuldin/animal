public class DomesticAnimal extends Animal{
    private String owner;


    public DomesticAnimal(){
        super(); //calls no arg constructor of the superclass
    }

    public DomesticAnimal(String name, int age, boolean gender, String owner){
        super(name, age, gender); //calls parametrized constructor of super class
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Owner: " + owner + "\n" + super.toString();
    }
}
