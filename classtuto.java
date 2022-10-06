public class classtuto {
    public static void main(String[] args) {
        Voiture audi = new Voiture("Nissan", "Mael", 230123);
        Bateau toyota = new Bateau();
        toyota.decollage();

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

class Vehicule {
    void decollage() {
        System.out.println("Vrooooom");
    }

}

class Bateau extends Vehicule {

}

class Avion extends Vehicule {

}