import java.io.*;
import java.util.*;

public class DuelingBeards_JR {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("Beards.dat"));
        //Scanner file = new Scanner(System.in);
        Map<Long, String> map = new TreeMap<>();
        while (file.hasNext()){
            String name = file.next();
            long l = Long.parseLong(file.next());
            map.put(l, name);
        }
        for (long l : map.keySet()){
            System.out.println(map.get(l) + " " + l);
        }
    }
}
