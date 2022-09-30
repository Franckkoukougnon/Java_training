public class OC {

    public static void main(String[] args) {
        int i = 0;
        while (i < 15) {
            i = randomNumber();
            print(i);

        }
    }

    static void print(int nombre) {
        System.out.println("Nombre : " + Integer.toString(nombre));
    }

    static int randomNumber() {
        return (int) (Math.random() * 20);
    }

}
