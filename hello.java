
public class hello {
    public static void main(String[] args) {
        if (getBoolean()) {
            console("if");
        } else {
            console("else");
        }
    }

    static void console(String text) {
        System.out.println("Condition : " + text);
    }

    static boolean getBoolean() {
        return true;
    }
}
