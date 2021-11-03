package day54_abstraction.Mobile;

public class Instagram extends MobileApp {

   public void postPhoto(){
       System.out.println("Posting picture");
   }
   @Override
    public void useApp(int minutes){
       super.useApp(minutes);
       postPhoto();
   }
}
/*
What are we inherit?
the variables are not inherited

all the public methods (getters and setters)
 */