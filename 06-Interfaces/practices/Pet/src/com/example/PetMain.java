package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();

        Pet f = new Fish();
        Pet c = new Cat();
        Pet c2 = new Cat("Tomy");
        f.play();
        f.getName();
        System.out.println(((Fish) f).getName());
        playWithAnimal((Animal)(c));
        playWithAnimal(s);
        playWithAnimal((Animal)f);
    }

    public static void playWithAnimal(Animal a){
        if (a instanceof Pet){
            ((Pet)(a)).play();
            return;
        }
        System.out.println("Danger! wild Animal.");
    }
    
}