package day24_loops;

public class CountHi {
    public static void main(String[] args) {

        String s = "aahiahiaaahi";
        int hiCounter = 0;

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == 'h' && s.charAt(i+1) == 'i'){
                hiCounter++;
            }
        }
        System.out.println(hiCounter);

        System.out.println();

        String d = "hahaha";
        int haCount = 0;

        for (int a = 0; a < d.length(); a++){

            if(d.charAt(a) == 'h' && d.charAt(a+1) ==  'a'){
                haCount++;
            }
        }
        System.out.println(haCount);

        System.out.println();
        String t = "oooheooheooohe";
        int heCount = 0;

        for(int w =0; w < t.length(); w++){

            if(t.charAt(w) == 'h' && t.charAt(w+1) == 'e'){
                heCount++;
            }
        }
        System.out.println(heCount);




    }
}
