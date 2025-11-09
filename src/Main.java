
public class Main {
    public static void main(String[] args) {
         zoo zoo1 = new zoo("Zoo de Tunis", "Tunis");
          zoo zoo2 = new zoo("Zoo de Sousse", "Sousse");

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 10, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 7, false);
        Animal lion2 = new Animal("Felidae", "Lion", 5, true);
        Animal tigre = new Animal("Felidae", "Tigre", 4, true);

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo2.addAnimal(crocodile);

        // Vérifier si zoo1 est plein
        System.out.println("Le zoo1 est plein ? " + zoo1.isFull());

        // Comparer les deux zoos
        zoo plusGrand = zoo1.compareZoo(zoo2);
        System.out.println("Le zoo avec le plus d’animaux est : " + plusGrand.name);
    }
}
        /*zoo2.addAnimal(crocodile);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(crocodile);
        System.out.println("\n--- Affichage du zoo ---");
        System.out.println(myZoo);
        myZoo.displayAnimals();
     /*
        System.out.println("\nAvant suppression :");
        myZoo.displayAnimals();

        myZoo.removeAnimal("Éléphant");

        System.out.println("\nAprès suppression :");
        myZoo.displayAnimals();


        myZoo.removeAnimal("Tigre");
        /*System.out.println();
        myZoo.displayAnimals();*/



        /*myZoo.ajouterAnimal(lion, 0);*/
       /* System.out.println("Informations des animaux :");
        lion.afficherInfo();
        System.out.println();
        elephant.afficherInfo();
        System.out.println();
        crocodile.afficherInfo();
        System.out.println();
        myZoo.afficherInfoZoo();
        myZoo.displayZoo();
        System.out.println("Affichage avec displayZoo() :");
        myZoo.displayZoo();
        System.out.println();
        System.out.println("Affichage direct avec System.out.println(myZoo) :");
        System.out.println(myZoo);  // Appelle automatiquement myZoo.toString()
        System.out.println();
        System.out.println("Affichage avec myZoo.toString() :");
        System.out.println(myZoo.toString());*/

        /*if (myZoo.addAnimal(lion)) System.out.println(lion.name + " ajouté avec succès !");
        if (myZoo.addAnimal(elephant)) System.out.println(elephant.name + " ajouté avec succès !");
        if (myZoo.addAnimal(crocodile)) System.out.println(crocodile.name + " ajouté avec succès !");

        // Essayer d'ajouter plus d'animaux que la capacité maximale
        for (int i = 0; i < 30; i++) {
            Animal a = new Animal("TestFamily", "Animal" + i, i, true);
            if (!myZoo.addAnimal(a)) {
                System.out.println(a.name + " n'a pas pu être ajouté : zoo plein !");
            }
        }

        System.out.println("\nÉtat final du zoo :");
        System.out.println(myZoo);


        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(crocodile);

        // Affichage de tous les animaux
        myZoo.displayAnimals();}}*/

      /*
        int indexLion = myZoo.findAnimalByName("Lion");
        System.out.println("Indice de Lion : " + indexLion);
        int indexLionRecherche = myZoo.findAnimalByName("Lion");
        System.out.println("Indice de Lion recherché : " + indexLionRecherche);
    }}*/

