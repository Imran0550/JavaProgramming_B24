package giventasks;

import java.util.ArrayList;

public class TestModule {

    public static void main(String[] args) {

        Module module1 = new Module();

        File note = new File("b24 Students",200);

        module1.files.add(note);

        System.out.println(module1.files.get(0));
module1.files.get(0).openFile();
        /*

             ArrayList<String> list
             list.get(0).charAt(0)
*/


        module1.files.add(new File("pdf", 0.5));

        System.out.println(module1.files);

    }
}
