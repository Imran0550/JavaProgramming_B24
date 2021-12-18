package officeHours.practice_12_08_2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalanceBrackets {


    public static boolean isBalance (String str){

        Map<Character,Character> map = new HashMap<>();
        map.put('{','}'); map.put('(',')'); map.put('[',']');
        Stack<Character> stack = new Stack<>();

        /*
        {([])}
        charAt(2) -> [
        stack:
        [
        (
        {
         */
        for(int i=0;i<str.length();i++){

            if(map.containsKey(str.charAt(i))){
                stack.push(str.charAt(i));
            }else {

                if(stack.isEmpty() ||str.charAt(i) != map.get(stack.pop()) ){ // ] != [
                       return false;
                }
            }

        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isBalance("{([])}"));
    }
}
/*
* [IQ] Create a method that will accept a String of brackets. Determine if the brackets are balanced. Brackets are balanced if the closing bracket matches the opening one.

https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues

Ex: {([])} -> balanced
    {[(])} -> not balanced
 */