import java.util.*;

public class PrintMinNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 231};
        System.out.println(printminnumber(numbers));
    }

    public static String printminnumber(int[] numbers) {
        Comparator<String> cmp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    for (int i = 0; i < s2.length(); i++) {
                        if (s1.charAt(i) > s2.charAt(i))
                            return 1;
                        else return -1;
                    }
                    return 0;
                }
                String ab = s1 + s2;
                String ba = s2 + s1;
                for (int i = 0; i < ab.length(); i++) {
                    if (ab.charAt(i) > ba.charAt(i))
                        return 1;
                    else {
                        if (ab.charAt(i) < ba.charAt(i))
                            return -1;
                    }
                }
                return 0;
            }
        };
        if (numbers.length <= 0)
            return "";
        String[] tmp = new String[numbers.length];
        for (int i = 0; i < tmp.length; i++)
            tmp[i] = String.valueOf(numbers[i]);
        Arrays.sort(tmp, cmp);
        String res="";
        for (String str : tmp)
            res+=str;
        return res;
    }
}


