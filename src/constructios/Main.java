package constructios;

public class Main {
    public static void main(String[] args) {

        Shirt s = new Shirt();
        s.putOn();

        Human human1 = new Human("Badri",40, 145);
        Human human2 = new Human("Adhikari",16, 100);

        System.out.println(human1.age);
        System.out.println(human2.name);

        human2.eat();
        human1.drink();

    }

}
