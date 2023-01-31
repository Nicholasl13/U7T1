import java.util.*;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Jack");
        Cat cat2 = new Cat("MEOW");
        Cat cat3 = new Cat("Truck");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Kitey");
        Cat cat5 = cats.get(2);
        cats.set(2,cat4);
        System.out.println(cats);
        System.out.println(cat5);
        cat4.setName("Kitey Meow");
        System.out.println(cat4);
        System.out.println(cats);
        for (int i = 0; i < cats.size(); i++) {
            String name = cats.get(i).getName().toUpperCase();
            cats.get(i).setName(name);
        }
        System.out.println(cats);
    }
}
