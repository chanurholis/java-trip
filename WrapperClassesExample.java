import java.util.ArrayList;

public class WrapperClassesExample {
    public static void main(String[] args) {
        // create array list
        ArrayList<Integer> newArrayListInteger = new ArrayList<Integer>();
        newArrayListInteger.add(1);
        System.out.println(newArrayListInteger);

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
    
        System.out.println(myInt.intValue());
        System.out.println(myDouble.intValue());
        System.out.println(myDouble.toString());
    }
}
