package MyPractices;

public class Worker {

    String name;
    int age;
    int batchNum;
    boolean isAvailableWeekend;


    public Worker(String str, int age1,int batch, boolean available){

        name = str;
        age = age1;
        batchNum = batch;
     isAvailableWeekend = available;





    }
    public void isWorking(){

        System.out.println(name + " is working at walmart");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNum=" + batchNum +
                ", isAvailableWeekend=" + isAvailableWeekend +
                '}';
    }
}
