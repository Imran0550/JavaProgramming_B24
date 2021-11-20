package day57_polymorphism.driver;

public class Google {

    public static void main(String[] args) {

        WebElement alm1 = new Link();

        WebElement alm2 = new Input();

        WebDriverUtil.clickElement(alm1);

        WebDriverUtil.clickElement(alm2);

    }
}
