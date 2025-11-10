package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tigre = new Animal("Felidae", "Tigre", 4, true);

        Zoo myZoo = new Zoo("Zoo de Tunis", "Tunis");
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);

        myZoo.displayZoo();
        System.out.println(myZoo);
    }
}
