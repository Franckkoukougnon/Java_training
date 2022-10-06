
public class classTuto {
    public static void main(String[] args) {
        Marque apple = new Marque("Apple");
        Telephone iphone = new Telephone(34000, "iphone", apple);
        System.out.println("Mon telephne est un : " + iphone.nom + " avec un pixel de : " + iphone.pixel
                + " et  la marque est un " + apple.nom);

    }
}

class Telephone {
    int pixel;
    String nom;
    Marque marque;

    public Telephone(int pixel, String nom, Marque marque) {
        this.pixel = pixel;
        this.nom = nom;
        this.marque = marque;
    }

}

class Marque {
    String nom;

    public Marque(String nom) {
        this.nom = nom;
    }
}
