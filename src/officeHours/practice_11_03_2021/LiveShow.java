package officeHours.practice_11_03_2021;

public class LiveShow extends Entertainment{

    String location;

     public LiveShow(String company, String location){
         super("Live Show",company);
     }

}
/*
create a class LiveShow
-> call super constructor

-> LiveShow is a child of Entertainment
instance variables:
- location (String)
constructor:
- initialize name, company, and location
-> call super constructor
-> hint: name value will be 'Live Show' for all subclasses
 */