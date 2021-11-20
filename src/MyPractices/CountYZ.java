package MyPractices;

public class CountYZ {


    public static int s(String str) {
        int count = 0;
        if (str.contains(" ")) {
            String[] arr = str.split(" ");

            for (String each : arr) {

                if (each.charAt(each.length() - 1) == 'y' || each.charAt(each.length() - 1) == 'z') {
                    count++;
                }
            }

        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(s("fez bayy bay"));
    }
}
