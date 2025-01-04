/*
 * 0 = equal
 * -ve = str1 is smaller
 * +ve = str2 is bigger
 */

public class g_string_compare {
    public static void main(String[] args) {
        String str1 = "My name is racecar";
        String str2 = "My string is big";

        System.out.println(str1.compareTo(str2));
    }
}
