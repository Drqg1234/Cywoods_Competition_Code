import java.io.*;
import java.util.*;

public class Chicken {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("chicken.dat"));
        //Scanner file = new Scanner(System.in);
        int t = file.nextInt(); file.nextLine();
        while(t-->0){
            String a = file.nextLine();
            System.out.println(a.contains("Cluck") ? "Chicken" : "Lunch time");
        }
    }
}
