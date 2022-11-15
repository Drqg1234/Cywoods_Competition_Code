import java.io.*;
import java.util.*;

public class SillyBilly_JR {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("sillybilly_judge.dat"));
        //Scanner file = new Scanner(System.in);
        int t = file.nextInt(); file.nextLine();
        while (t-->0){
            String[] players = file.nextLine().split(" vs. ");
            String line = file.nextLine().toLowerCase();
            System.out.println(line.length() >= 3 && line.substring(line.length() - 3).matches(".*lly")
                    ? players[0]
                    : players[1]);
        }
    }
}
