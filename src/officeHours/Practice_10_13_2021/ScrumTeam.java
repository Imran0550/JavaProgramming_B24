package officeHours.Practice_10_13_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {



        String productOwner;
        String scrumMaster;
        int sprintNumber;
        ArrayList<Developer> allDeveloper;

         static String companyName;
         static String ceo;

         public ScrumTeam (int sprintNumber){
             this.sprintNumber = sprintNumber;

             allDeveloper = new ArrayList<>();

         }

    public ScrumTeam(String productOwner, String scrumMaster, int sprintNumber, ArrayList<Developer> allDeveloper) {
         this(sprintNumber);
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
      this.allDeveloper.addAll(allDeveloper);


    }
    public void addDeveloper(Developer developer){
             allDeveloper.add(developer);
    }
    public void addDeveloper(Developer [] developers){

             allDeveloper.addAll(Arrays.asList(developers));

    }
}
/*
   Attributes:
                            PO, BA, SM,
                            all developers, all testers (ArrayLists)
                            sprintNumber

                    static: company name, ceo name

                Constructor:
                    - sets only the sprint number
                    - overload to set sprint number, the names of PO, BA, SM, and creates ArrayList objects

                Actions:

                   addTester(Tester tester): adds the given tester to the testers arraylist

                   addTesters(Tester[] testers): adds the given testers to the testers arraylist

                   addDeveloper(Developer developer): adds the given developer to the developers arraylist

                   addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

                   removeTester(long employeeID): removes the given tester from the testers arraylist

                   removeDeveloper(long employeeID): removes the developer from the developers arraylist

                   toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */
