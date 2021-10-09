package day48_static;

public class MoreChaining {

    public MoreChaining(){
        System.out.println(false);
    }

    public MoreChaining(int i){
       // MoreChaining(); we cannot use the name to call another constructor, we would use this();
        this();
    }
    public MoreChaining(String s){
        this(5);
//        this(s.length());
        System.out.println("String one");
//        this(5); any this() call needs to be the first line always
    }
}
