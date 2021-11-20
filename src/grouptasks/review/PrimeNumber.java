package grouptasks.review;

public class PrimeNumber {
    //What is a prime number
    // prime number is any number that is divisable only by  1 and and itself

    public static boolean isPrime(int num){
        boolean is = false;

        for(int i =3 ;i<num;i++){
            if(num % i == 0){
                is = false;
                break;
            }
        }
is = true;

        return is;

    }

    public static void main(String[] args) {
        System.out.println(isPrime(101));
    }
}
