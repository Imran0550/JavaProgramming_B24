package interviewtasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveFromList {

    public static ArrayList<String> names (ArrayList<String> name){

        for(int i=0;i<name.size();i++){
            if(name.get(i).equals("Ahmed")){
                name.remove(name.get(i));
            }
        }
return name;
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed","Kahn","Imran","Humaira","Ahmed"));
        System.out.println(names(names));
    }
}
