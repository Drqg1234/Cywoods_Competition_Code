import java.io.*;
import java.util.*;

public class Scrambler_JR {
    static String cur;
    static int diff;
    static String wDiff;
    public static void perm (String one, String two){
        if (one.length() == 0){
            int d = Math.abs(cur.compareTo(two));
            if (d > diff){
                diff = d;
                wDiff = two;
            }
        }
        else{
            for (int i = 0; i < one.length(); i++){
                char ch = one.charAt(i);
                String r = one.substring(0, i) + one.substring(i + 1);
                perm(r, two + ch);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("scrambler.dat"));
        while (file.hasNext()){
            cur = file.next();
            diff = 0;
            wDiff = "";
            perm(cur, "");
            System.out.println(cur + " -> " + wDiff);
        }
    }
}
