
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 10, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 7, false);
        zoo myZoo = new zoo("MyZoo", "Tunis", 20);
        myZoo.ajouterAnimal(lion, 0);
        System.out.println("Informations des animaux :");
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
        System.out.println(myZoo.toString());

        myZoo.ajouterAnimal(lion, 0);
        myZoo.ajouterAnimal(elephant, 1);
        myZoo.ajouterAnimal(crocodile, 2);


        System.out.println("Affichage d'un animal :");
        System.out.println(lion);
        System.out.println();

        System.out.println("Affichage du zoo :");
        System.out.println(myZoo);
    }
}
