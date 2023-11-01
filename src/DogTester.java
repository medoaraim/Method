public class DogTester {
    public static void main(String[] args) {
        Dog chloe =  new Dog();
        chloe.write();
        chloe.setName("Chloe");
        chloe.write();
        chloe.setBreed("Poodle");
        chloe.write();

        Dog rocky = new Dog("Rocky", "Rottweiller",5);
        rocky.write();
        System.out.println(rocky);
    }
}
