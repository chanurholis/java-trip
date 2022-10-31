import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        // print first item
        System.out.println(it.next());

        // loop
        while (it.hasNext()) {
            System.out.print(it.next() + "\n");
        }
    }
}
