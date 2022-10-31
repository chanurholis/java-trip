package java_how_to;

public class CountWords {
    public static void main(String[] args) {
        String words = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old";
        int count = words.split("\\s").length;
        System.out.println(count);
    }
}
