import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(7);
        System.out.println(myList);
        myList.add(5);
        System.out.println(myList);
        myList.add(1, 12);
        System.out.println(myList);
        myList.add(2, 25);
        System.out.println(myList);
        myList.remove(2);
        System.out.println(myList);

    }
}
