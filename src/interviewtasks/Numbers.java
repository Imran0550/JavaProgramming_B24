package interviewtasks;

public class Numbers {

    public static void EachNumber(){
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0&&i%15==0){
                System.out.println("DivisibleBY15 \n" + i);
            }else if(i%3==0 && i%15!=0){
                System.out.println("DivisibleBy3 \n" + i);
            }else if(i%5==0 && i%15!=0){
                System.out.println("DivisibleBy5 \n" + i);

            }

        }
    }

    public static void main(String[] args) {
        EachNumber();
    }
}
