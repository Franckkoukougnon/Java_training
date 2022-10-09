
public class classTuto {
    public static void main(String[] args) {
        Nissan nissan = new Nissan();
        nissan.start();

        Mercedes mercedes = new Mercedes();
        mercedes.start();

    }

}

class Voiture {
    void start() {
        System.out.println("Vrooooom !!!");
    }
}

class Nissan extends Voiture {

    @Override
    void start() {
        // TODO Auto-generated method stub
        super.start();
        allumerFeux();
    }

    void allumerFeux() {
        System.out.println("Allumage Feux !!!");
    }

}

class Mercedes extends Voiture {

}