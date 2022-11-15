import java.io.*;
import java.util.*;

public class Thanh_JR {
    static char[][] mat;
    static int[][] shad;
    static int tSteps;
    static ArrayList<Integer> list;
    public static void go(int r, int c, int steps) {
        if (r >= 0 && c >= 0 && r < mat.length && c < mat[r].length && mat[r][c] != '#' && steps < shad[r][c]) {
            if (mat[r][c] == 'P'){
                shad[r][c] = steps;
                tSteps = shad[r][c];
            }
            shad[r][c] = steps;
            if (mat[r][c] == 'O'){
                for (int i = 0; i < list.size() - 1; i += 2){
                    int a = list.get(i);
                    int b = list.get(i + 1);
                    if (a != r || b != c){
                        go(a, b, steps + 1);
                    }
                }
            }
            go(r + 1, c, steps + 1);
            go(r - 1, c, steps + 1);
            go(r, c + 1, steps + 1);
            go(r, c - 1, steps + 1);
        }
    }
        public static void main (String[] args) throws Exception {
            Scanner file = new Scanner(new File("thanh.dat"));
            int t = file.nextInt();
            while (t--> 0) {
                int r = file.nextInt();
                int c = file.nextInt();
                tSteps = 0;
                file.nextLine();
                mat = new char[r][c];
                shad = new int[r][c];
                list = new ArrayList<>();
                for (int[] thing : shad) {
                    Arrays.fill(thing, Integer.MAX_VALUE);
                }
                for (int i = 0; i < mat.length; i++) {
                    mat[i] = file.nextLine().toCharArray();
                }
                for (int i = 0; i < mat.length; i++){
                    for (int x = 0; x < mat[i].length; x++){
                        if (mat[i][x] == 'O'){
                            list.add(i);
                            list.add(x);
                        }
                    }
                }
                for (int i = 0; i < mat.length; i++) {
                    for (int x = 0; x < mat[i].length; x++) {
                        if (mat[i][x] == 'T') {
                            go(i, x, 0);
                            System.out.println(tSteps == 0 || tSteps > 30 ? "Thanh isn't great at thinking with portals." :
                                    "It took Thanh " + tSteps + " minute(s) to get to the nearest Pear Inc. Store.");
                        }
                    }
                }

            }
        }
    }

