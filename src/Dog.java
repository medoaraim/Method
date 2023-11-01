public class Dog {
    //name, breed, age
    String name;
    String breed;
    int age;

    //constructor
    public Dog() {
        name = "Fido";
        breed = "Mutt";
        age = 2;
    }
    public Dog(String name, String breed, int age) {
        this.age = age;
        this.breed = breed;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setBreed(String b) {
        this.breed = b;
    }
    public void setName(String n) {
        this.name = n;
    }
    public void write() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " converted to human years is: " + getHumanAge());
    }
    public int getHumanAge() {
        return age * 7;
    }
    public String toString() {
        return "////Dog Information\\\\\\\\\nName: " + getName() + "\nBreed: " + getBreed() + "\nAge: " +getAge();
    }
}
