package day54_abstraction.Mobile;

public class discord extends MobileApp {

    public void chat(){
        System.out.println("Chatting on " + getName());

    }
    // chat method is like postPhoto  method in Instagram - just an extra instance method unique to the child class

    @Override
    public void useApp(int minutes){
        super.useApp(minutes);
        chat();

    }

}
