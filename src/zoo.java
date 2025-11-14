public class zoo {
    private final int NBR_CAGES = 25; // Constante
    private Animal[] animals = new Animal[NBR_CAGES];
    private String name;
    private String city;
    private int animalCount;
    //  Constructeur
    public zoo(String name, String city) {
        setName(name); //  Vérification dans le setter
        this.city = city;
        this.animalCount = 0;
    }
    // Getter et Setter pour name (avec vérification)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println(" Erreur : Le nom du zoo ne doit pas être vide. Nom mis à 'Inconnu'.");
            this.name = "Inconnu";
        }
    }
    //  Getter et Setter pour city
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    //  Getter pour le nombre d’animaux
    public int getAnimalCount() {
        return animalCount;
    }
    //  Méthode pour vérifier si le zoo est plein
    public boolean isFull() {
        return animalCount >= NBR_CAGES;
    }
    public boolean addAnimal(Animal animal) {
        if (isFull()) {
            System.out.println(" Impossible d'ajouter " + animal.getName() + " : le zoo est plein !");
            return false;
        }
        // Vérifier unicité
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName()) &&
                    animals[i].getFamily().equals(animal.getFamily())) {
                System.out.println(" " + animal.getName() + " existe déjà dans le zoo !");
                return false;
            }
        }

        animals[animalCount] = animal;
        animalCount++;
        System.out.println(" " + animal.getName() + " ajouté avec succès !");
        return true;
    }
    //  Méthode d’affichage du zoo
    public void displayZoo() {
        System.out.println("Zoo : " + name + " (" + city + ")");
        System.out.println("Nombre d’animaux : " + animalCount);
    }
    @Override
    public String toString() {
        return "Zoo [nom=" + name + ", ville=" + city + ", animaux=" + animalCount + "/" + NBR_CAGES + "]";
    }
}
    /*int nbrCages;
    int animalCount = 0;
    int capacity;*/
    /*
       /* this.nbrCages = nbrCages;
        this.capacity = capacity;
        this.animals = new Animal[capacity];
        this.animalCount = 0;*/

    /*public boolean addAnimal(Animal animal) {
        if (isFull()) {
            System.out.println(" Impossible d'ajouter " + animal.name + " : le zoo est plein !");
            return false;
        }
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name) && animals[i].family.equals(animal.family)) {
                System.out.println(" " + animal.name + " existe déjà dans le zoo !");
                return false;
            }
        }

        // Ajout de l’animal
        animals[animalCount] = animal;
        animalCount++;
        System.out.println("✅ " + animal.name + " ajouté avec succès !");
        return true;
    }*/

    /*
    public boolean addAnimal(Animal animal) {
        if (animalCount >= NBR_CAGES) {
            System.out.println(" Impossible d'ajouter " + animal.name + " : zoo plein (" + NBR_CAGES + " animaux max).");
           return false;
        }
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name) && animals[i].family.equals(animal.family)) {
                System.out.println(" " + animal.name + " existe déjà dans le zoo !");
                return false;
            }
        }
        animals[animalCount] = animal;
        animalCount++;
        System.out.println(" " + animal.name + " ajouté avec succès !");
        return true;
    }*/
    /* public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
            return;
        }
        System.out.println("Animaux présents dans le zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("- " + animals[i]);
        }
    }
    //  Vérifier si le zoo est plein
    public boolean isFull() {
        return animalCount >= NBR_CAGES;
    }
    //  Comparer deux zoos
    public zoo compareZoo(zoo z) {
        if (this.animalCount > z.animalCount) {
            return this;
        } else {
            return z;
        }
    }*/
/*
    // Supprimer un animal par nom
public boolean removeAnimal(String name) {
    for (int i = 0; i < animalCount; i++) {
        if (animals[i].name.equals(name)) {
            // Décaler les éléments suivants
            for (int j = i; j < animalCount - 1; j++) {
                animals[j] = animals[j + 1];
            }
            animals[animalCount - 1] = null; // dernière case devient vide
            animalCount--; // décrémente le compteur
            System.out.println(" " + name + " supprimé du zoo.");
            return true;
        }
    }
    System.out.println("Animal " + name + " introuvable.");
    return false;
}*/
    /*
    public int findAnimalByName(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1; // non trouvé
    }*/
   /* @Override
    public String toString() {
        return "Zoo : " + name + " (" + city + "), Capacité : " + NBR_CAGES + " cages, " +
                "Animaux présents : " + animalCount;
    }
}*/
   /*
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
    }}*/
    /*
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
        }*/

