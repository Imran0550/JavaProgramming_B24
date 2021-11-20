package day57_polymorphism.driver;

public class Web {
    public static void main(String[] args) {

        // How can I make Link object?

        // reference of itself

        Link link1 = new Link();
        link1.sendKeys("Hello");
        link1.click();
        System.out.println(link1.getText());
        System.out.println(link1.getUrl());

       // with the reference of link (itself) we are able to access 4 methods including getUrl()

        // reference of the interface that is implemented

        WebElement link2 = new Link();

        link2.sendKeys("Hello");
        link2.click();
        System.out.println(link2.getText());
       // System.out.println(link2.getUrl()); WebElement reference does not know what getUrl is

        WebElement [] allLinks = new Link[2];
        allLinks[0] = link1;
        allLinks[1] = link2;

        WebElement [] elements = new WebElement[3];
        elements[0] = link1;


    }
}
