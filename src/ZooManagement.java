import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
        String ZooName="my zoo";
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();
        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = 20;
        if (sc.hasNextInt()) {
            nbrCages = sc.nextInt();
        } else {
            System.out.println("Erreur : le nombre de cages doit être un entier.");
            sc.close();
            return;
        }
        if (zooName.isEmpty()) {
            System.out.println("Erreur : le nom du zoo ne peut pas être vide.");
        } else if (nbrCages <= 0) {
            System.out.println("Erreur : le nombre de cages doit être positif.");
        } else {
            System.out.println(zooName + " comporte " + nbrCages + " cages");
        }

        sc.close();
    }
}


