import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        // get date local now
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // formatted date
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM");
        String formattedDate = now.format(myFormatObj);
        System.out.println(formattedDate);
    }
}
