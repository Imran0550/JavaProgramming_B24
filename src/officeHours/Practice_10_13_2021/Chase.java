package officeHours.Practice_10_13_2021;

public class Chase {
    public static void main(String[] args) {


        ScrumTeam scrumTeam = new ScrumTeam("Ahmad", "Imran", 6);

        ScrumTeam.companyName = "Chase";
        ScrumTeam.ceo = "JP Morgan";



Developer developer = new Developer("Sera",10263,"Senior dev", 20000);

        scrumTeam.addDeveloper(developer);

        Developer developer1 = new Developer("Imran",11,"Team lead",200000);
        scrumTeam.addDeveloper(developer1);


        Tester tester = new Tester("Imran",5673,"Senior adviser",2500000);
        Tester tester1 = new Tester("Saim",673,"instructor",2650000);

        scrumTeam.addTester(tester);
        scrumTeam.addTester(tester1);
        System.out.println(scrumTeam);
    }
}
