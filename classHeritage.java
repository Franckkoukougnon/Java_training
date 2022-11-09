public class classHeritage {
    public static void main(String[] args) {
        Drogba drogba = new Drogba();
        drogba.ballonDor();

        Etoo etoo = new Etoo();
        etoo.ballonDor();

    }
}

class Drogba {
    void ballonDor() {
        System.out.println("J'ai un ballon d'or !!!");
    }
}

class Etoo extends Drogba {

    @Override
    void ballonDor() {
        super.ballonDor();
        nation();
    }

    void nation() {
        System.out.println("je suis camerounais !!!");
    }
}