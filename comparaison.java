public class comparaison {
    public static void main(String[] args) {
        int nombre = 2;
        if (nombre == 1) {
            console("If 1");
        } else if (nombre == 2) {
            console("if 2");
        } else {
            console("else");
        }

        switch (nombre) {
            case 1:
                console("Switch 1");
                break;
            default:
                console("default");
        }

    }

    static void console(String text) {
        System.out.println(text);
    }
}
