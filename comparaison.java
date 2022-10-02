public class comparaison {
    public static void main(String[] args) {
        int nombre = 2;

        switch (nombre) {
            case 1:
                console("Switch 1");
                break;

            case 2:
                console("Switch 2");
                break;
            case 3:
                console("Switch 3");
                break;
            default:
                console("Switch Default");

        }

    }

    static void console(String text) {
        System.out.println(text);
    }
}
