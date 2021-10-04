package day21_loops;

public class SMSParts {
    public static void main(String[] args) {

        /*
        Given a String in the following format:“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}” Separate these parts and print them separately: Sender: actualSenderNumber: actualNumberMessage: actualMessage”;

       1) we need to find all the index
                - sender find the index of < and >
                - number find the index of the [ and ]
                - message find the index of the { and }

        2) with our indexes we can now pull from the String with substring0

         */

        String msg = "sender: <James bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";

        int indexOfSenderBegin = msg.indexOf("<");
        int indexOfSenderClosing = msg.indexOf(">");

        int indexOfNumberBegin = msg.indexOf("[");
        int indexOfNumberClose = msg.indexOf("]");

        int indexOfMsgBegin = msg.indexOf("{");
        int indexOfMsgClose = msg.indexOf("}");

        String sender = msg.substring(indexOfSenderBegin + 1,indexOfSenderClosing);
        System.out.println("Sender: " + sender);

        String number = msg.substring(indexOfNumberBegin + 1, indexOfNumberClose);
        System.out.println("Number: " + number);

        String message = msg.substring(indexOfMsgBegin + 2, indexOfMsgClose);
        System.out.println(message);

    }
}
