package day33_multidimensional_array;

import java.util.Arrays;

public class StringMultiArray {
    public static void main(String[] args) {

        String [][] cyberTek = new String[4][];

        String  [] groupOne = {"Sergi","Imran", "Rano"};
        String [] groupTwo = {"Mubarek", "Ibrahim"};
        String [] groupThree = {"Nadi", "Saim"};
        String [] groupFour = {"Nicole", "Tach", "Khan" , "Aliva"};

        cyberTek [0] = groupOne;
        cyberTek[1] = groupTwo;
        cyberTek [2] = groupThree;
        cyberTek [3] = groupFour;

        System.out.println(cyberTek.length);
        System.out.println(Arrays.deepToString(cyberTek));

        for(String [] groups : cyberTek){
           // System.out.println(Arrays.toString(groups));
            System.out.println("Group members: ");

            for(String member : groups){
                System.out.println(member);
            }
        }


    }
}
