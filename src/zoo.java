public class zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    public zoo(String name,String city,int nbrCages){
       this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }
    public void ajouterAnimal(Animal animal, int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = animal;
        } else {
            System.out.println("Index invalide pour ajouter l'animal.");
        }
    }
    @Override
    public String toString() {
        String info = "Nom du zoo : " + name +
                ", Ville : " + city +
                ", Nombre de cages : " + nbrCages +
                "\nAnimaux présents :";
        for (Animal a : animals) {
            if (a != null) {
                info += "\n- " + a.toString();
            }
        }
        return info;
    }
    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }
    public void afficherInfoZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
        System.out.println("Animaux présents :");
        for (Animal a : animals) {
            if (a != null) {
                System.out.println("- " + a.name + " (" + a.family + ")");
            }
        }
}}
