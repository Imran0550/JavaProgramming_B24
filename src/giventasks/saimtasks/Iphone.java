package giventasks.saimtasks;

public class Iphone extends Phone implements AppleApps{


    @Override
    public void faceTime() {
        System.out.println("Facetime....");
    }


    @Override
    public void calling() {
        System.out.println("Calling.....");
    }

    @Override
    public void texting() {
        System.out.println("Texting......");
    }

    @Override
    public void download() {
        System.out.println("downloading......");
    }
}
