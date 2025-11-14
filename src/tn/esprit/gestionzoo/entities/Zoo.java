package tn.esprit.gestionzoo.entities;
public class Zoo {
    private final int NBR_CAGES = 25;
    private Animal[] animals = new Animal[NBR_CAGES];
    private String name;
    private String city;
    private int animalCount;
    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animalCount = 0;
    }
    public String getName() { return name; }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println(" Le nom du zoo ne peut pas être vide. Mis à 'Inconnu'.");
            this.name = "Inconnu";
        }
    }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public boolean isFull() {
        return animalCount >= NBR_CAGES;
    }
    public boolean addAnimal(Animal animal) {
        if (isFull()) {
            System.out.println(" Le zoo est plein !");
            return false;
        }
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName()) &&
                    animals[i].getFamily().equals(animal.getFamily())) {
                System.out.println(" Cet animal existe déjà !");
                return false;
            }
        }
        animals[animalCount++] = animal;
        System.out.println(" " + animal.getName() + " ajouté avec succès !");
        return true;
    }
    public void displayZoo() {
        System.out.println("Zoo : " + name + " (" + city + ")");
        System.out.println("Animaux : " + animalCount + "/" + NBR_CAGES);
    }
    @Override
    public String toString() {
        return "Zoo [nom=" + name + ", ville=" + city + ", animaux=" + animalCount + "/" + NBR_CAGES + "]";
    }
}

