public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;}
    //  Getter et Setter pour family
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    //  Getter et Setter pour name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //  Getter et Setter pour age (avec vérification)
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println(" Erreur : L'âge ne peut pas être négatif. Âge mis à 0 par défaut.");
            this.age = 0;
        }
    }
    // Getter et Setter pour isMammal
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }
    // Méthode toString
        @Override
        public String toString() {
            return "Animal [famille=" + family + ", nom=" + name + ", âge=" + age + ", mammifère=" + isMammal + "]";
        }
    }
    /*public void afficherInfo() {
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Nom : " + name +
                ", Famille : " + family +
                ", Âge : " + age +
                ", Mammifère : " + (isMammal ? "Oui" : "Non");
    }
    }*/


