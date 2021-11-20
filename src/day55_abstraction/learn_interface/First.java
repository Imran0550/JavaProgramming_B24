package day55_abstraction.learn_interface;

public interface First{

    public abstract void write(); // public abstract part is grey, because you don't need it, all methods are public abstract by default

    void read();
}

class book implements First{

    @Override
    public void write() {

    }

    @Override
    public void read() {

    }
}

