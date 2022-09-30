public class OpeNumeric {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2 || i == 5) {
                continue;
            }
            System.out.println("Valeur de i : " + i + ".");
        }
    }
}