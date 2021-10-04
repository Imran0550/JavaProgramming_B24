package day28_nested_loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class ReverseSecond {
    public static void main(String[] args) {
        /*
        Saim — Today at 7:30 PM
Reverse only second word
Given a String with three words separated by spaces. Reverse only the second word and return the modified String
Ex:
I love java
         */

        String s = "I love java";
        String fixedStr = "";

        for(int i =0; i < s.length(); i++){

            if(s.charAt(i) == ' '){
                String reverse = "";
                for(int j = s.lastIndexOf(' '); j >= i; j--){
                    reverse += s.charAt(j);
                }
                fixedStr += reverse;
                i = s.lastIndexOf(' ');




            }else{
                fixedStr += s.charAt(i);

            }

        }
        System.out.println(fixedStr);

    }
}
