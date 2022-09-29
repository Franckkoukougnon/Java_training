public class PrivateClass {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            bonjour(Integer.toString(i));
        }
    }

    static void bonjour(String nom) {
        System.out.println("Bonjour " + nom + " !!");
    }

}
