public class zoo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Chien();
        Animal a3 = new Pigeon();
        Animal a4 = new Oiseau();

        a1.deplacer();
        a2.deplacer();
        a3.deplacer();
        a4.deplacer();

    }
}

class Animal {
    void deplacer() {
        System.out.println("Je me deplace");
    }
}

class Chien extends Animal {

    @Override
    void deplacer() {

        System.out.println("Ouaf Ouaf");
    }
}

class Oiseau extends Animal {
    void deplacer() {
        super.deplacer();
        System.out.println("Je vole partout");
    }
}

class Pigeon extends Animal {
    void deplacer() {
        System.out.println("Je vole sur toute la ville !!!");
    }
}