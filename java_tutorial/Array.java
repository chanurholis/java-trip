public class Array {
    String[] arrayNames = { "Chacha Nurholis" };

    public static void main(String[] args) {
        Array myArray = new Array();

        // length of array
        lengthOfArray(myArray.arrayNames);

        // get detail of array
        getDetailArray(myArray.arrayNames);
    }

    public static void lengthOfArray(String[] arrays) {
        System.out.println(arrays.length);
    }

    public static void getDetailArray(String[] arrays) {
        for (String array : arrays) {
            System.out.println(array);
        }
    }
}
