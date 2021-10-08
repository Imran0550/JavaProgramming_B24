package officeHours.practice_10_07_2021;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class LameDB {

    public static String lameDb(String db, String op, String id, String data) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(db.split("#")));
        // takes the db String and converts it to a String array that is used in the Array.asList method to give us ArrayList.

        int numId = Integer.parseInt(id);

   switch (op){

       case "add":
           if(numId > list.size()){
               list.add(id + data);

           }else {
            list.add(numId-1, id+data);

            for(int i=0;i<list.size();i++){
                String each = list.get(i+1).substring(1);
                list.set(i,each);
            }
           }

           break;
       case "edit":
           list.set(numId-1,id + data);
           break;
       case "delete":
           list.remove(numId-1);
   }
// the numid -1 is how we convert the id number from the method params, to the index number we can use with ArrayLsit.

        String result = list.toString();

   return result.substring(1,result.length()-1).replace(", ", "#");







    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //  System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
        System.out.println(lameDb("1test#2bla#3foo","edit","2","bbb"));
    }
}
