public class b_string_functions {
    public static void main(String args[]){
        String str = "My name is Om";

        // To get length of a string, we can use .length function
        System.out.println(str.length());

        // String concatenation
        String fname = "Om";
        String lname = "Mhatre";

        String full_name = fname + " " + lname;
        System.out.println(full_name);

        // charAt Method: to find a char at a particular index of a string
        System.out.println(full_name.charAt(5));

    }
}
