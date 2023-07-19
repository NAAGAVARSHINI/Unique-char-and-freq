import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

    static void count(String str) {
        int n = str.length();
        Map<Character, Integer> mp = new HashMap<>();
        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(str.charAt(i))) {
                mp.put(str.charAt(i), mp.get(str.charAt(i)) + 1);
            } else {
                mp.put(str.charAt(i), 1);
            }
        }
        int count = 0;
        // Traverse through map and print frequencies
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            count += 1;
            //System.out.println(entry.getKey() +" "+ entry.getValue()); To get Frequency

        }
        //System.out.println(count); To get unique characters

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        count(str);

    }
}