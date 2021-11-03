package day53_inheritance.rules;

public class C extends A{

    @Override
    public int getNum(){
        return 6;
    }

    // getName method cannot change access modifier because it is public, and they can only be made more accessible in the override;
    @Override
   public String getName(){
        return "str";
    }
    // getName method can be changed
}
