package day52_inheritance.computer;

public class Lab {
    public static void main(String[] args) {

        Windows window = new Windows(87);

        Windows computer = new Windows(1000);

        System.out.println(computer.os);
        System.out.println(computer.memory);
        System.out.println();
        System.out.println(window.memory);
        System.out.println(window.os);

        System.out.println(computer);

        Mac mac = new Mac(2000);
        System.out.println(mac);

    }
}
