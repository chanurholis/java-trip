import java.util.ArrayList;
import java.util.Collections;

class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();

        // add array
        myArrayList.add("Chacha Nurholis");
        myArrayList.add("Aselole");
        myArrayList.add("Maudy Ayunda");
        
        // print array
        System.out.println("\n" + myArrayList);
        
        // get array
        System.out.println("\n" + myArrayList.get(0));
    
        // set array
        myArrayList.set(2, "Lorem Ipsum");
        System.out.println(myArrayList);

        // remove array
        myArrayList.remove(2);
        System.out.println(myArrayList);

        // remove all
        myArrayList.clear();
        System.out.println(myArrayList);

        // array size
        myArrayList.add("Asep");
        System.out.println(myArrayList.size());

        ArrayList<String> myCars = new ArrayList<String>();
        myCars.add("Volvo");
        myCars.add("BMW");
        myCars.add("Ford");
        myCars.add("Mazda");
        System.out.println("before sort with collections " + myCars);
        Collections.sort(myCars);
        System.out.println("after sort with collections " + myCars);

        for (String car : myCars) {
            System.out.println(car);
        }
    }
}