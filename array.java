public class array {
    public static void main(String[] args) {
        int[] myArray = { 10, 20, 30, 40, 50, 60 };
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 30) {
                System.out.println("J'ai trouvé mon basket" + [i] + " !!!");
                break;

            }
            System.out.println("J'en suis a basket " +[i] + "....");
        }
    }
}
