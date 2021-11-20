package giventasks.saimtasks;

public class Samsung extends Phone implements AndroidApps{


    @Override
    public void insertMemoryCard() {
        System.out.println("Inserting memory card");
    }

    @Override
    public void calling() {
        System.out.println("Calling....");
    }

    @Override
    public void texting() {
        System.out.println("texting.....");
    }

    @Override
    public void download() {
        System.out.println("is downloading.....");
    }
}
