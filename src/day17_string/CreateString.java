package day17_string;



public class CreateString {
    public static void main(String[] args) {

        String first = "java"; // String literal
        // create a String object int the String pool

       //  String second = new String(original:"java");
        // Create a String object in the heap, Not the string pool

        System.out.println(first == first); // == with String does not check the value
        // It checks the memory location and compare them
    }


}
