public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
}
    public void afficherInfo() {
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Nom : " + name +
                ", Famille : " + family +
                ", Âge : " + age +
                ", Mammifère : " + (isMammal ? "Oui" : "Non");
    }
    }


