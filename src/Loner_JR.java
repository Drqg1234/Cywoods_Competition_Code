import java.io.*;
import java.util.*;

public class Loner_JR {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("loner.dat"));
        //Scanner file = new Scanner(System.in);
        int t = file.nextInt(); file.nextLine();
        while (t-->0){
            String[] line1 = file.nextLine().replaceAll("[^0-9 ]", "").split(" ");
            int t1 = 0;
            for (int i = 1; i < line1.length; i++){
                t1 += line1[i].length() > 0 ? Integer.parseInt(line1[i]) : 0;
            }

            String[] line2 = file.nextLine().replaceAll("[^0-9 ]", "").split(" ");
            int t2 = 0;
            for (int i = 1; i < line2.length; i++){
                t2 += line2[i].length() > 0 ? Integer.parseInt(line2[i]) : 0;
            }

            if (t1 == t2){
                System.out.println("Neither of us have room to talk.");
            }
            else if (t1 > t2){
                System.out.println("Ha! I'm cooler than you loser!");
            }
            else{
                System.out.println("Sigh... I guess I'm not that cool.");
            }
        }
    }
}
