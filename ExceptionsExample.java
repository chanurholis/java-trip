public class ExceptionsExample {
    public static void main(String[] args) {
        try {
            // System.out.println("Ok");
            // int[] numbers = { 1, 2, 3, 4 };
            // System.out.println(numbers[10]);

            validateAge(15);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Something when wrong!");
        } finally {
            System.out.println("try catch finished!");
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
