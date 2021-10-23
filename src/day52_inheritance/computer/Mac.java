package day52_inheritance.computer;

public class Mac extends Computer{

    public Mac(int memory){
        super("Mac",78);
    }

    public String toString(){
        return "OS: " + os + " Memory: " + memory;
    }
}
