package day45_constructors;

public class UsingWorker {

    public static void main(String[] args) {

        Worker work = new Worker("khan", 20, 4509, false);


        System.out.println(work);
        work.isWorking();
    }
}
