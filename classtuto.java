public class classtuto {
    public static void main(String[] args) {

        // Declaration d'une class
        Voiture audi = new Voiture("Nissan", "Mael", 230123);
        // Declaration d'une class fille qui herite de sa class mère
        Bateau toyota = new Bateau();
        toyota.decollage();
        // Declaration d'une class fille qui herite de sa class mère
        Vehicule Nissan = new Vehicule();
        Nissan.decollage();
        System.out.println("la voiture est une " + audi.marque);
    }
}

class Voiture {
    String marque;
    String propriétaire;
    int kilometrage;

    Voiture(String marque, String propriétaire, int kilometrage) {
        this.marque = marque;
        this.propriétaire = propriétaire;
        this.kilometrage = kilometrage;
    }
}

// Class mère
class Vehicule {
    void decollage() {
        System.out.println("Vrooooom");
    }

}

// class fille
class Bateau extends Vehicule {

    void decollage() {
        super.decollage();
        allumerFeux();
    }

    void allumerFeux() {
        System.out.println("Feux Allumés !!!");
    }

}

// class fille
class Avion extends Vehicule {

}