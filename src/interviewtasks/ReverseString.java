package interviewtasks;

public class ReverseString {

    public static String word(String str){
        String reverse = "";
        String result = "";

        for(int i =str.length()-1;i>=0;i--){
            reverse += str.charAt(i);

        }

        if(reverse.equals(str)){
            result = "Palindrome";
        }else {
            result = "Not palindrome";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(word("kick"));
        System.out.println(word("mom"));
        System.out.println(word("dad"));
    }
}
