package officeHours.constructors;

public class ComputerStore {
    public static void main(String[] args) {


        Computer computer = new Computer(2000_00, "Apple", "White");
        System.out.println(computer);
        System.out.println(  Computer.hasScreen);
        Computer.hasScreen = false;
        System.out.println(Computer.hasScreen);
        System.out.println(computer.hasScreen);
    }
}
