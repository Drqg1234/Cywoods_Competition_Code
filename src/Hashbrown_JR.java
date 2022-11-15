import java.io.*;
import java.util.*;

public class Hashbrown_JR {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("hashbrowns.dat"));
        //Scanner file = new Scanner(System.in);
        int t = file.nextInt();
        while (t-->0){
            int tt = file.nextInt();
            file.next();
            while (tt-->0){
                System.out.print("F");
            }
            System.out.println();
        }
    }
}
