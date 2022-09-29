public class MyScopeExample {
    static String root = "Je suis disponible pour toutes les lignes de code dans mon contexte.";

    public static void main(String[] args) {
        String spy = "Je suis un espion";
        System.out.println(root); // Ok
        System.out.println(spy); // OK

    }

    public static void helpfulFunction(String[] args) {
        String anotherSpy = " Je suis un autre espion";
        System.out.println(root); // Ok
        System.out.println(anotherSpy); // Ok
    }
}
