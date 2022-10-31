import java.util.HashSet;

class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        // check if an items exists
        // return: true or false
        System.out.println(cars.contains("Mazda"));
    }
}