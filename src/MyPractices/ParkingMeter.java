package MyPractices;

public class ParkingMeter {

    int timeLeft =0;
    int maxTime;

public ParkingMeter(int maxTime){
    this.maxTime = maxTime;
}



    public  boolean add(int a){

        if(a ==25 && timeLeft < maxTime){
            timeLeft +=30;

            return true;
        }
        return false;
    }
    public void  trick(){

        if(timeLeft >1){
            timeLeft--;
        }
    }

    public boolean isExpired(){
        if(timeLeft ==0) return true;

        return false;
    }
}
