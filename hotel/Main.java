package hotel;

import java.util.Scanner;
import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the type of room : ");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        Room room = new Room();
        Reservation reserve = new Reservation();
        Room[] rooms = Room.setMem();
        System.out.println("Rooms available are: ");
        if(type.equals("deluxe")) {
            for(int i=0; i<5; i++) {
                if(rooms[i].getIsAvailable())
                    System.out.println(rooms[i].getRoomNo());
            }
        }
        else if(type.equals("super deluxe")) {
            for(int i=5; i<10; i++) {
                if(rooms[i].getIsAvailable())
                    System.out.println(rooms[i].getRoomNo());
            }
        }
        else {
            System.out.println("Invalid type");
        }
        System.out.println("Enter the room number you want to make reservation: ");
        int rn = sc.nextInt();
        System.out.println("To confirm reservation type yes else no");
        String confirm = sc.next();
        if (confirm.equals("yes")) {
            System.out.println("Enter your name: ");
            String name = sc.next();
            System.out.println("Enter check in date : ");
            System.out.println("Enter year : ");
            int year = sc.nextInt();
            System.out.println("Enter month : ");
            int month = sc.nextInt();
            System.out.println("Enter day : ");
            int day = sc.nextInt();
            LocalDate checkin = LocalDate.of(year, month, day);
            System.out.println("Enter check out data : ");
            System.out.println("Enter year : ");
            year = sc.nextInt();
            System.out.println("Enter month : ");
            month = sc.nextInt();
            System.out.println("Enter day : ");
            day = sc.nextInt();
            LocalDate checkout = LocalDate.of(year, month, day);
            reserve = new Reservation(checkin, checkout);
            reserve.setId(name, rn);
            double amount = room.price(checkin, checkout, type);
            System.out.println("The amount you have to pay is : " + amount);
            System.out.println("Your reservation is successfully made");

        } else {
            System.out.println("Reservation canceled!!");
        }
        System.out.println("If you wanted to view reservation details enter yes else no");
        String type2 = sc.next();
        if (type2.equals("yes")) {
            reserve.getReservationDetails();
        }

    }

}


















        /*System.out.println("Rooms available are: ");
        if (type.equals("deluxe")) {
            int[] r = Room.set_Mem(type);
            for (int i : r) {
                System.out.println(i);
            }
        }
        else{
            int[] r = Room.set_Mem(type);
            for(int i=5;i<10;i++){
                System.out.println(i);
            }
        }
        System.out.println("Enter the room number you want to make reservation: ");
        int rn = sc.nextInt();
        System.out.println("To confirm reservation type yes!!");
        String type1 = sc.next();
        if(type1.equals("yes")){
            int no=rn-1;
            System.out.println("Enter your name: ");
            String name = sc.next();
            //room.setReservationId(name,no);
            String name1=name.concat("@123");
            reserve.setId(name1);
            System.out.println("Enter check in data(dd/MM/yyyy) : ");
            String checkIn = sc.next();
            reserve.setCheckInDate(checkIn);
            System.out.println("Enter check out data(dd/MM/yyyy) : ");
            String checkOut = sc.next();
            reserve.setCheckOutDate(checkOut);
            System.out.println("Your reservation is successfully made");
            //room.setAvailable(false,no);
        }
        else{
            System.out.println("Reservation canceled!!");
        }
        System.out.println("If you wanted to view reservation details enter yes!!");
        String type2 = sc.next();
        if(type2.equals("yes")){
            reserve.getReservationDetails();
            //System.out.println("Your reservation id is: "+Id);
        }

         */




