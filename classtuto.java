public class classtuto {
    public static void main(String[] args) {
        Voiture audi = new Voiture("Nissan", "Mael", 230123);
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