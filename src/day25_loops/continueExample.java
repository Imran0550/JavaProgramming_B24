package day25_loops;

public class continueExample {
    public static void main(String[] args) {

        for(int i =0; i < 100; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i =0; i < 100; i++){
            if(i%2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }


        for(int i =0; i < 100; i++){
            if(i%2 == 1){
                continue;
            }
            System.out.print(i + " ");
        }


    }
}
