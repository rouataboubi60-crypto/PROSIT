package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
public class ZooManagement {

    public static void main(String[] args) {

        Aquatic aq = new Aquatic("Fish", "Requin", 5, false, "Océan");
        Terrestrial t1 = new Terrestrial("Felidae", "Lion", 8, true, 4);
        Dolphin d = new Dolphin("Cetace", "Dolphin", 3, true, "Mer", 25.5f);
        Penguin p = new Penguin("Bird", "Pingouin", 2, false, "Arctique", 40.2f);
        aq.swim();
        d.swim();
        p.swim();
        /*System.out.println(a1);
        System.out.println(t1);
        System.out.println(d1);
        System.out.println(p1);*/
    }
}

