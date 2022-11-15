import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Calendar_JR {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("calendar.dat"));
        //Scanner file = new Scanner(System.in);
        int t = file.nextInt(); file.nextLine();
        while (t-->0){
            SimpleDateFormat d = new SimpleDateFormat("yyyy MM dd");
            try{
                Date one = d.parse(file.nextLine());
                Date two = d.parse(file.nextLine());
                System.out.printf("%,d%n",TimeUnit.DAYS.convert(two.getTime() - one.getTime()
                , TimeUnit.MILLISECONDS));

            }
            catch(Exception e){
                System.out.println("fuck");
            }
        }
    }
}
