package giventasks;

import java.util.ArrayList;

public class Module {

    ArrayList<File> files;

    public Module(){
        this.files = new ArrayList<>();
    }
    public Module(ArrayList<File> files){

        this();//chaining because we already have it initialized
        this.files.addAll(files);

    }


}
