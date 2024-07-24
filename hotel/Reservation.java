package hotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {
     private String id;
     private LocalDate checkInDate;
     private LocalDate checkOutDate;
     Reservation(){}
     Reservation(LocalDate checkInDate, LocalDate checkOutDate){
         this.checkInDate = checkInDate;
         this.checkOutDate = checkOutDate;
     }
     public void setId(String id,int rn) {
         this.id = id+"@"+Integer.toString(rn);
     }

    public LocalDate getCheckInDate() {
         return checkInDate;
    }
    public void setCheckInDate(LocalDate checkInDate) {
         this.checkInDate = checkInDate;
    }
    public long numOfDays(LocalDate checkin,LocalDate checkout){
        long days = ChronoUnit.DAYS.between(checkin, checkout);
         return days;
    }

    public void getReservationDetails() {
         //Room room = new Room();
         System.out.println("Your reservation id is: "+id);
         System.out.println("Check in date : "+checkInDate);
         System.out.println("Check out date : "+checkOutDate);
         //System.out.println("The amount paid is : "+room.price(checkInDate,checkOutDate,));
     }

}
