import java.util.*;

public class a_input_output{
    public static void main(String args[]){
        char arr[] = {'a', 'b', 'c'};
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();
        System.out.println("String is: " + name);
    }
}