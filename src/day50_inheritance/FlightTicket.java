package day50_inheritance;

import officeHours.Practice_10_13_2021.Developer;

public class FlightTicket {

  private    String type;
  private   String departureLocation;
  private   String arrivalLocation;

  public FlightTicket(String type, String departureLocation, String arrivalLocation){
   setType(type);
   this.arrivalLocation = arrivalLocation;
   this.departureLocation = departureLocation;
  }

 public String getType() {
  return type;
 }

 public void setType(String type) {

   if(type.equals("first")||type.equals("business")||type.equals("economy")){
       this.type=type;
   }
 }

 public String getDepartureLocation() {
  return departureLocation;
 }

 public void setDepartureLocation(String departureLocation) {
  this.departureLocation = departureLocation;
 }

 public String getArrivalLocation() {
  return arrivalLocation;
 }

 public void setArrivalLocation(String arrivalLocation) {
  this.arrivalLocation = arrivalLocation;
 }
}
